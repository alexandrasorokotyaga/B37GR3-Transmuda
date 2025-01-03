package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.OrioncDocPage;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class US34_OroincDocStepDefs {

    OrioncDocPage orioncDocPage = new OrioncDocPage();
    LoginPage loginPage = new LoginPage();
    String actualUrl;
    String actualTitle;

    @Given("User should able to land the home page")
    public void user_should_able_to_land_the_home_page() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("driver_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        loginPage.submit.click();
    }
    @When("User click the question icon")
    public void user_click_the_question_icon() {
        orioncDocPage.questionIcon.click();
    }

    @When("User navigates to the Oroinc Documentation page")
    public void user_navigates_to_the_oroinc_documentation_page() {
        Object[] windowHandles=Driver.getDriver().getWindowHandles().toArray();
        Driver.getDriver().switchTo().window((String) windowHandles[1]);
        actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
    }

    @Then("Verify the Oroinc Documentation page URL and Header")
    public void verify_the_oroinc_documentation_page_url() {
        // Verify the page URL
        String expectedUrl = "https://doc.oroinc.com/";
        assertEquals("URL does not match with expected!", expectedUrl, actualUrl);
        String expectedTitle = "Welcome to Oro Documentation";
        assertEquals("Title does not match with expected!",expectedTitle,actualTitle);
    }

}
