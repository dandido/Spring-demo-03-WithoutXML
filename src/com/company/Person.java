package com.company;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") to get diffrent instance
public class Person implements IPerson{

    private String name = "dude";

    public String getPersonneName(){
        return this.name;
    }

    @Override
    public void setPersonName(String name) {
        this.name = name;
    }

}
