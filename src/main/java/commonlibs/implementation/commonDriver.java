package commonlibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class commonDriver {

    private WebDriver driver;
    private int pageLoadTimeOut;
    private int elementDetectionTimeOut;

    public WebDriver getDriver() {
        return driver;
    }


    public void setPageLoadTimeOut(int pageLoadTimeOut) {
        this.pageLoadTimeOut = pageLoadTimeOut;
    }

    public void setElementDetectionTimeOut(int elementDetectionTimeOut) {
        this.elementDetectionTimeOut = elementDetectionTimeOut;
    }

    public commonDriver (String browserType) throws Exception {

       pageLoadTimeOut = 30;
       elementDetectionTimeOut = 30;
       if (browserType.equalsIgnoreCase("chrome")){
           driver = new ChromeDriver();
       } else if (browserType.equalsIgnoreCase("edge")){
           driver = new EdgeDriver();
       } else {
           throw new Exception("Invalid Browser Type" + browserType);
       }
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
    }

    public  void navigatingToUrl (String url){
       driver.manage().timeouts().pageLoadTimeout(pageLoadTimeOut , TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(elementDetectionTimeOut , TimeUnit.SECONDS);
       driver.get(url);
    }

    public String gitTitleOfThePage (){
        return driver.getTitle();
    }


    public void closeAllBrowser(){
        driver.quit();
    }

    public void closeBrowserPage (){
        driver.quit();
    }



}
