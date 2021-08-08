package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SomeClassA.class);
        /**
         *         we dont need to read form XML using the ClassPathXmlApplicationContext
         *         Instead Read Spring Java Configuration class
         */
        IPerson person1 = context.getBean("person",IPerson.class);

        System.out.println(person1.getPersonneName());
        person1.setPersonName("Buddy");

        IPerson person2 = context.getBean("person",IPerson.class);
        System.out.println(person2.getPersonneName());

        // close the context
        context.close();

    }
}
