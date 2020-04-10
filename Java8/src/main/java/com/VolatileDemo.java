package com;

import com.test.demo.Volatile;

public class VolatileDemo {

    private static volatile int a = 0;

    public static void main(String[] args) {
        final Volatile[] v = new Volatile[1];
         Runnable runnable = () -> {

            for (int i = 0; i < 10; i++) {
                a++ ;
                System.out.println("获取3："+a);
            }
/*            while (true){
                v[0] = new Volatile();
                Volatile temp = v[0].getInstance();
                if(temp ==null){
                    System.out.println("获取1："+temp);
                }else {
                    System.out.println("获取2："+temp);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/
        };


        for (int i = 0; i < 5; i++) {
                Thread thread = new Thread(runnable);
                thread.start();
        }
    }
}
