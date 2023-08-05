package com.luma.test;

import com.luma.pages.loginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class loginTests extends baseTests {

//    @BeforeTest
//    public void gettingSignINtPage(){
//        driver.findElement(By.linkText("Sign In")).click();
//    }
    loginPage loginPage;



    @Parameters({"CorrectYourEmail" ,"CorrectYourPassword"})
    @Test(priority = 1)
    public void verifyCorrectUserLogin(String CorrectYourEmail , String CorrectYourPassword) {
        loginPage = new loginPage(driver);
        loginPage.findSignInIcon();
       // driver.findElement(By.linkText("Sign In")).click();
        loginPage.verifyCorrectUserLogin(CorrectYourEmail, CorrectYourPassword);
        loginPage.clickLogin();
        String expectedTitle ="Home Page" ;
        String actualTitle = comnDriver.gitTitleOfThePage();
        Assert.assertEquals( actualTitle , expectedTitle);
    }

    @Parameters({"InCorrectYourEmail" ,"IncorrectYourPassword"})
    @Test(priority = 2)
    public void verifyInCorrectUserLogin (String InCorrectYourEmail , String IncorrectYourPassword) {
        loginPage = new loginPage(driver);
        driver.findElement(By.linkText("Sign In")).click();
        loginPage.verifyInCorrectUserLogin(InCorrectYourEmail ,IncorrectYourPassword);
        loginPage.clickLogin();
        String expectedTitle ="Customer Login" ;
        String actualTitle = comnDriver.gitTitleOfThePage();
        Assert.assertEquals( actualTitle , expectedTitle);
    }


}
