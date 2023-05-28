package com.mdali.spring.springboot.selenium.cucumber.googletest;

import com.mdali.spring.springboot.selenium.cucumber.SpringBaseTestNGTest;
import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.LazyAutowired;
import com.mdali.spring.springboot.selenium.cucumber.kelvin.service.ScreenshotService;
import com.mdali.spring.springboot.selenium.cucumber.page.google.GooglePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Google1Test extends SpringBaseTestNGTest {

    @LazyAutowired
    private GooglePage googlePage;

    @LazyAutowired
    private ScreenshotService screenshotService;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.getSearchComponent().search("spring boot");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenshotService.takeScreenShot();
        this.googlePage.close();
    }

}
