package com.mdali.spring.springbootseleniumcucumber.kelvin.config;

import com.github.javafaker.Faker;
import com.mdali.spring.springbootseleniumcucumber.kelvin.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class FakerConfig {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }

}
