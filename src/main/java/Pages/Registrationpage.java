package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Registrationpage {
    WebDriver driver;
    @FindBy(name="givenName")
    WebElement givenName;
    @FindBy(name="middleName")
    WebElement middleName;
    @FindBy(name="familyName")
    WebElement familyName;
    @FindBy(css="#checkbox-unknown-patient")
    WebElement CheckboxforUknownpatient;
    @FindBy(id="next-button")
    WebElement nextButton;
    @FindBy(id="gender-field")
    WebElement selectforGender;
    Select Gender= new Select(selectforGender);
    @FindBy(id="birthdateDay-field")
    WebElement dayField;
    @FindBy(id="birthdateMonth-field")
    WebElement selectMonth;
    Select Month= new Select(selectMonth);
    @FindBy(id="birthdateYear-field")
    WebElement yearField;
    @FindBy(id="birthdateYears-field")
    WebElement estimatedYearsfield;
    @FindBy(id="birthdateMonths-field")
    WebElement estimatedMonthsfield;
    @FindBy(id="address1")
    WebElement adress1;
    @FindBy(id="address2")
    WebElement adress2;
    @FindBy(id="cityVillage")
    WebElement cityVillage;
    @FindBy(id="stateProvince")
    WebElement stateProvince;
    @FindBy(id="country")
    WebElement country;
    @FindBy(id="postalCode")
    WebElement postalCode;
    @FindBy(name="phoneNumber")
    WebElement phoneNumber;
    @FindBy(name=".person-typeahead.ng-pristine.ng-valid.ng-empty.ng-touched")
    WebElement personName;
    @FindBy(id="relationship_type")
    WebElement Selectrelationshiptype;
    Select Relationshiptype= new Select(Selectrelationshiptype);
    @FindBy(id = ".person-typeahead.ng-pristine.ng-valid.ng-empty.ng-touched")
    WebElement relationName;
    @FindBy(css="#cancelSubmission")
    WebElement Cancel;
    @FindBy(css = ".submitButton")
    WebElement confirm;
    WebDriverWait wait;

    public Registrationpage(WebDriver driver) {

        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void setGivenName(String givenname){
        givenName.sendKeys(givenname);
    }
    public void setMiddleName(String middlename){
        middleName.sendKeys(middlename);
    }
    public void setFamilyName(String familyname){
        familyName.sendKeys(familyname);
    }
    public void setSelectforGender(String gender){
        Gender.selectByVisibleText(gender);
    }
    public void setCheckboxforUknownpatient(){
        CheckboxforUknownpatient.click();
    }
    public void setDayField(String day){
        dayField.sendKeys(day);
    }
    public void setSelectMonth(String month){
        Month.selectByVisibleText(month);
    }
    public void setYearField(String year){
        yearField.sendKeys(year);
    }
    public void setEstimatedYearsfield(String esyear){
        estimatedYearsfield.sendKeys(esyear);
    }
    public void setEstimatedMonthsfield(String esmonth){
        estimatedMonthsfield.sendKeys(esmonth);
    }
    public void setAddress(String ad1,String ad2,String city,String state, String Country,String zip){
        adress1.sendKeys(ad1);
        adress2.sendKeys(ad2);
        cityVillage.sendKeys(city);
        stateProvince.sendKeys(state);
        country.sendKeys(Country);
        postalCode.sendKeys(zip);

    }

    public void setPhoneNumber(String phonenumber) {
        phoneNumber.sendKeys(phonenumber);
    }

    public void setRelationship(String relationshiptype,String rname){
           Relationshiptype.selectByVisibleText(relationshiptype);
           relationName.sendKeys(rname);
    }
    public void clickonnext(){
        nextButton.click();
    }
    public void clickonconfirm(){
        confirm.click();
    }
    public void ClickonCancel(){
        Cancel.click();
    }


}
