package com.luma.test;

import commonlibs.implementation.commonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import com.luma.pages.registerPage;
import com.luma.pages.loginPage;

public class baseTests {

    commonDriver comnDriver;
    String url ;
    WebDriver driver;
   // registerPage registerPage;
//    @BeforeClass
//    public void  setup () throws Exception {
//        url = "https://magento.softwaretestingboard.com/";
//        comnDriver = new commonDriver("chrome");
//
//       driver = comnDriver.getDriver();
//        comnDriver.navigatingToUrl(url);
//     // registerPage = new registerPage(driver);
//    }
//    @BeforeTest
//    public void  setup2 () throws Exception {
//        url = "https://magento.softwaretestingboard.com/";
//        comnDriver = new commonDriver("chrome");
//
//       driver = comnDriver.getDriver();
//        comnDriver.navigatingToUrl(url);
//     // registerPage = new registerPage(driver);
//    }

    @BeforeMethod
    public void  setup2 () throws Exception {
        url = "https://magento.softwaretestingboard.com/";
        comnDriver = new commonDriver("chrome");

        driver = comnDriver.getDriver();
        comnDriver.navigatingToUrl(url);
        // registerPage = new registerPage(driver);
    }

//    @AfterTest
//    public void closePage(){
//        comnDriver.closeBrowserPage();
//    }

//    @AfterClass
//    public void tearDown () {
//        comnDriver.closeAllBrowser();
//    }

    @AfterMethod
    public void close() {
        driver.quit();
    }



}
