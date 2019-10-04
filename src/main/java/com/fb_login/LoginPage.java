package com.fb_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ApplicationProperties;

public class LoginPage extends BasePage{

    @FindBy(id="email")
    private WebElement userName;

    @FindBy(id="pass")
    private WebElement password;

    @FindBy(id="loginbutton")
    private WebElement login;

    private String url= ApplicationProperties.INSTANCE.getBaseUrl();

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(getWebDriver(),this);
        getWebDriver().get(url);
    }

    public void login(String username,String passw){
        userName.sendKeys(username);
        password.sendKeys(passw);
        login.click();
    }
















}
