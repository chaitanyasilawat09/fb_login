package com.fb_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BasePageTest {

    protected WebDriver driver;

    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("Start");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
        driver=new ChromeDriver();
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
