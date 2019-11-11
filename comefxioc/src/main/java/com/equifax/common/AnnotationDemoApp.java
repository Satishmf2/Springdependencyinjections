package com.equifax.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        //Read spring config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-annotaion-context.xml");


        //Get the bean from spring container
        Coach thecoach= (Coach) context.getBean("Thatsillycoach", Coach.class);
        //call a method on the bean
        System.out.println(thecoach.getDailyWorkout());

        //close the context
        context.close();


    }
}
