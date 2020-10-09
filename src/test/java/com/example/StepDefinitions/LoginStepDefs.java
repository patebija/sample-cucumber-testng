package com.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginStepDefs {

    WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Given("Launch Application")
    public void openApplication() {
        driver.get("http://dbankdemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Given("^User enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("User is displayed home page")
    public void userIsDisplayedHomePage() {
        Assert.assertTrue(driver.getTitle().equals("Digital Bank"));
    }
}
