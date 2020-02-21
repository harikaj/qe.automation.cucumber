package unitTest.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    String driverPath=System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

    public static ChromeDriver driver;

    @BeforeSuite()
    public void beforeSuite() throws Exception
    {
        System.setProperty("webdriver.chrome.driver",driverPath );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
