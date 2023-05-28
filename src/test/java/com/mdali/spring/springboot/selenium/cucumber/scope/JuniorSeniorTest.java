package com.mdali.spring.springboot.selenium.cucumber.scope;

import com.mdali.spring.springboot.selenium.cucumber.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class JuniorSeniorTest extends SpringBaseTestNGTest {

    @Autowired
    private JuniorEngg junior;

    @Autowired
    private SeniorEngg senior;

    @Test
    public void scopeTest(){
        this.junior.setAmount(100);
        System.out.println("Junior :: " + this.junior.getSalary().getAmount());
        this.senior.setAmount(200);
        System.out.println("Senior :: " + this.senior.getSalary().getAmount());
        System.out.println("Junior :: " + this.junior.getSalary().getAmount());
    }

}
