package com.fb_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ApplicationProperties;

public class Registration extends BasePage{

    @FindBy(name="firstname")
    private WebElement fName;

    @FindBy(name ="lastname")
    private WebElement lName;

    @FindBy(name ="reg_email__")
    private WebElement mobNo;

    @FindBy(name="reg_passwd__")
    private WebElement passward;

    @FindBy(name ="birthday_day")
    private WebElement day;

    @FindBy(name="birthday_month")
    private WebElement month;

    @FindBy(name="birthday_year")
    private WebElement year;

    @FindBy(id = "u_0_6")
    private WebElement sex;

    private String url= ApplicationProperties.INSTANCE.getBaseUrl();

    public Registration(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get(url);
    }
    public void registration(String fNmae,String lastName,String mobileNo,String pass,
                             String Bday,String Bmonth,String Byear,String Gender)
    {
        fName.sendKeys(fNmae);
        lName.sendKeys(lastName);
        mobNo.sendKeys(mobileNo);
        passward.sendKeys(pass);

        Select dropDowm1=new Select(day);
        dropDowm1.selectByValue(Bday);

        Select dropDowm2=new Select(month);
        dropDowm2.selectByValue(Bmonth);

        Select dropDowm3=new Select(year);
        dropDowm3.selectByValue(Byear);

//        sex.sendKeys(Gender);
        sex.getText();
    }
}
