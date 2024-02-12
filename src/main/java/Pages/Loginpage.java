package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Loginpage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id="username")
    WebElement userName;
    @FindBy(id="password")
    WebElement password;
    @FindBy(css="li[id='Inpatient Ward']")
    WebElement inpatientWard;
    @FindBy(id="loginButton")
    WebElement logIn;


    public Loginpage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void enterusername(String username){
       wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(username);
    }
    public void enterpassword(String pass){
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(pass);
    }
    public void clickoninpatientward(){
        wait.until(ExpectedConditions.elementToBeClickable(inpatientWard));
        inpatientWard.click();
    }
    public void clickonloginbutton(){
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        logIn.click();
    }

}
