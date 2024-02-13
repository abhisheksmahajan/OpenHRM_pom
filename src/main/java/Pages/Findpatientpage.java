package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Findpatientpage {
WebDriver driver;
WebDriverWait wait;
@FindBy(id="patient-search")
WebElement searchbox;
@FindBy(xpath="//*[@class='odd'][1]/td[1]")
WebElement firstSearchidresult;
@FindBy(xpath="//*[@class='odd'][1]/td[2]")
WebElement firstSearchnameresult;
@FindBy(xpath="//*[@class='odd'][1]/td[5]")
WebElement firstSearchdobresult;
@FindBy(css="#patient-search-clear-button")
WebElement clearSearch;
@FindBy(css = "#patient-search-results>#patient-search-results-table_wrapper")
WebElement Table;
@FindBy(css = ".PersonName-givenName")
WebElement firstNameresult;
@FindBy(css = ".PersonName-familyName")
WebElement lastNameresult;

    public Findpatientpage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void AddsearchById(String id){
        wait.until(ExpectedConditions.visibilityOf(searchbox));
        searchbox.sendKeys(id);
    }
    public  void VerifyPetientbyname(String name)
    {   try{ Thread.sleep(3000);}catch (Exception e){}
        Assert.assertEquals(firstSearchnameresult.getText(),name);
    }
    public void AddsearchByname(String name){
        wait.until(ExpectedConditions.visibilityOf(searchbox));
        searchbox.sendKeys(name);
    }

    public boolean isPresent(){
        return Table.isDisplayed();
    }
    public  void VerifyPetientbyid(String id){
        try{ Thread.sleep(3000);}catch (Exception e){}
        wait.until(ExpectedConditions.visibilityOf(firstSearchidresult));
         Assert.assertEquals(firstSearchidresult.getText(),id+"Recent");
    }
    public void Clearsearch(){
        clearSearch.click();
    }
    public void Checkname(String name){
        Assert.assertEquals(firstNameresult.getText()+" "+lastNameresult.getText(),name);
    }
    public void Clickonpatientname(){
        try{
            Thread.sleep(3000);}catch (Exception e){}
        wait.until(ExpectedConditions.elementToBeClickable(firstSearchnameresult));
        firstSearchnameresult.click();

    }
    public  void VerifyPetientbydateofbirth(String DOB){
        try{ Thread.sleep(3000);}catch (Exception e){}
        Assert.assertEquals(firstSearchdobresult.getText(),DOB);
    }
    public void AddsearchBydateofbirth(String DOB){
        wait.until(ExpectedConditions.visibilityOf(searchbox));
        searchbox.sendKeys(DOB);
    }

}
