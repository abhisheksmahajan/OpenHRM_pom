package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Schedulepage {
    @FindBy(css = "#allAppointmentTypesModal>.dialog-content>.ng-scope:nth-of-type(2)>.ng-binding")
    WebElement genralMadicine;
    @FindBy(css = "span[class='button confirm']")
    WebElement close;
    @FindBy(css = "#viewAllAppointmentTypes>a")
    WebElement viewAlltypes;
    //@FindBy(css = "")
}
