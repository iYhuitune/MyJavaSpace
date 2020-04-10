package com.thread.test;

import com.thread.service.ThreadA;

public class ThreadApplication {

    public static int resource = 0 ;

    public static void main(String[] args) {

         for(int i = 0 ;i<10; i++){
            ThreadA t = new ThreadA(resource);
            t.start();
            add(i);
            System.out.println("新建线程:" + "" +t.getName() + "  resource " + resource + " " + t.getId() + " " + t.toString());
         }
        System.out.println(resource);
    }

    public static void add(int i){
        resource = resource + i ;
    }

}
