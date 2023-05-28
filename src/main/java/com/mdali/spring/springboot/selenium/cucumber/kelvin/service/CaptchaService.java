package com.mdali.spring.springboot.selenium.cucumber.kelvin.service;

import com.github.javafaker.Faker;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.function.DoubleToIntFunction;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Lazy
@Service
public class CaptchaService {

    @Autowired
    private ApplicationContext ctx;

   /* @Autowired
    private ScreenshotService screenshotService;*/
    @Value("${screenshot.path}")
    private Path path;

    @Value("${captcha.regEx}")
    private String regEx;

    public String applyCaptcha(String imageName) throws IOException, TesseractException {
      //  String imageName = screenshotService.takeScreenShot();
        ITesseract tesseractImage = new Tesseract();
        String captchaString = tesseractImage.doOCR(this.path.resolve(imageName).toFile());
        System.out.println("before image OCR done :");
        System.out.println(captchaString);

        Pattern pattern = Pattern.compile(regEx);
        String realCaptcha = pattern.matcher(captchaString).results().map(mr -> mr.group()).collect(Collectors.joining());
        System.out.println("after image OCR done :");
        System.out.println(realCaptcha);
        return realCaptcha;
    }

}
