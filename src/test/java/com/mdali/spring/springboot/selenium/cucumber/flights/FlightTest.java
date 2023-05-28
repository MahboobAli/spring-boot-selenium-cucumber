package com.mdali.spring.springboot.selenium.cucumber.flights;

import com.mdali.spring.springboot.selenium.cucumber.SpringBaseTestNGTest;
import com.mdali.spring.springboot.selenium.cucumber.page.flights.FlightPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightTest extends SpringBaseTestNGTest {

    @Autowired
    private FlightPage flightPage;

    @Autowired
    private FlightAppDetails appDetails;

    @Test
    public void flightTest(){
        this.flightPage.goTo(this.appDetails.getUrl());
        Assert.assertTrue(this.flightPage.isAt());
        Assert.assertEquals(this.flightPage.getLabels(), this.appDetails.getLabels());
    }

}
