package guitests;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Ali Al-Marsumi Local on 20/09/2017.
 */
public class SimpleTest extends AbstractDriver{
    WebDriver driver = getDriver();
    WebElement googSearch;


    @Given("^I navigate to the website$")
    public void i_navigate_to_the_website() throws Throwable {
        driver.get("https://www.google.co.uk");

    }

    @When("^I populate the search criteria$")
    public void i_populate_the_search_criteria() throws Throwable {
        googSearch = driver.findElement(By.name("q"));
        googSearch.sendKeys("http://www.sebikes.com/");
    }

    @When("^submit the search$")
    public void submit_the_search() throws Throwable {
        googSearch.submit();
    }

    @After
    public void closeBrowser(){
        driver.close();
    }

}


