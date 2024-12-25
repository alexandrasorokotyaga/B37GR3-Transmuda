package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.VehiclePageBasePage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US38_VehiclePageStepDefinitions {
    
    VehiclePageBasePage vehiclePageBasePage = new VehiclePageBasePage();

    @When("hover over fleet tab and click on vehicles module")
    public void user_hover_over_fleet_tab_and_click_on_vehicles_module() {

        vehiclePageBasePage.navigateToModule("Fleet", "Vehicles");

    }
    @Then("verify edit car info icons are displayed")
    public void verify_edit_car_info_icons_are_displayed() {

    }

}
