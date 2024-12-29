package com.transmuda.step_definitions;

import com.transmuda.pages.OrioncDocPage;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US34_OroincDocStepDefs {

    OrioncDocPage orioncDocPage = new OrioncDocPage();

    @Given("User should able to land the home page")
    public void user_should_able_to_land_the_home_page() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));

    }
    @When("User click the question icon")
    public void user_click_the_question_icon() {
        orioncDocPage.questionIcon.click();
    }
    @When("User navigates to the Oroinc Documentation page")
    public void user_navigates_to_the_oroinc_documentation_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the Oroinc Documentation page URL and Header")
    public void verify_the_oroinc_documentation_page_url_and_header() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
