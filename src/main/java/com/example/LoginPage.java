package com.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseClass{


    public static String txtUsername = "username";
    public static String txtPassword = "password";
    public static String btnSubmit = "submit";


    public static void enterUsername(String strUsername){
        driver.findElement(By.id(txtUsername)).sendKeys(strUsername);
    }

    public static void enterPassword(String strPassword){
        driver.findElement(By.id(txtPassword)).sendKeys(strPassword);
    }

    public static void clickSubmit(){
        driver.findElement(By.id(btnSubmit)).click();
    }

    public static void verifyTitle(String title){
        Assert.assertTrue(driver.getTitle().equals(title));
    }

}
