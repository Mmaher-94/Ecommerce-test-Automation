package org.example.pages;

//import com.automation.step_definitions.Hooks;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class P02_login {
    public WebElement loginLink()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement emailLogin() { return Hooks.driver.findElement(By.id("Email")); }
    public WebElement passwordLogin() { return Hooks.driver.findElement(By.id("Password")); }
    public WebElement loginBtn() { return Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")); }
    public WebElement myAccountBtn() { return Hooks.driver.findElement(By.className("ico-account")); }
    public String loginMsg() { return Hooks.driver.findElement(By.className("message-error")).getText(); }
    public String loginMsgClr(){return Hooks.driver.findElement(By.className("message-error")).getCssValue("color");}





    }


