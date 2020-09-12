package etsyTest;

import com.etsy.EtsyHomePage;
import com.etsy.EtsySearchResult;
import com.etsy.EtsySignInPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class EtsyTest {
    WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.etsy.com");
    }

    @After
    public void tearDown(){
//        driver.quit();
    }

    @Test
    public void addItemToOurCartTest(){
        EtsyHomePage startPage = new EtsyHomePage(driver);
        String searchItem = "bottle opener wall mount";
        EtsySearchResult searchResultPage = startPage.etsySearchKeyword(searchItem).clickSearchButton();
    }

    @Test
    public void goToSignInPage(){
        EtsyHomePage startPage = new EtsyHomePage(driver);
        EtsySignInPage signInPage = startPage.clickSignInButton();
        EtsySignInPage addUsername = signInPage.username("test@mail.com");
        EtsySignInPage addPassword = signInPage.password("QWERTY123");
    }

}
