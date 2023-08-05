package com.luma.test;

import com.luma.pages.loginPage;
import com.luma.pages.searchProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class searchProductTests extends baseTests {
    loginPage loginPage;

    searchProductPage searchProductPage;

    @Parameters({"CorrectYourEmail", "CorrectYourPassword"})
    @Test(priority = 1)
    public void verifySearchProduct(String CorrectYourEmail, String CorrectYourPassword) {
        loginPage = new loginPage(driver);
        searchProductPage = new searchProductPage(driver);
        loginPage.findSignInIcon();
        // driver.findElement(By.linkText("Sign In")).click();
        loginPage.verifyCorrectUserLogin(CorrectYourEmail, CorrectYourPassword);
        loginPage.clickLogin();
        searchProductPage.findSearchBar();
        searchProductPage.searchButton();
        WebElement expectedResult = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[3]/div/a/span/span/img"));
        WebElement actualResult = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[3]/div/a/span/span/img"));
        Assert.assertEquals( actualResult , expectedResult);
    }
}
