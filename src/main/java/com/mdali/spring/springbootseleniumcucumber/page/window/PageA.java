package com.mdali.spring.springbootseleniumcucumber.page.window;

import com.mdali.spring.springbootseleniumcucumber.page.Base;
import com.mdali.spring.springbootseleniumcucumber.kelvin.annotation.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Window("Page A")
public class PageA extends Base {

    @FindBy(id = "area")
    private WebElement textArea;

    public void addToArea(final String msg){
        this.textArea.sendKeys(msg);
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.textArea.isDisplayed());
    }
}
