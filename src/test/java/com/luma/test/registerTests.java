package com.luma.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.luma.pages.registerPage;


public class registerTests extends baseTests{

//    @BeforeTest
//    public void gettingCreateAccountPage(){
//        driver.findElement(By.linkText("Create an Account")).click();
//    }
    registerPage registerPage;
    @Parameters({"enterYourFirstName" , "enterYourLastName" , "enterYourEmail" , "enterYourPassword" , "enterYourConfirmationPass"})
    @Test(priority = 1)
    public void verifyUserRegistration (String enterYourFirstName ,String enterYourLastName , String enterYourEmail , String enterYourPassword , String enterYourConfirmationPass ){
        registerPage = new registerPage(driver);
        registerPage.findCreateAccountIcon();
       // driver.findElement(By.linkText("Create an Account")).click();
        registerPage.verifyRegistration (enterYourFirstName , enterYourLastName , enterYourEmail , enterYourPassword , enterYourConfirmationPass);
      //  registerPage.clickSubscribe();
        registerPage.clickCreateAccount();
        String expectedTitle ="My Account" ;
        String actualTitle = comnDriver.gitTitleOfThePage();
        Assert.assertEquals(expectedTitle ,actualTitle );
    }

    @Parameters({"enterFirstName" , "enterLastName" , "enterExistedEmail" , "enterPassword" , "enterConfirmationPass"})
    @Test(priority = 2)
    public void verifyRegistrationWithExistingEmail (String enterFirstName ,String enterLastName , String enterExistedEmail , String enterPassword , String enterConfirmationPass ){
        registerPage = new registerPage(driver);
        registerPage.findCreateAccountIcon();
      //  driver.findElement(By.linkText("Create an Account")).click();
        registerPage.verifyRegistrationWithExistingEmail (enterFirstName , enterLastName , enterExistedEmail , enterPassword , enterConfirmationPass);
       // registerPage.clickSubscribe();
        registerPage.clickCreateAccount();
        String expectedTitle ="Create New Customer Account" ;
        String actualTitle = comnDriver.gitTitleOfThePage();
        Assert.assertEquals(expectedTitle ,actualTitle );
    }

}
