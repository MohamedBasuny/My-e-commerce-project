package com.luma.test;

import com.luma.pages.loginPage;
import com.luma.pages.removeProductPage;
import com.luma.pages.productsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class removeProductTests extends baseTests {
    loginPage loginPage;
    productsPage productsPage;
    removeProductPage removeProductPage;

    @Parameters({"CorrectYourEmail", "CorrectYourPassword"})
    @Test
    public void verifyRemovingProduct(String CorrectYourEmail, String CorrectYourPassword) throws InterruptedException {
        loginPage = new loginPage(driver);
        productsPage = new productsPage(driver);
        removeProductPage = new removeProductPage(driver);
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
        removeProductPage.removeProductFromCard();
        Thread.sleep(5000); //pause to see the card after removing the product
        WebElement expectedResult = driver.findElement(By.className("cart-empty"));
        WebElement actualResult = driver.findElement(By.className("cart-empty"));
        Assert.assertEquals( actualResult , expectedResult);
    }
}
