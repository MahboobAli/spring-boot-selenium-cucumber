package com.mdali.spring.springboot.selenium.cucumber.page.sand;

import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.PageFragment;
import com.mdali.spring.springboot.selenium.cucumber.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageFragment
public class SandLoginComponent extends Base {

    @FindBy(xpath = "//input[@id='iARtE']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='KFebB']")
    private WebElement password;

    @FindBy(xpath = "//img[@id='imgCaptcha']")
    private WebElement captchaImage;

    @FindBy(xpath = "//input[@id='txtEnterCode']")
    private WebElement captchaEnterTextBox;

    @FindBy(xpath = "//button[@id='btnLogin']")
    private WebElement loginBtn;

    public void login(String username, String password, String captchaEnterTextBox){
        this.userName.sendKeys(username);
        this.password.sendKeys(password);
        this.captchaEnterTextBox.sendKeys(captchaEnterTextBox);
        this.loginBtn.click();
        //this.searchBox.sendKeys(keyword);
        //this.searchBox.sendKeys(Keys.TAB);
        //this.loginBtn.click();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.loginBtn.isDisplayed());
    }
}
