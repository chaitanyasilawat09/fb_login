package com.fb_login;

import org.testng.annotations.Test;

import java.sql.Driver;

import static org.testng.Assert.*;

public class RegistrationTest extends BasePageTest {

    private Registration registration;

    @Test
    public void testRegistration() {
        String name="chait";
        String last="slaw";
        String mob="1234567890";
        String pass="abc123";
        String Bday="9";
        String Bmonth="11";
        String Byear="1998";
        String sex="2";


        registration=new Registration(driver);
        registration.registration(name,last,mob,pass,Bday,Bmonth,Byear,sex);

    }
}