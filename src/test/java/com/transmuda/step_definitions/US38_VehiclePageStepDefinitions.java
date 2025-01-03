package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehiclePageBasePage;
import com.transmuda.pages.VehiclesPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US38_VehiclePageStepDefinitions {
    
    VehiclePageBasePage vehiclePageBasePage = new VehiclePageBasePage();
    VehiclesPage vehiclesPage = new VehiclesPage();
    LoginPage loginPage = new LoginPage();

    @When("hover over fleet tab and click on vehicles module")
    public void user_hover_over_fleet_tab_and_click_on_vehicles_module() {

        vehiclePageBasePage.navigateToModule("Fleet", "Vehicles");

    }

    @When("hover over edit car info icons")
    public void hover_over_edit_car_info_icons() {
        //Actions actions = new Actions(Driver.getDriver());

         BrowserUtils.hover(vehiclesPage.editCarInfo.get(0));
        //actions.moveToElement(vehiclesPage.editCarInfo.get(0)).perform();
    }

    @Then("verify edit car info icons are displayed")
    public void verify_edit_car_info_icons_are_displayed() {

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(vehiclesPage.editIcon.get(1)).perform();

        Assert.assertTrue(vehiclesPage.editIcon.get(1).isDisplayed());


    }

    @When("the user logged with {string} and {string}")
    public void the_user_logged_with_and(String username, String password) {
       loginPage.login(username, password);
    }

}
