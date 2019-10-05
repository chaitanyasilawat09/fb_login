package com.fb_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.*;

public class Click_On_ImageTest extends BasePageTest{

    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

//        ==========here findElement by linked test with link=============
//        WebElement element=driver.findElement(By.linkText("Facebook"));


//        =============Used to move mouse on thid element===============

        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("u_0_b"))).build().perform();
        assertThat("https://www.facebook.com/",is(driver.getCurrentUrl()));
        System.out.println("Success");
    }
}