package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.MainPageOptions;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class US35_HowToUsePinBarStepDefinitions {

    LoginPage loginPage = new LoginPage();
    MainPageOptions mainPageOptions = new MainPageOptions();
    Actions actions = new Actions(Driver.getDriver());


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


    @When("user enters Store Manager username")
    public void userEntersStoreManagerUsername() {
        loginPage.userName.sendKeys("storemanager59");
    }

    @And("user enters Store Manager password")
    public void userEntersStoreManagerPassword() {
        loginPage.password.sendKeys("UserUser123");
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


    @Then("user clicks {string}")
    public void userClicks(String arg0) {
        mainPageOptions.learnButton.click();
    }


    @And("user sees {string}")
    public void userSees(String howToMessage) {
        Assert.assertEquals(howToMessage, mainPageOptions.howToUsePinBarText.getText());
    }

    @And("user sees description {string}")
    public void userSeesDescription(String description) {
        Assert.assertEquals(description, mainPageOptions.usePinDescription.getText());
    }

    @Then("user should see an image on the page")
    public void userShouldSeeAnImageOnThePage() {
        String expectedImageSource = "/bundles/oronavigation/images/pinbar-location.jpg";
        String actualImageSource = mainPageOptions.imageSource.getAttribute("src");
        Assert.assertTrue(actualImageSource.contains(expectedImageSource));
    }
}
