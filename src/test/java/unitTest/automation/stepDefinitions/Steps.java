package unitTest.automation.stepDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import unitTest.automation.pageObjects.LoginPage;


public class Steps {

    String driverPath=System.getProperty("user.dir") + "/Drivers/chromedriver.exe";
    public WebDriver driver;
    public LoginPage loginPage;
    @Given("User Launch Chrome browser")
    public void user_Launch_Chrome_browser() {
        System.setProperty("webdriver.chrome.driver",driverPath );
        driver=new ChromeDriver();
        loginPage=new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_URL(String url) {
        driver.get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_Email_as_and_Password_as(String email, String password) {
        loginPage.setUsername(email);
        loginPage.setPassword(password);
    }

    @When("Click on Login")
    public void click_on_Login() {
        loginPage.clickLoginButton();
    }

    @Then("Page Title should be {string}")
    public void page_Title_should_be(String title) {
        if(driver.getPageSource().contains("Login was unsuccessful"))
        {
            driver.close();
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertEquals(title,driver.getTitle());
        }

    }

    @When("User click on Log out link")
    public void user_click_on_Log_out_link() {
        loginPage.clickLogout();
    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }
}
