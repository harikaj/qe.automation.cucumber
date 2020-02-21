package unitTest.automation.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unitTest.automation.BaseTest;

public class LoginPage extends BaseTest {

    ChromeDriver driver;

    public LoginPage(WebDriver driver)
    {
        //this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[id='Email']") @CacheLookup public static WebElement username;

    @FindBy(xpath = "//input[name='Password']") @CacheLookup public static WebElement password;


    @FindBy(xpath ="//input[value='Log in']") @CacheLookup public static WebElement loginBtn;
    @FindBy(linkText = "Logout") @CacheLookup WebElement lnkLogout;

    public void setPassword(String pwd)
    {
        password.sendKeys(pwd);
    }

    public void setUsername(String uname)
    {
        username.sendKeys(uname);
    }
    public void clickLoginButton()
    {
        loginBtn.click();
    }
    public void clickLogout() {
        lnkLogout.click();
    }





    
}
