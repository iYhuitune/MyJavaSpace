package com;

import com.test.cloudlock.ZKCloudLock;

import java.util.concurrent.CountDownLatch;

public class Application {

    public static  int resource = 10;
    public final static int num = 10;
    private static CountDownLatch cdl = new CountDownLatch(num);

    public static void main(String[] args) {

        ZKCloudLock zkCloudlock = new ZKCloudLock(cdl , resource);

        for(int i = 0 ;i<num; i++){
            Thread t = new Thread(zkCloudlock);
            t.start();
            cdl.countDown();
         }
        System.out.println(resource);
    }
}
