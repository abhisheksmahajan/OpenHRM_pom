package OpenMRSTest;

import Pages.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
        //driver.manage().window().maximize();
        tcs.Setup().getLoginPage().enterusername(ProjectConfig.Username);
        tcs.Setup().getLoginPage().enterpassword(ProjectConfig.Password);
        tcs.Setup().getLoginPage().clickoninpatientward();
        tcs.Setup().getLoginPage().clickonloginbutton();
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
    @Test(priority = 0)
    public void Registration1(){
      tcs.Setup().getHomePage().clickonregisterpatient();
      tcs.Setup().getRegisterPage().setGivenName("Sham");
      tcs.Setup().getRegisterPage().setFamilyName("Sharma");
      tcs.Setup().getRegisterPage().clickonnext();
      tcs.Setup().getRegisterPage().setSelectforGender("Male");
      tcs.Setup().getRegisterPage().clickonnext();
      tcs.Setup().getRegisterPage().setDayField("26");
      tcs.Setup().getRegisterPage().setSelectMonth("May");
      tcs.Setup().getRegisterPage().setYearField("1997");
      tcs.Setup().getRegisterPage().clickonnext();
      tcs.Setup().getRegisterPage().setAddress("Sector 75","C Block","Noida","Utter Pradesh","India","203004");
      tcs.Setup().getRegisterPage().clickonnext();
      tcs.Setup().getRegisterPage().setPhoneNumber("9857654521");
      tcs.Setup().getRegisterPage().clickonnext();
      tcs.Setup().getRegisterPage().setRelationship("Parents","Brother");
      tcs.Setup().getRegisterPage().clickonnext();
      tcs.Setup().getRegisterPage().clickonconfirm();
      tcs.Setup().getRegisterPage().Verifytile();
       // System.out.println(driver.getTitle());
        //Assert.assertEquals(driver.getTitle(),"");
//        pom.getLoginPage().clickoninpatientward();
//        pom.getLoginPage().clickonloginbutton();
    }
    @Test(priority = 1)
    public void Registration2() {

        tcs.Setup().getHomePage().clickonhomeicon();
        tcs.Setup().getHomePage().clickonregisterpatient();
        tcs.Setup().getRegisterPage().setGivenName("Vinay");
        tcs.Setup().getRegisterPage().setFamilyName("Kumar");
        tcs.Setup().getRegisterPage().clickonnext();
        tcs.Setup().getRegisterPage().setSelectforGender("Male");
        tcs.Setup().getRegisterPage().clickonnext();
        tcs.Setup().getRegisterPage().setDayField("29");
        tcs.Setup().getRegisterPage().setSelectMonth("April");
        tcs.Setup().getRegisterPage().setYearField("1980");
        tcs.Setup().getRegisterPage().clickonnext();
        tcs.Setup().getRegisterPage().setAddress("Sector 55", "F Block", "Noida", "Utter Pradesh", "India", "203008");
        tcs.Setup().getRegisterPage().clickonnext();
        tcs.Setup().getRegisterPage().clickonnext();
        tcs.Setup().getRegisterPage().clickonnext();
        tcs.Setup().getRegisterPage().clickonconfirm();
    }
    @Test(priority = 2)
    public void Registration3() {
        tcs.Setup().getHomePage().clickonhomeicon();
        tcs.Setup().getHomePage().clickonregisterpatient();
        tcs.Setup().getRegisterPage().setCheckboxforUknownpatient();
        tcs.Setup().getRegisterPage().setSelectforGender("Female");
        tcs.Setup().getRegisterPage().clickonnext();
        tcs.Setup().getRegisterPage().clickonconfirm();
    }
    @Test(priority = 3)
    public  void  FindPetientRecord(){
        tcs.Setup().getHomePage().clickonhomeicon();
        tcs.Setup().getHomePage().clickonfindpatientrecords();
        Assert.assertEquals(tcs.Setup().getFindpatientpage().isPresent(),true);
    }
    @Test(priority = 4)
    public void Searchpetientbyid(){
        tcs.Setup().getFindpatientpage().AddsearchById("100MVG");
        tcs.Setup().getFindpatientpage().VerifyPetientbyid("100MVG");
    }
    @Test(priority = 5)
    public void Searchpetientbyname(){
        tcs.Setup().getFindpatientpage().Clearsearch();
        tcs.Setup().getFindpatientpage().AddsearchByname("Vinay Kumar ");
        tcs.Setup().getFindpatientpage().VerifyPetientbyname("Vinay Kumar");
    }
    @Test(priority = 6)
    public void Searchpetientbydateofbirth(){
        tcs.Setup().getFindpatientpage().Clearsearch();
        tcs.Setup().getFindpatientpage().AddsearchBydateofbirth("26.Dec.1995");
        Assert.assertEquals(tcs.Setup().getFindpatientpage().isPresent(),false);
    }
    @Test(priority = 6)
    public void Viewpetientdetails1(){
        tcs.Setup().getFindpatientpage().Clearsearch();
        tcs.Setup().getFindpatientpage().AddsearchByname("Vinay Kumar ");
        tcs.Setup().getFindpatientpage().Clickonpatientname();
        tcs.Setup().getFindpatientpage().Checkname("Vinay Kumar");
    }
    @Test(priority = 7)
    public void Viewpetientdetails2(){

        tcs.Setup().getPatientpage().ClickonStartvisit();
        tcs.Setup().getPatientpage().ClickonConfirmStartvisit();
        tcs.Setup().getPatientpage().ClickonnameIcon();
        tcs.Setup().getPatientpage().ischeckendvisite();
    }
    @Test(priority = 8)
    public void Viewpetientdetails3(){
        tcs.Setup().getPatientpage().ClickonDeletPetient();

    }
    @Test(priority = 9)
    public void Capturvital1(){
        tcs.Setup().getHomePage().clickonhomeicon();
        tcs.Setup().getHomePage().clickoncapturevitals();
        tcs.Setup().getFindpatientpage().AddsearchById("100PH3");
        tcs.Setup().getFindpatientpage().Clickonpatientname();
        Assert.assertEquals(tcs.Setup().getcapturevitalspage().istabaledisplay(),true);

    }
    @Test(priority = 10)
    public void Capturvital2(){
        tcs.Setup().getHomePage().clickonhomeicon();
        tcs.Setup().getHomePage().clickoncapturevitals();
        tcs.Setup().getFindpatientpage().AddsearchById("100PH3");
        tcs.Setup().getFindpatientpage().Clickonpatientname();
        tcs.Setup().getcapturevitalspage().ClickonYescapture();
        tcs.Setup().getcapturevitalspage().AddHight("180");
        tcs.Setup().getcapturevitalspage().ClickonNext();
        tcs.Setup().getcapturevitalspage().AddWeight("85");
        tcs.Setup().getcapturevitalspage().ClickonNext();
        tcs.Setup().getcapturevitalspage().ClickonNext();
        tcs.Setup().getcapturevitalspage().AddTemperature("37.5");
        tcs.Setup().getcapturevitalspage().ClickonNext();
        tcs.Setup().getcapturevitalspage().AddPulse("75");
        tcs.Setup().getcapturevitalspage().ClickonNext();
        tcs.Setup().getcapturevitalspage().AddResporetoryrate("60");
        tcs.Setup().getcapturevitalspage().ClickonNext();
        tcs.Setup().getcapturevitalspage().AddBloodpresure("87","102");
        tcs.Setup().getcapturevitalspage().ClickonNext();
        tcs.Setup().getcapturevitalspage().AddOxygenrate("95");
        tcs.Setup().getcapturevitalspage().ClickonNext();
        tcs.Setup().getcapturevitalspage().ClickonSubmit();


    }
    @Test(priority = 11)
    public void Capturevital3(){
        tcs.Setup().getHomePage().clickonhomeicon();
        tcs.Setup().getHomePage().clickoncapturevitals();
        tcs.Setup().getFindpatientpage().AddsearchById("100PKY");
        tcs.Setup().getFindpatientpage().Clickonpatientname();
        Assert.assertEquals(tcs.Setup().getcapturevitalspage().isButtonpresent(),false);
    }
    

}
