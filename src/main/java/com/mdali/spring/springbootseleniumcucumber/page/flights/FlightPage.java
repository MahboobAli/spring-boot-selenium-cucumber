package com.mdali.spring.springbootseleniumcucumber.page.flights;

import com.mdali.spring.springbootseleniumcucumber.kelvin.annotation.Page;
import com.mdali.spring.springbootseleniumcucumber.kelvin.annotation.TakeScreenshot;
import com.mdali.spring.springbootseleniumcucumber.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

@Page
public class FlightPage extends Base {

    @FindBy(css = "nav.rlGvde a")
    private List<WebElement> elements;

    public void goTo(final String url){
        this.driver.get(url);
        this.driver.manage().window().maximize();
    }

    @TakeScreenshot
    public List<String> getLabels(){
       return this.elements
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> !this.elements.isEmpty());
    }

}
