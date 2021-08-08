package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {

    public static void main(String[] args) {
        /**
         to lanuch this comment out the component scan from the config file
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SomeClassA.class);
        /**
         *         we dont need to read form XML using the ClassPathXmlApplicationContext
         *         Instead Read Spring Java Configuration class
         */
        IPerson person1 = context.getBean("nicePerson",IPerson.class);
        System.out.println(person1.getPersonneName());
        System.out.println(person1.getInjectedValue());
        context.close();

    }
}
