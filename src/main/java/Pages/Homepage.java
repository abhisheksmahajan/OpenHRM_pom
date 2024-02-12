package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id="coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    WebElement findPetientRecords;
    @FindBy(id="referenceapplication-vitals-referenceapplication-vitals-extension")
    WebElement captureVitals;
    @FindBy(css="a>.icon-user") WebElement registerPatient;
    @FindBy(css=".icon-home.small") WebElement homeIcon;
//    @FindBy()

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickonfindpatientrecords(){
        wait.until(ExpectedConditions.elementToBeClickable(findPetientRecords));
        findPetientRecords.click();
    }
    public void clickoncapturevitals(){
        wait.until(ExpectedConditions.elementToBeClickable(captureVitals));
        captureVitals.click();
    }
    public void clickonregisterpatient(){
        wait.until(ExpectedConditions.elementToBeClickable(registerPatient));
        registerPatient.click();
    }
    public void clickonhomeicon(){
        wait.until(ExpectedConditions.elementToBeClickable(homeIcon));
        homeIcon.click();
    }


}
