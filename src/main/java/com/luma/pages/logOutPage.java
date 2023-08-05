package com.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logOutPage extends basePage{

    public static WebDriver driver;
    public logOutPage (WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void signInIcon(){
     driver.findElement(By.xpath("//*[@class='action switch']")).click();
    }
    public void clickLogOut  (){
        driver.findElement(By.linkText("Sign Out")).click();
    }

}
