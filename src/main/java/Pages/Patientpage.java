package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Patientpage {
    @FindBy(css="appointmentschedulingui.schedulingAppointmentDashboardLink")
    WebElement scheduleappointment;
    @FindBy(css=".col-12.col-lg-3.p-0>div>ul>li>a[id='org.openmrs.module.coreapps.createVisit']")
    WebElement startVisit;
    @FindBy(css=".col-12.col-lg-3.p-0>div>ul>li>a[id='referenceapplication.realTime.endVisit']")
    WebElement endVisit;
    @FindBy(css=".col-12.col-lg-3.p-0>div>ul>li>a[id='referenceapplication.realTime.vitals']")
    WebElement captureVitals;
    @FindBy(css=".col-12.col-lg-3.p-0>div>ul>li>a[id='org.openmrs.module.coreapps.deletePatient']")
    WebElement deletePetient;
    @FindBy(css="#end-visit-dialog>.dialog-content>.confirm.right")
    WebElement ConfirmForendvisit;
    @FindBy(css="button[id='start-visit-with-visittype-confirm']")
    WebElement ConfirmForstart;
    @FindBy(css="#delete-reason")
    WebElement deleteuserReason;
    @FindBy(css="#delete-patient-creation-dialog>.dialog-content>.confirm.right")
    WebElement Confirmdeletepetient;
    @FindBy(css="#breadcrumbs>li:nth-child(2)>a")
    WebElement nameIcon;
    @FindBy(css = ".PersonName-givenName")
    WebElement extractfirstName;
    @FindBy(css = ".PersonName-familyName")
    WebElement extractlastName;
    @FindBy(css = ".float-sm-right>span")
    WebElement extractId;
    @FindBy(css = ".gender-age.col-auto>span:nth-of-type(2)")
    WebElement extractDob;
    @FindBy(css = ".gender-age.col-auto>span:nth-of-type(1)")
    WebElement extractGender;

    WebDriver driver;
    WebDriverWait wait;

    public Patientpage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }
    public void ClickonStartvisit(){
        wait.until(ExpectedConditions.elementToBeClickable(startVisit));
        startVisit.click();
    }
    public void ClickonEndvisit(){
        wait.until(ExpectedConditions.elementToBeClickable(endVisit));
        endVisit.click();
    }
    public void ClickonScheduleAppointment(){
        wait.until(ExpectedConditions.elementToBeClickable(scheduleappointment));
        scheduleappointment.click();
    }
    public void ClickonDeletPetient(){
        deletePetient.click();
        wait.until(ExpectedConditions.visibilityOf(deleteuserReason));
        deleteuserReason.sendKeys("Duplicate");
        Confirmdeletepetient.click();
    }
    public void ClickonConfirmStartvisit(){
        wait.until(ExpectedConditions.elementToBeClickable(ConfirmForstart));
        ConfirmForstart.click();
    }
    public void ClickonConfirmEndvisit(){
        wait.until(ExpectedConditions.elementToBeClickable(ConfirmForendvisit));
        ConfirmForendvisit.click();
    }
    public void ischeckendvisite(){
        Assert.assertEquals(endVisit.isEnabled(),true);
    }
    public void ClickonnameIcon(){
        wait.until(ExpectedConditions.elementToBeClickable(nameIcon));
        nameIcon.click();
    }
    public String Extractfirstname(){
        return extractfirstName.getText();
    }
    public String Extractlastname(){
        return extractlastName.getText();
    }
    public String Extractid(){
        return extractId.getText();
    }
    public String Extractdateofbirth(){
        return extractDob.getText();
    }
    public String ExtractGender(){
        return extractGender.getText();
    }


}
