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

    @Value("${screenshot.path}")
    private Path path;

    @Autowired
    private Faker faker;

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void irctcTest() throws IOException, TesseractException, InterruptedException {
        this.irctcPage.goTo();
        Assert.assertTrue(this.irctcPage.isAt());
        File sourceFile = this.irctcPage.getCaptchaComponent().getCaptchaImage().getScreenshotAs(OutputType.FILE);
        //File sourceFile = this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        String imageName = faker.name().firstName() + ".png";
        FileCopyUtils.copy(sourceFile, this.path.resolve(imageName).toFile());
       // return imageName;
        Assert.assertTrue( this.irctcPage.getCaptchaComponent().isAt());

        this.captchaService.applyCaptcha(imageName);
        Thread.sleep(1000);
        this.ctx.getBean(IRCTCPage.class).close();
        //this.irctcPage.close();
        //Assert.assertTrue(this.sandPage.getSandLoginComponent().isAt());// this wait for timer to end and once submit button is visible
        //this.sandPage.getSandLoginComponent().login("Mahboob Ali","dalkjfsdljlsd","1234");// it fires login information
        //Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        //this.screenshotService.takeScreenShot();
       // this.googlePage.close();
    }

}
