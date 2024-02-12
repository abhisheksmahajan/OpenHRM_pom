package OpenMRSTest;

import Pages.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Base;
import util.ProjectConfig;
import util.TestContextSetup;

import java.net.MalformedURLException;
import java.time.Duration;

public class Normaltest {
    public WebDriver driver;
    public WebDriverWait wait;
    PageObjectManager pom;
//    Base base;
   TestContextSetup tcs;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        tcs= new TestContextSetup();
        tcs.base.initializeDriver().get(ProjectConfig.url);

        //base=new Base();
       // driver=base.initializeDriver("Chrome");
       // wait=new WebDriverWait(driver, Duration.ofSeconds(50));
       // pom=new PageObjectManager(driver);

        //driver=new ChromeDriver();


//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setCapability("platformName", "linux");
//        chromeOptions.setCapability("se:name", "Demo Test");
//        chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value");
//        chromeOptions.addArguments("--remote-allow-origins=*");
//        driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
//        wait=new WebDriverWait(driver,Duration.ofSeconds(10));


    }
    @Test
    public void Login(){
        tcs.Setup().getLoginPage().enterusername("Admin");
        tcs.Setup().getLoginPage().enterpassword("Admin123");
        tcs.Setup().getLoginPage().clickoninpatientward();
        tcs.Setup().getLoginPage().clickonloginbutton();
//        pom.getLoginPage().clickoninpatientward();
//        pom.getLoginPage().clickonloginbutton();
    }
}
