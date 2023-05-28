package com.mdali.spring.springboot.selenium.cucumber.page.google;

import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.PageFragment;
import com.mdali.spring.springboot.selenium.cucumber.page.Base;
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
