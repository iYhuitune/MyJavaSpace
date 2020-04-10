package com;

import com.test.demo.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MemoryDemo extends Thread{
    public static void main(String[] args) {


        Runnable runnable = () -> {
            List slist = new ArrayList();
            while (true){
                for (int i = 0; i < 100000; i++) {
                    byte[] b = new byte[1024];
                    slist.add(b);
                }
                System.out.println("运行中"+Thread.currentThread());
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        Thread t = new Thread(runnable);
        t.start();
        System.out.println(" "+t.getId()+" "+t.getName()+ " "+t.isAlive() +" "+ t.getStackTrace());
    }
}
