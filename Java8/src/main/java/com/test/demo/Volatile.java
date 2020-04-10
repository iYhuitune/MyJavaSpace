package com.test.demo;

public class Volatile {

    private Volatile v ;

    public  Volatile getInstance(){
        if(v == null){
            synchronized (Volatile.class){
                if(v == null){
                    v = new Volatile();
                }
            }
        }
        return  v;
    }


}
