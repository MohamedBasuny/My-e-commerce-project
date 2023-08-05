package com.luma.test;

import com.luma.pages.logOutPage;
import com.luma.pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class logOutTests extends baseTests {
    logOutPage logOutPage;
    loginPage loginPage;

    @Parameters({"CorrectYourEmail" ,"CorrectYourPassword"})
    @Test
    public void verifyCorrectUserLogout(String CorrectYourEmail , String CorrectYourPassword) throws InterruptedException {
        loginPage = new loginPage(driver);
        logOutPage = new logOutPage(driver);
        loginPage.findSignInIcon();
        // driver.findElement(By.linkText("Sign In")).click();
        loginPage.verifyCorrectUserLogin(CorrectYourEmail, CorrectYourPassword);
        loginPage.clickLogin();
        logOutPage.signInIcon();
        logOutPage.clickLogOut();
        Thread.sleep(12000); //pause because the page change after 5 seconds
        String actualTitle = comnDriver.gitTitleOfThePage();
        String expectedTitle ="Home Page" ;
        Assert.assertEquals( actualTitle , expectedTitle);
    }


}


