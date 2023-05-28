package com.mdali.spring.springboot.selenium.cucumber.googletest;

import com.mdali.spring.springboot.selenium.cucumber.SpringBaseTestNGTest;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.testng.annotations.Test;

public class MultiBrowserTest extends SpringBaseTestNGTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void browserTest(){
        this.ctx.getBean("chromeDriver", WebDriver.class).get("https://www.google.com");
        this.ctx.getBean("firefoxDriver", WebDriver.class).get("https://www.yahoo.com");
    }

    /**
     * 01. comment line 18 and 25 in WebDriverConfig before running this MultipleBrowserTest
     * */

}
