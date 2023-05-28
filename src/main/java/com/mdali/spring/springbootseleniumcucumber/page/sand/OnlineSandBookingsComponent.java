package com.mdali.spring.springbootseleniumcucumber.page.sand;

import com.mdali.spring.springbootseleniumcucumber.kelvin.annotation.PageFragment;
import com.mdali.spring.springbootseleniumcucumber.page.Base;
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
    public boolean isAt() {
        return this.wait.until((d) -> this.onlineSandBookings.isDisplayed());
    }
}
