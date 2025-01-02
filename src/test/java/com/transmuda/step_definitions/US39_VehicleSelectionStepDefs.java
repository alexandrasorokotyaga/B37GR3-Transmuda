package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleSelectionPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US39_VehicleSelectionStepDefs {


//    public class LoginStepDefs {
//        LoginPage loginPage = new LoginPage();
//        VehicleSelectionPage vehicleSelectionPage = new VehicleSelectionPage();
//
//
//
//        @When("the user hover over fleet and clicks Vehicles")
//        public void the_user_hover_over_fleet_and_clicks_vehicles()  {
//            BrowserUtils.sleep(2);
//            BrowserUtils.waitForPageToLoad(5);
//            BrowserUtils.hover(vehicleSelectionPage.fleetModule);
//            BrowserUtils.sleep(2);
//            vehicleSelectionPage.vehiclesOption.click();
//
//
//        }
//
//        @Then("the sales manager should able to see all check boxes are unchecked")
//        public void the_sales_manager_should_able_to_see_all_check_boxes_are_unchecked() {
//
//        }
//    }

    LoginPage loginPage = new LoginPage();
    VehicleSelectionPage vehicleSelectionPage = new VehicleSelectionPage();

    @Given("User logged in as Store Manager")
    public void user_logged_in_as_store_manager() {
        loginPage.userName.sendKeys("storemanager60");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();
    }

    @Then("User should see all the checkboxes as unchecked.")
    public void user_should_see_all_the_checkboxes_as_unchecked() {
        vehicleSelectionPage.fleetModule.click();
        vehicleSelectionPage.vehiclesOption.click();
    }

    @Then("User should be able to check the first checkbox to select all the cars")
    public void user_should_be_able_to_check_the_first_checkbox_to_select_all_the_cars() {
        vehicleSelectionPage.checkboxAll.click();
        BrowserUtils.sleep(3);
        vehicleSelectionPage.checkboxAll.click();
    }

    @Then("User can select any car")
    public void user_can_select_any_car() {
        BrowserUtils.sleep(3);
        vehicleSelectionPage.vehicleCheckbox.click();
        Assert.assertTrue(vehicleSelectionPage.vehicleCheckbox.isSelected());
    }


    @Given("User logged in as Sales Manager")
    public void userLoggedInAsSalesManager() {
        loginPage.userName.sendKeys("salesmanager102");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();
    }
}





