package com.mdali.spring.springboot.selenium.cucumber.kelvin.config;

import com.github.javafaker.Faker;
import com.mdali.spring.springboot.selenium.cucumber.kelvin.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class FakerConfig {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }

}
