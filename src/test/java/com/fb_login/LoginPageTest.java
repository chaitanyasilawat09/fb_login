package com.fb_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginPageTest extends BasePageTest{

    private LoginPage loginPage;

    @Test
    public void testLogin()
    {
        /*Put your FaceBook login ID and password */
        String userName="Login ID";
        String password="Login Password";
        loginPage = new LoginPage(driver);
        loginPage.login(userName,password);

        //    =========== for disable Chrome notification===============
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
    }
}