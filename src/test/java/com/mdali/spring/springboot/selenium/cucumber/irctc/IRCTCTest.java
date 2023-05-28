package com.mdali.spring.springboot.selenium.cucumber.irctc;

import com.github.javafaker.Faker;
import com.mdali.spring.springboot.selenium.cucumber.SpringBaseTestNGTest;
import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.LazyAutowired;
import com.mdali.spring.springboot.selenium.cucumber.kelvin.service.CaptchaService;
import com.mdali.spring.springboot.selenium.cucumber.kelvin.service.ScreenshotService;
import com.mdali.spring.springboot.selenium.cucumber.page.irctc.IRCTCPage;
import com.mdali.spring.springboot.selenium.cucumber.page.sand.SandPage;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.util.FileCopyUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class IRCTCTest extends SpringBaseTestNGTest {

    @LazyAutowired
    private IRCTCPage irctcPage;
    @LazyAutowired
    private CaptchaService captchaService;
    @LazyAutowired
    private ScreenshotService screenshotService;
    @Test
    public void irctcTest() throws IOException, TesseractException, InterruptedException {
        this.irctcPage.goTo();
        Assert.assertTrue(this.irctcPage.isAt());
        this.captchaService.applyCaptcha(this.screenshotService.takeScreenShot(this.irctcPage.getCaptchaComponent().getCaptchaImage()));
        //Assert.assertTrue(this.irctcPage.getCaptchaComponent().isAt()); // this needed to be handled
        Thread.sleep(2000); // it should be removed
       // this.ctx.getBean(IRCTCPage.class).close();
        this.irctcPage.close();
    }

}
