package com.luma.pages;

import commonlibs.implementation.elementControl;
import org.openqa.selenium.WebDriver;

public class basePage {
    WebDriver driver;
    public elementControl elementControl;
    public basePage(WebDriver driver){
        this.driver = driver ;
        elementControl = new elementControl(driver);

    }



}
