package com.mdali.spring.springboot.selenium.cucumber.page.window;

import com.mdali.spring.springboot.selenium.cucumber.page.Base;
import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Window("Page C")
public class PageC  extends Base {

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
