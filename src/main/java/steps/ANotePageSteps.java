package steps;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ANotepadPage;

import java.util.concurrent.TimeUnit;
public class ANotePageSteps {

    static {

        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");

    }

    protected WebDriver driver = new ChromeDriver();
    protected ANotepadPage aNotepadPage = new ANotepadPage();


    public void navigateToPage() {
    driver.get(aNotepadPage.url);

    }
    public void fillInField (){
        driver.findElement(By.xpath(aNotepadPage.noteNameField)).sendKeys("My First Note");
    }
    public void saveButtonClick(){
        driver.findElement(By.xpath(aNotepadPage.saveButton)).click();
    }
    public void warning (){
        driver.findElement(By.xpath(aNotepadPage.warning));
    }
    public void deleteButton (){
        driver.findElement(By.xpath(aNotepadPage.deleteButton)).click();
        driver.switchTo().alert().accept();
    }
    public void noAnyNote (){
        driver.findElement(By.xpath(aNotepadPage.noAnyNote));
    }
    public void driverQuit(){
    driver.quit();
}
    public void timeOut(){driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}

}