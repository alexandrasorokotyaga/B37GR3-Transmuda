package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleSelectionPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VehicleSelectionStepDefs {


    public class LoginStepDefs {
        LoginPage loginPage = new LoginPage();
        VehicleSelectionPage vehicleSelectionPage = new VehicleSelectionPage();



        @When("the user hover over fleet and clicks Vehicles")
        public void the_sales_manager_is_on_the_vehicles_page() {
            BrowserUtils.sleep(2);
            BrowserUtils.waitForPageToLoad(5);

            BrowserUtils.hover(vehicleSelectionPage.fleetModule);
            BrowserUtils.sleep(2);
            vehicleSelectionPage.vehiclesOption.click();


        }

        @Then("the sales manager should able to see all check boxes are unchecked")
        public void the_sales_manager_should_able_to_see_all_check_boxes_are_unchecked() {

        }
    }
}





