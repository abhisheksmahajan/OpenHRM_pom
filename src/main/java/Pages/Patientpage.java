package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Patientpage {
    @FindBy(css="appointmentschedulingui.schedulingAppointmentDashboardLink")
    WebElement scheduleappointment;
    @FindBy(xpath = "//div[contains(text(),'Start Visit')]")
    WebElement startVisit;
    @FindBy



}
