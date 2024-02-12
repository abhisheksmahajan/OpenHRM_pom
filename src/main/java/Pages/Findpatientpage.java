package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Findpatientpage {
WebDriver driver;
@FindBy(id="patient-search")
WebElement searchbox;
@FindBy(css="#patient-search-results-table>tbody>.odd:nth-of-type(1)>td")
WebElement firstSearchresult;
@FindBy(css="#patient-search-clear-button")
WebElement clearSearch;

    public Findpatientpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
