package com.luma.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchProductPage extends basePage {

    public searchProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void findSearchBar (){
        driver.findElement(By.id("search")).sendKeys("shirt");
    }
    public void searchButton (){
        //driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@title='Search']")).click();
    }



}
