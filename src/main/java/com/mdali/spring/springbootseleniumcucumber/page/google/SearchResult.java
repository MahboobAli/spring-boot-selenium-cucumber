package com.mdali.spring.springbootseleniumcucumber.page.google;

import com.mdali.spring.springbootseleniumcucumber.kelvin.annotation.PageFragment;
import com.mdali.spring.springbootseleniumcucumber.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@PageFragment
public class SearchResult extends Base {

    @FindBy(css = "div.g")
    private List<WebElement> results;

    public int getCount(){
        return this.results.size();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> !this.results.isEmpty());
    }

}
