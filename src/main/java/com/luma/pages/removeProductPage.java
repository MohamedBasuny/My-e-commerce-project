package com.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class removeProductPage extends basePage {
    private static WebDriver driver;
    public removeProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void removeProductFromCard (){
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[3]")).click();
    }
}
