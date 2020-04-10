package com;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;

public class ZKTest {

    //zookeeper地址。集群时使用逗号分隔
    private static final String zkServers = "39.99.164.171:2181";

    public static void main(String[] args) {
        //创建会话
        ZkClient zkClient = new ZkClient(zkServers, 30000);

        //创建节点
        String path = "/myzk4";
        String data = "hello zookeeper!";
        //zkClient.createPersistent(path);
        //zkClient.createEphemeral(path);
        zkClient.create(path, data, CreateMode.PERSISTENT);

        System.out.println("是否存在"+path+"节点：" + zkClient.exists(path));

        //列出根下所有节点
        System.out.println("根下拥有的子节点：" + zkClient.getChildren("/"));

        //读取节点的数据
        System.out.println(java.util.Optional.ofNullable(zkClient.readData(path)));

        //修改节点数据
        //zkClient.writeData(path, "world");
        System.out.println(java.util.Optional.ofNullable(zkClient.readData(path)));

        //删除节点
        //zkClient.delete(path);
        //zkClient.delete(path, 1);//删除指定版本号的节点
        //zkClient.deleteRecursive(path);//级联删除所有子节点

        //System.out.println("删除节点后：" + zkClient.getChildren("/"));

        //关闭客户端连接
        if (zkClient != null) {
            zkClient.close();
        }
    }
}
