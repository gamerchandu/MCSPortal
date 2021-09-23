package pages;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Reservation{

    BaseClass baseClass = new BaseClass();

    String userIDtxt =   "//input[@id=\"ext-comp-1020\"]";
    String passwordtxt = "//input[@id=\"ext-comp-1021\"]";
    String loginBtn =    "//button[@id=\"ext-gen63\"]";
    String reservationLnk = "(//span[contains(text(),'Reservation')])[1]";
    String MCSWebPortalLnk = "//input[@id=\"ext-comp-2509\"]";
    String calendarLnk =  "//*[@id=\"ext-gen180\"]";
    String view247Lnk = "//*[@id=\"button-1068-btnInnerEl\"]";
    String viewWeekLnk = "//*[@id=\"button-1067-btnInnerEl\"]";
    String lookUpRegionLnk = "//*[@id=\"ext-gen197\"]";


    String regionSearchBar ="//*[@id=\"ext-comp-1238-filter-editor-0\"]"; // hit enter
    String allRegions = "//*[@id=\"ext-gen444\"]//div[contains(text(),'All')]"; //  click
    String Ok= "//button[contains(text(),'OK')]";


    public  void get(String url){
        baseClass.driver.get(url);
    }

    public String isPageTitle(){
        waitForElement(  By.xpath(userIDtxt));
        return baseClass.driver.getTitle();
    }

    public void setUserID(String userID){
        waitForElement( By.xpath(userIDtxt));
         baseClass.driver.findElement(By.xpath(userIDtxt)).sendKeys(userID);
    }

    public void setPassword(String pass){
        waitForElement(  By.xpath(passwordtxt));
        baseClass.driver.findElement(By.xpath(passwordtxt)).sendKeys(pass);
    }

    public void login(){
        waitForElement(  By.xpath(loginBtn));
        baseClass.driver.findElement(By.xpath(loginBtn)).click();
    }

    public  void waitForElement(By by){
        WebDriverWait wait = new WebDriverWait(baseClass.driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public Boolean isPageLoaded(){
        waitForElement(  By.xpath(reservationLnk));
        return baseClass.driver.findElement(By.xpath(reservationLnk)).isDisplayed();
    }

    public void clickOnReservation(){
        waitForElement(  By.xpath(reservationLnk));
        baseClass.driver.findElement(By.xpath(reservationLnk)).click();
    }

    public void clickOnCalendar(){
        waitForElement(  By.xpath(calendarLnk));
        baseClass.driver.findElement(By.xpath(calendarLnk)).click();
    }

    public void switch24By7Mode(){
         waitForElement(  By.xpath(view247Lnk));
         baseClass.driver.findElement(By.xpath(view247Lnk)).click();
        waitForElement(  By.xpath(viewWeekLnk));
         baseClass.driver.findElement(By.xpath(viewWeekLnk)).click();
    }

    public void clickOn(By by){
        waitForElement(  by);
        baseClass.driver.findElement(by);
    }

    public void selectAllRegions(){
        waitForElement(  By.xpath(lookUpRegionLnk));
        baseClass.driver.findElement(By.xpath(lookUpRegionLnk)).click();

        waitForElement(  By.xpath(regionSearchBar));
        baseClass.driver.findElement(By.xpath(regionSearchBar)).sendKeys("All Regions");
        baseClass.driver.findElement(By.xpath(regionSearchBar)).submit();

        waitForElement(  By.xpath(allRegions));
        baseClass.driver.findElement(By.xpath(allRegions)).click();

        waitForElement(  By.xpath(Ok));
        baseClass.driver.findElement(By.xpath(Ok)).click();

    }
}
