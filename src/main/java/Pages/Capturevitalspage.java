package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Capturevitalspage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id = "coreapps-vitals-confirm")
    WebElement captureVital;
    @FindBy(css = "#height>input")
    WebElement hight;
    @FindBy(css = "#weight>input")
    WebElement weight;
    @FindBy(css = "#temperature>input")
    WebElement Tempreture;
    @FindBy(css = "#heart_rate>input")
    WebElement pulse;
    @FindBy(css = "#respiratory_rate>input")
    WebElement respiratoryRate;
    @FindBy(css = "#bp_systolic>input")
    WebElement aviolBloodrete;
    @FindBy(css = "#bp_diastolic>input")
    WebElement vetricalBloodrete;
    @FindBy(css = "#o2_sat>input")
    WebElement o2rate;
    @FindBy(css = "#next-button")
    WebElement nextBtn;
    @FindBy(css = "#confirmationQuestion>p>button")
    WebElement submitBtn;
    @FindBy(css = "#existing-encounters>table")
    WebElement table;

    public Capturevitalspage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

    public void ClickonYescapture() {

        captureVital.click();
    }

    public void AddHight(String Hight) {
        hight.sendKeys(Hight);
    }

    public void AddWeight(String Weight) {
        weight.sendKeys(Weight);
    }

    public void AddTemperature(String Temp) {
        Tempreture.sendKeys(Temp);
    }

    public void AddPulse(String Pulse) {
        pulse.sendKeys(Pulse);
    }

    public void AddResporetoryrate(String Resprate) {
        respiratoryRate.sendKeys(Resprate);
    }

    public void AddBloodpresure(String Arate, String Vrate) {
        aviolBloodrete.sendKeys(Arate);
        vetricalBloodrete.sendKeys(Vrate);
    }

    public void AddOxygenrate(String oxy) {
        o2rate.sendKeys(oxy);
    }

    public void ClickonNext() {
        nextBtn.click();
    }

    public void ClickonSubmit() {
        submitBtn.click();
    }
    public boolean istabaledisplay(){
        return table.isDisplayed();
    }
    public boolean isButtonpresent(){
        try{
        return captureVital.isDisplayed();}
        catch (NoSuchElementException e){
            return false;
        }
    }
}