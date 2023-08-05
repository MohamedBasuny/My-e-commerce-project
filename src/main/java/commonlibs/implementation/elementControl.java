package commonlibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class elementControl {
    WebDriver driver;
    public elementControl (WebDriver driver){
       this.driver = driver ;
    }

    public void clickElement (WebElement element){
        element.click();
    }

    public void clear (WebElement element){
        element.clear();
    }

    public void setText (WebElement element , String text){
        element.sendKeys(text);
    }

    public boolean isEnabled (WebElement element ){
        return element.isEnabled();
    }

    public boolean isDisplayed (WebElement element ){
        return element.isDisplayed();
    }

    public void acceptAlert  (){
        driver.switchTo().alert().accept();
    }

    public String getTextFromAlert (){
        return driver.switchTo().alert().getText();
    }


    //study this method again to understand.............................
    public void selectViaVisibleText (WebElement element ,String text){
        Select selDropDown = new Select(element);
        selDropDown.selectByVisibleText(text);
    }

}
