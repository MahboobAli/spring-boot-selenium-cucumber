package com.mdali.spring.springboot.selenium.cucumber.page.irctc;

import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.Page;
import com.mdali.spring.springboot.selenium.cucumber.page.Base;
import com.mdali.spring.springboot.selenium.cucumber.page.google.SearchComponent;
import com.mdali.spring.springboot.selenium.cucumber.page.google.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Page public class IRCTCPage extends Base {



    @Autowired private CaptchaComponent captchaComponent;

    @Value("${application.irctc.url}") private String url;

    public void goTo() {
	this.driver.get(url);
    }

    public CaptchaComponent getCaptchaComponent() {
        return captchaComponent;
    }

    @Override public boolean isAt() {
	return this.captchaComponent.isAt();
    }

    public void close() {
	this.driver.quit();
    }

}
