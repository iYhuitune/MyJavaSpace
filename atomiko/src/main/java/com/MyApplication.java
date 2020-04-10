package com;


import com.sun.org.apache.bcel.internal.util.ClassPath;
import com.test.controller.PubCustController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PubCustController jtaService = context.getBean("pubCustInfoController", PubCustController.class);
        //jtaService.insert();

        Runnable runnable = () ->{
            jtaService.insert();
        };

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(jtaService,"线程==["+i+"]==运行中");
            thread.start();
        }


    }
}
