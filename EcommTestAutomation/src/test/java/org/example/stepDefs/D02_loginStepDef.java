package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.example.pages.P02_login;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login() ;
    @Given("user go to login page")
    public void goLoginPage()
    {
        login.loginLink().click();
    }
    @When("user login with valid account data")
    public void enterValidLogData()
    {
        login.emailLogin().sendKeys("test@example.com");
        login.passwordLogin().sendKeys("P@ssw0rd");
    }
    @And("user press login button")
    public void loginClick()
    {
        login.loginBtn().click();
    }
    @Then("user login successfully")
    public void logSuccessAssert()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.myAccountBtn().isDisplayed());
    }
    @When("user login with invalid account data")
    public void enterInvalidData()
    {
        login.emailLogin().sendKeys("wrong@example.com");
        login.passwordLogin().sendKeys("P@ssw0rd");
    }
    @Then("user login unsuccessfully")
    public void logUnsuccessfulAssert()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.loginMsg().contains("Login was unsuccessful."));
        soft.assertEquals(login.loginMsgClr(),"#e4434b");

    }
}
