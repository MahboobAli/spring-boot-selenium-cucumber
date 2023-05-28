package com.mdali.spring.springbootseleniumcucumber.googletest;

import com.mdali.spring.springbootseleniumcucumber.SpringBaseTestNGTest;
import com.mdali.spring.springbootseleniumcucumber.kelvin.annotation.LazyAutowired;
import com.mdali.spring.springbootseleniumcucumber.kelvin.service.ScreenshotService;
import com.mdali.spring.springbootseleniumcucumber.page.google.GooglePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Google2Test extends SpringBaseTestNGTest {

    @LazyAutowired
    private GooglePage googlePage;

    @LazyAutowired
    private ScreenshotService screenshotService;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.getSearchComponent().search("selenium");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 25);
        this.screenshotService.takeScreenShot();
        this.googlePage.close();
    }

}
