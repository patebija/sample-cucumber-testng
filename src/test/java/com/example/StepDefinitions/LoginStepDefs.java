package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefs extends BaseClass {

    @Before
    public void setup(){
        setDriver();
    }

    @After
    public void teardown(){
       closeDriver();
    }

    @Given("Launch Application")
    public void openApplication() {
        navigateToHome();

    }

    @Given("^User enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username, String password) {
        LoginPage.enterUsername(username);
        LoginPage.enterPassword(password);
    }

    @When("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        LoginPage.clickSubmit();
    }

    @Then("User is displayed home page")
    public void userIsDisplayedHomePage() {
        LoginPage.verifyTitle("Digital Bank");
    }
}
