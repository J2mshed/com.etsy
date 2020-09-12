package com.etsy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtsySignInPage {
    WebDriver driver;

    EtsySignInPage(WebDriver webDriver){
        driver = webDriver;
        new WebDriverWait(driver, 5).until(ExpectedConditions.textToBePresentInElementLocated(By.className("text-title"), "Sign in"));
    }

    public EtsySignInPage username(String user){
        driver.findElement(By.id("join_neu_email_field")).sendKeys(user);
        return new EtsySignInPage(driver);
    }

    public EtsySignInPage password(String user){
        driver.findElement(By.id("join_neu_password_field")).sendKeys(user);
        return new EtsySignInPage(driver);
    }
}
