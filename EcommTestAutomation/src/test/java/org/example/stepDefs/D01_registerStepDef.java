package org.example.stepDefs;

import org.example.pages.P01_register;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class D01_registerStepDef {
    P01_register register = new P01_register();
    @Given("user go to register page")
    public void goRegisterPage()
    {
        register.registerlink().click();
    }

}