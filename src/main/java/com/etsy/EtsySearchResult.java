package com.etsy;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtsySearchResult {
    WebDriver driver;

    EtsySearchResult(WebDriver webDriver){
        driver = webDriver;
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.titleContains("| Etsy"));
    }
}
