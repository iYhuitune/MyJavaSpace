package com.test.cloudlock;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.apache.commons.lang3.StringUtils;
import org.apache.zookeeper.CreateMode;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ZKCloudLock implements Runnable,Lock{

    private CountDownLatch cdl ;

    int resource ;

    Lock lock = new ReentrantLock();

    private static final String zkServers = "127.0.0.1:2181";

    private String root_lock = "/LOCK";
    private String path =  "";
    private String beforePath =  "";

    private ZkClient zkClient = new ZkClient(zkServers, 3000);


    public ZKCloudLock(CountDownLatch cdl,int resource ){
        if(!zkClient.exists(root_lock)){
            zkClient.createPersistent(root_lock);
        }
        this.cdl = cdl;
        this.resource = resource;
    }

    @Override
    public void run() {
         String data = "lock";
        try {
            lock.lock();
            this.lock();
             if(!zkClient.exists(path)){
                cdl.await();
                if(resource > 0 ){
                    Thread.sleep(10);
                    resource -- ;
                }
            }
            System.out.println("当前线程: "+Thread.currentThread().getName()+" resource="+resource);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            this.unlock();
            lock.unlock();
         }
    }

    @Override
    public void lock() {
        if(tryLock()){
            System.out.println("获得锁");
        } else {
            // 尝试加锁
            // 进入等待 监听
            waitForLock();
            // 再次尝试
            this.lock();
        }
    }

    private void waitForLock() {

        IZkDataListener listener = new IZkDataListener() {
            public void handleDataChange(String s, Object o) throws Exception {
            }

            public void handleDataDeleted(String s) throws Exception {
                System.out.println(Thread.currentThread().getName() + ":监听到节点删除事件！---------------------------");
                cdl.countDown();
            }
        };
        // 监听
        this.zkClient.subscribeDataChanges(beforePath, listener);
        if (zkClient.exists(beforePath)) {
            try {
                System.out.println("加锁失败 等待");
                cdl.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 释放监听
        System.out.println("释放监听");

        zkClient.unsubscribeDataChanges(beforePath, listener);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public synchronized boolean tryLock() {
        // 第一次就进来创建自己的临时节点
        if (StringUtils.isBlank(path)) {
            path = zkClient.createEphemeralSequential(root_lock + "/", "lock");
        }
        System.out.println("path="+path);

        // 对节点排序
        List<String> children = zkClient.getChildren(root_lock);
        Collections.sort(children);

        // 当前的是最小节点就返回加锁成功
        if (path.equals(root_lock + "/" + children.get(0))) {
            System.out.println("获取最小节点=" + root_lock + "/" + children.get(0));
            return true;
        } else {
            // 不是最小节点 就找到自己的前一个 依次类推 释放也是一样
             beforePath = root_lock + "/" + children.get(Collections.binarySearch(children, path.substring(root_lock.length() + 1)) - 1);
        }
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        System.out.println("释放锁=" + path);
        zkClient.delete(path);
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
