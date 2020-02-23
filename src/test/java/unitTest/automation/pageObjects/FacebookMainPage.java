package unitTest.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookMainPage {
    ChromeDriver driver;

    public FacebookMainPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="firstname") @CacheLookup public static WebElement firstName;
    @FindBy(name="lastname") @CacheLookup public static WebElement lastName;
    public void enterFirstName(String first_Name)
    {
        firstName.sendKeys(first_Name);
    }

    public void enterLastName(String last_Name)
    {
        lastName.sendKeys(last_Name);
    }
}
