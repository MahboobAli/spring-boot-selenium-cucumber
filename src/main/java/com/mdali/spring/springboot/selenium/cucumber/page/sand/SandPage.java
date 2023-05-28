package com.mdali.spring.springboot.selenium.cucumber.page.sand;

import com.mdali.spring.springboot.selenium.cucumber.page.Base;
import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Page
public class SandPage extends Base {


    @Autowired
    private OnlineSandBookingsComponent onlineSandBookingsComponent;

    @Autowired
    private SandLoginComponent sandLoginComponent;

    @Value("${application.sand.url}")
    private String url;

    public void goTo() {
        this.driver.get(url);
    }

    public OnlineSandBookingsComponent getOnlineSandBookingsComponent() { return onlineSandBookingsComponent; }

    public SandLoginComponent getSandLoginComponent() { return sandLoginComponent; }

    @Override
    public boolean isAt() {
        return this.onlineSandBookingsComponent.isAt();
    }

    public void close() {
        this.driver.quit();
    }

}
