package Pages;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    WebDriver driver;
    Loginpage login;
    Homepage homepage;
    Patientpage patientpage;
    Findpatientpage findpatientpage;
    Registrationpage registrationpage;
    Capturevitalspage capturevitalspage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
        login=new Loginpage(driver);
        registrationpage = new Registrationpage(driver);
        homepage= new Homepage(driver);
        findpatientpage=new Findpatientpage(driver);
        capturevitalspage= new Capturevitalspage(driver);
        patientpage= new Patientpage(driver);
    }

    public Loginpage getLoginPage(){
        return login;
    }
    public Registrationpage getRegisterPage(){

        return registrationpage;
    }
    public Homepage getHomePage(){

        return homepage;
    }
    public Findpatientpage getFindpatientpage(){

        return findpatientpage;
    }
    public Capturevitalspage getcapturevitalspage(){

        return capturevitalspage;
    }
    public Patientpage getPatientpage(){

        return patientpage;
    }




}
