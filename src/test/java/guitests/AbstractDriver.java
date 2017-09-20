package guitests;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by Ali Al-Marsumi Local on 20/09/2017.
 */
public class AbstractDriver {

    protected static WebDriver driver;

    protected WebDriver getDriver(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
//            driver = new HtmlUnitDriver();
        }
        return driver;
    }


}
