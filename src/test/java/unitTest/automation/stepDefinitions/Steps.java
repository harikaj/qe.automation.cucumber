package unitTest.automation.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import unitTest.automation.pageObjects.FacebookMainPage;

import java.util.concurrent.TimeUnit;

public class Steps {

    String driverPath=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
    public WebDriver driver;
    public FacebookMainPage facebookMainPage;

    @Given("User Launch Chrome browser")
    public void user_Launch_Chrome_browser() {
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        facebookMainPage= new FacebookMainPage(driver);

    }

    @When("User opens URL {string}")
    public void user_opens_URL(String url) {
        driver.get(url);
    }

    @Then("Page Title should be {string}")
    public void page_Title_should_be(String title) {
        if(driver.getTitle().contains("Unable to launch"))
        {
            driver.close();
            Assert.fail();
        }
        else
        {
            Assert.assertEquals(title,driver.getTitle());
        }

    }

    @Then("User enters FirstName as {string} and LastName as {string}")
    public void user_enters_FirstName_as_and_LastName_as(String firstName, String lastName) {
        facebookMainPage.enterFirstName(firstName);
        facebookMainPage.enterLastName(lastName);

    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();

    }

}
