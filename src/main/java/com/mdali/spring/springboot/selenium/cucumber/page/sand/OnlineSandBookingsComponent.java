package com.mdali.spring.springboot.selenium.cucumber.page.sand;

import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.PageFragment;
import com.mdali.spring.springboot.selenium.cucumber.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageFragment
public class OnlineSandBookingsComponent extends Base {

    @FindBy(xpath = "//a[normalize-space()='Online Sand Bookings']")
    private WebElement onlineSandBookings;

    /*@FindBy(xpath = "//a[normalize-space()='Online Sand Bookings']")
    private List<WebElement> searchBtns;*/

    public void clickOnlineSandBookings(){
        //this.searchBox.sendKeys(keyword);
        //this.searchBox.sendKeys(Keys.TAB);
        this.onlineSandBookings.click();
    }

    @Override
    // it waits until Online Sand Bookings is displayed
    public boolean isAt() {
        return this.wait.until((d) -> this.onlineSandBookings.isDisplayed());
    }
}
