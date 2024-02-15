package Pages;

import com.opencsv.CSVWriter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.Duration;

public class Homepage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="a[id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
    WebElement findPetientRecords;
    @FindBy(id="referenceapplication-vitals-referenceapplication-vitals-extension")
    WebElement captureVitals;
    @FindBy(css="a>.icon-user") WebElement registerPatient;
    @FindBy(css=".icon-home.small") WebElement homeIcon;
////    File file;
////    FileWriter outputfile;
//
//    // create CSVWriter object filewriter object as parameter
//    CSVWriter writer;

//    @FindBy()

    public Homepage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
//       try{
//        file= new File("Dataset.csv");
//        outputfile = new FileWriter(file);
//        writer = new CSVWriter(outputfile);}catch (IOException e){}
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
        try{
        Thread.sleep(3000);}catch (Exception e){}
        wait.until(ExpectedConditions.elementToBeClickable(homeIcon));
        homeIcon.click();
    }
//    public void writeDataLineByLine(String[] detail)
//    {
//          writer.writeNext(detail);
//
//    }
//    public void  Writerclose()  {
//        try {
//            writer.close();
//        }catch (IOException e){
//
//        }
//
//    }
public  void writeDataLineByLine(String[][] arr)
{
    // first create file object for file placed at location
    // specified by filepath
    File file = new File("Dataset1.csv");
    try {
        // create FileWriter object with file as parameter
        FileWriter outputfile = new FileWriter(file);

        // create CSVWriter object filewriter object as parameter
        CSVWriter writer = new CSVWriter(outputfile);

        // adding header to csv

        writer.writeNext(arr[0]);
        writer.writeNext(arr[1]);

        // closing writer connection
        writer.close();
    }catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
