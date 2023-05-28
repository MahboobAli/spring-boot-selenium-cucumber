package com.mdali.spring.springboot.selenium.cucumber.sandtest;

import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.LazyAutowired;
import com.mdali.spring.springboot.selenium.cucumber.kelvin.service.ScreenshotService;
import com.mdali.spring.springboot.selenium.cucumber.page.sand.SandPage;
import com.mdali.spring.springboot.selenium.cucumber.SpringBaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SandTest extends SpringBaseTestNGTest {

    @LazyAutowired
    private SandPage sandPage;



    @LazyAutowired
    private ScreenshotService screenshotService;

    @Test
    public void googleTest() throws IOException {
        this.sandPage.goTo();
        Assert.assertTrue(this.sandPage.isAt());
        this.sandPage.getOnlineSandBookingsComponent().clickOnlineSandBookings();
        Assert.assertTrue(this.sandPage.getSandLoginComponent().isAt());
        this.sandPage.getSandLoginComponent().login("Mahboob Ali","dalkjfsdljlsd","1234");
        //Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenshotService.takeScreenShot();
       // this.googlePage.close();
    }

}
