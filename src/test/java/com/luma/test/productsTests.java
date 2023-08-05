package com.luma.test;

import com.luma.pages.loginPage;
import com.luma.pages.productsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class productsTests extends baseTests {
    loginPage loginPage;
    productsPage productsPage;

    @Parameters({"CorrectYourEmail", "CorrectYourPassword"})
    @Test
    public void verifyAddingProduct (String CorrectYourEmail, String CorrectYourPassword) throws InterruptedException {
        loginPage = new loginPage(driver);
        productsPage = new productsPage(driver);
        loginPage.findSignInIcon();
       // driver.findElement(By.linkText("Sign In")).click();
        loginPage.verifyCorrectUserLogin(CorrectYourEmail, CorrectYourPassword);
        loginPage.clickLogin();
        productsPage.findProduct();
        productsPage.chooseSize();
        productsPage.chooseColor();
        productsPage.addToCard();
        Thread.sleep(10000); //pause until add the item after 5 seconds
        productsPage.findViewTheCardIcon();
        productsPage.clickViewCard();
        //verify that the item successfully added
        WebElement expectedItem = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/a/span/span/img"));
        WebElement actualItem = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/a/span/span/img"));
        Assert.assertEquals( actualItem , expectedItem);
    }
}
