package com.example.StepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStepDefs {

    @Given("^Launch Google Home Page$")
    public void launchGoogle(){

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getTitle().equals("Google"));
        driver.close();

    }
}
