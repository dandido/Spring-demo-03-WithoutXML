package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //step 1 - create config
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.company")//step 2
public class SomeClassA {

    //define bean for IpersonService
    @Bean
    public IPersonService nicePersonService(){ // the method name is the "bean id"
        return new PersonService();
    }

    //define  Bean for Person + inject decependcy
    @Bean
    public Person nicePerson(){
        return new Person(nicePersonService());//line 13
    }

}
