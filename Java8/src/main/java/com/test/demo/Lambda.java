package com.test.demo;

public class Lambda {
    public int operator(int a ,int b ,MathOperator mathOperator){
        return mathOperator.operator(a, b);
    }
}
