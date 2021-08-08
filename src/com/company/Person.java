package com.company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") to get diffrent instance
public class Person implements IPerson{


    @Value("${prop.wlc}")
    private String wlc;
    @Value("${prop.sport}")
    private String sport;
    private IPersonService iPersonService;

    public Person(IPersonService iPersonService){
        this.iPersonService = iPersonService;
    }

    private String name = "dude";

    public String getPersonneName(){
        return this.iPersonService.getSomething();
    }

    public String getInjectedValue(){
        return wlc+" --- "+  sport;
    }

    @Override
    public void setPersonName(String name) {
        this.name = name;
    }

}
