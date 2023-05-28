package com.mdali.spring.springboot.selenium.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.mdali.spring.springboot.selenium.cucumber.bdd",
        tags =  "@visa",
        plugin = {
                "pretty",
                "html:target/cucumber/report.html"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
