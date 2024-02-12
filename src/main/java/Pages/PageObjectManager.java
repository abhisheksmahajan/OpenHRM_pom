package Pages;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    WebDriver driver;
    Loginpage login;
    Homepage homepage;
    Patientpage patientpage;
    Findpatientpage findpatientpage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public Loginpage getLoginPage(){
        login=new Loginpage(driver);
        return login;
    }


}
