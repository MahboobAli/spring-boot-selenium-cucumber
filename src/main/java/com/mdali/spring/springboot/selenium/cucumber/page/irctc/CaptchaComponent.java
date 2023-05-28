package com.mdali.spring.springboot.selenium.cucumber.page.irctc;

import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.PageFragment;
import com.mdali.spring.springboot.selenium.cucumber.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@PageFragment
public class CaptchaComponent extends Base {

    @FindBy(xpath = "//body//img")
    //@FindBy(xpath = "//body//img")
    private WebElement captchaImage;

    public WebElement getCaptchaImage() {
        return this.captchaImage;
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.captchaImage.isDisplayed());
    }
}
