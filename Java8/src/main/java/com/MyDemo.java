package com;

import com.test.demo.Lambda;
import com.test.demo.MathOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyDemo {
    public static void main(String[] args) {

        MathOperator add = (int a , int b) -> a + b;

        MathOperator sub = (int a , int b) -> a - b;

        MathOperator mul = (int a ,int b) -> a*b;

        MathOperator div = (int a,int b) -> a/b;

        Lambda service = new Lambda();
        System.out.println(service.operator(1000,200,mul));

        List<String> list = Arrays.asList("1","21","11","9","32");
        Stream<String> stream = list.stream();
        list.forEach(str -> {
            System.out.println(str);
        });

        list.forEach(System.out::println);

        Runnable runnable = () -> {
            System.out.println(Thread.currentThread());
        };

        Thread t = new Thread(runnable);
        t.start();


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> mapped = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
        mapped.forEach(System.out::println);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers2.stream().reduce((x, y) -> x + y).get();
        System.out.println(sum);
    }
}
