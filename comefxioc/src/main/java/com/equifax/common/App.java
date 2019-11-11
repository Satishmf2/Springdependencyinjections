package com.equifax.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml");

        helloworld obj = (helloworld) context.getBean("helloBean");
        obj.getName();
    }
}
