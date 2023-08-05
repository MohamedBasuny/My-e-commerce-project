package com.luma.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage extends basePage{
   // private static WebDriver driver;
    public registerPage(WebDriver driver) {
        super(driver);
        this.driver= driver;
    }
    /*

    public registerPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver , this);
    }
    @FindBy(name = "firstname")
    private WebElement firstName;
    @FindBy(name = "lastname")
    private WebElement lastName;

    @FindBy(name = "is_subscribed")
    private WebElement checkBox;

    @FindBy(name = "email")
    private WebElement signInEmail;

    @FindBy(name = "password")
    private WebElement passWord;

    @FindBy(name = "password_confirmation")
    private WebElement confirmationPassWord;

    @FindBy(className = "action submit primary")
    private WebElement createAnAccountButton;


        //the same constructor above........
//    public registerPage(WebDriver driver , WebElement firstName, WebElement lastName, WebElement checkBox, WebElement signInEmail, WebElement passWord, WebElement confirmationPassWord, WebElement createAnAccountButton) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.checkBox = checkBox;
//        this.signInEmail = signInEmail;
//        this.passWord = passWord;
//        this.confirmationPassWord = confirmationPassWord;
//        this.createAnAccountButton = createAnAccountButton;
//  }

    public void registerToApplication(String enterYourFirstName ,String enterYourLastName , String enterYourEmail , String enterYourPassword , String enterYourConfirmationPass ){
         elementControl.setText(firstName ,enterYourFirstName );
         elementControl.setText(lastName ,enterYourLastName );
         elementControl.clickElement(checkBox);
         elementControl.setText(signInEmail ,enterYourEmail);
         elementControl.setText(passWord ,enterYourPassword);
         elementControl.setText(confirmationPassWord ,enterYourConfirmationPass);
         elementControl.clickElement(createAnAccountButton);
    }

     */
    public  void verifyRegistration (String enterYourFirstName ,String enterYourLastName , String enterYourEmail , String enterYourPassword , String enterYourConfirmationPass ) {
        driver.findElement(By.id("firstname")).sendKeys(enterYourFirstName);
        driver.findElement(By.id("lastname")).sendKeys(enterYourLastName);
        driver.findElement(By.id("email_address")).sendKeys(enterYourEmail);
        driver.findElement(By.id("password")).sendKeys(enterYourPassword);
        driver.findElement(By.id("password-confirmation")).sendKeys(enterYourConfirmationPass);
    }
    public  void verifyRegistrationWithExistingEmail (String enterFirstName ,String enterLastName , String enterExistedEmail , String enterPassword , String enterConfirmationPass ) {
        driver.findElement(By.id("firstname")).sendKeys(enterFirstName);
        driver.findElement(By.id("lastname")).sendKeys(enterLastName);
        driver.findElement(By.id("email_address")).sendKeys(enterExistedEmail);
        driver.findElement(By.id("password")).sendKeys(enterPassword);
        driver.findElement(By.id("password-confirmation")).sendKeys(enterConfirmationPass);
    }


//    public void clickSubscribe (){
//        driver.findElement(By.id("is_subscribed")).click();
//    }

    public void findCreateAccountIcon (){
        driver.findElement(By.linkText("Create an Account")).click();
    }
    public void clickCreateAccount (){
        driver.findElement(By.xpath("//*[@class='action submit primary']")).click();
    }
}
