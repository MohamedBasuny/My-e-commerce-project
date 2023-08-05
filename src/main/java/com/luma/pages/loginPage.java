package com.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends basePage {
    /*
    @FindBy(name = "login[username]")
    private WebElement YourEmail;

    @FindBy(name = "login[password]")
    private WebElement YourPassword;

    @FindBy(name = "send")
    private WebElement signInButton;

    public loginPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver , this);
    }

    //the same constructor above........
//    public loginPage (WebDriver driver , WebElement YourEmail, WebElement YourPassword, WebElement signInButton) {
//        super(driver);
//        this.YourEmail = YourEmail;
//        this.YourPassword = YourPassword;
//        this.signInButton = signInButton;
//    }

    public void loginToApplication(String enterYourEmail, String enterYourPassword) {
        elementControl.setText(YourEmail, enterYourEmail);
        elementControl.setText(YourPassword, enterYourPassword);
        elementControl.clickElement(signInButton);
        }
*/


       private static WebDriver driver;
       public loginPage (WebDriver driver) {
           super(driver);
           this.driver = driver;
       }
       public  void verifyCorrectUserLogin(String CorrectYourEmail , String CorrectYourPassword ) {
           driver.findElement(By.id("email")).sendKeys(CorrectYourEmail);
           driver.findElement(By.id("pass")).sendKeys(CorrectYourPassword);
       }
       public  void verifyInCorrectUserLogin(String InCorrectYourEmail , String IncorrectYourPassword ) {
           driver.findElement(By.id("email")).sendKeys(InCorrectYourEmail);
           driver.findElement(By.id("pass")).sendKeys(IncorrectYourPassword);
       }

       public void findSignInIcon (){
           driver.findElement(By.linkText("Sign In")).click();
       }
       public void clickLogin() {
           driver.findElement(By.id("send2")).click();

       }
    }

