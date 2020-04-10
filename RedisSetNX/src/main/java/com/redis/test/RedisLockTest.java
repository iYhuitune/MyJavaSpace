package com.redis.test;

import com.redis.common.Thread1;
import com.redis.lock.Service;

public class RedisLockTest {
    public static void main(String[] args) {
        Service service = new Service();
        for (int i = 0; i < 50; i++) {
            Thread1 threadA = new Thread1(service);
            threadA.start();
        }
    }
}
