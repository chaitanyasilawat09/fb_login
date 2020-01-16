package com.fb_login;

import com.sun.xml.internal.bind.v2.TODO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.*;

import java.util.logging.Level;

public class BasePageTest {

    protected WebDriver driver;

    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("Start");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");

//        ChromeOptions chromeOptions = new ChromeOptions() ;
        //         TODO to remove log from CHROME Browser
//        System.setProperty("webdriver.chrome.silentOutput", "true");
//        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
//        driver = new ChromeDriver(chromeOptions);

        System.setProperty("webdriver.gecko.driver", "geckodriver");
        //         TODO to remove log from FIREFOX Browser
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "firefoxLog");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        driver = new FirefoxDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("End");
    }
}
