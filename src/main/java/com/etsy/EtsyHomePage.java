package com.etsy;

//import org.graalvm.compiler.debug.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtsyHomePage {
   WebDriver driver;

   public EtsyHomePage(WebDriver webDriver){
       driver = webDriver;
       new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"));
   }

   public EtsyHomePage etsySearchKeyword(String keyword){
       By searchInputLocator = By.name("search_query");
       driver.findElement(searchInputLocator).sendKeys(keyword);
//       driver.findElement(By.xpath("//*[@id=\"gnav-search\"]/div/div[1]/button")).click();
//       return new com.etsy.EtsySearchResult;
       return this;
   }

   public EtsySearchResult clickSearchButton(){
       driver.findElement(By.xpath("//*[@id=\"gnav-search\"]/div/div[1]/button")).click();
       return new EtsySearchResult(driver);
   }

   public EtsySignInPage clickSignInButton(){
       driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button")).click();
       return new EtsySignInPage(driver);
   }


}
