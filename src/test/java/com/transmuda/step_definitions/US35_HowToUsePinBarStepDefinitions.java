package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.MainPageOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US35_HowToUsePinBarStepDefinitions {

    LoginPage loginPage = new LoginPage();
    MainPageOptions mainPageOptions = new MainPageOptions();

    @When("user enters truck driver username")
    public void user_enters_truck_driver_username() {
        loginPage.userName.sendKeys("user49");
    }

    @When("user enters truck driver password")
    public void user_enters_truck_driver_password() {
        loginPage.password.sendKeys("UserUser123");
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.submit.click();
    }

    @Then("user clicks options button")
    public void user_clicks_options_button() {
        mainPageOptions.optionsButton.click();
    }

    @Then("user clicks how to use pin bar")
    public void user_clicks_how_to_use_pin_bar() {
        mainPageOptions.howToUsePinBar.click();
    }

    @When("user enters Store Manager username")
    public void userEntersStoreManagerUsername() {
        loginPage.userName.sendKeys("storemanager59");
    }

    @And("user enters Store Manager password")
    public void userEntersStoreManagerPassword() {
        loginPage.password.sendKeys("UserUser123");
    }

    @Then("user should see how to use pinbar")
    public void userShouldSeeHowToUsePinbarText() {
        //Assert.assertTrue(mainPageOptions.howToUsePinBarText.isDisplayed());
        String expectedText = "How To Use Pinbar";
        Assert.assertEquals(expectedText, mainPageOptions.howToUsePinBarText.getText());
    }

    @When("user enters Sales Manager username")
    public void userEntersSalesManagerUsername() {
        loginPage.userName.sendKeys("salesmanager259");
    }

    @And("user enters Sales Manager password")
    public void userEntersSalesManagerPassword() {
        loginPage.password.sendKeys("UserUser123");
    }


    @When("user enters correct username {string}")
    public void userEntersCorrectUsername(String username) {
        loginPage.userName.sendKeys(username);
    }

    @And("user enters correct password {string}")
    public void userEntersCorrectPassword(String password) {
        loginPage.password.sendKeys(password);
    }
}
