package com.mdali.spring.springbootseleniumcucumber.flights;

import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = "app.locale=en")
public class EnTest extends FlightTest{
}
