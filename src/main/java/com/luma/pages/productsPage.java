package com.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productsPage extends basePage {

    private static WebDriver driver;
    public productsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void findProduct (){
       driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/a/span/span/img")).click();
    }
    public void chooseSize(){
        driver.findElement(By.id("option-label-size-143-item-168")).click();
    }
    public void chooseColor(){
        driver.findElement(By.id("option-label-color-93-item-52")).click();
    }
    public void addToCard(){
        driver.findElement(By.id("product-addtocart-button")).click();
    }
    public void findViewTheCardIcon (){
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
    }
    public void clickViewCard (){
        driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")).click();
    }

}
