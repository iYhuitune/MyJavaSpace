package com.thread.service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ThreadA extends Thread{

    public int i ;

    public ThreadA(int i){
        this.i = i;
    }

    @Override
    public void run() {
        this.i ++ ;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
