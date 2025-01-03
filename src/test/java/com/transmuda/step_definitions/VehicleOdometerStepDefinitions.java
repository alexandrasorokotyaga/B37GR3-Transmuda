package com.transmuda.step_definitions;

import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.pages.VehiclePageBasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehicleOdometerStepDefinitions {

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
    VehiclePageBasePage vehiclePageBasePage = new VehiclePageBasePage();

    @When("the user hover over on the Fleet tab")
    public void theUserHoverOverOnTheFleetTab() {
        vehiclePageBasePage.navigateToModule("Fleet", "Vehicle Odometer");
    }

    @And("the user click on Vehicle Odometer")
    public void theUserClickOnVehicleOdometer() {
    }

    @Then("the user see the default page")
    public void theUserSeeTheDefaultPage() {
    }
    @Then("the user can view per page accepted result by default")
    public void theUserCanViewPerPageByDefault() {
        String expectedDefaultValue = "25";
        Assert.assertEquals(expectedDefaultValue,vehicleOdometerPage.defaultDropdown.getText());
    }

    @When("the user navigates to the Vehicle Odometer page")
    public void theUserNavigatesToTheVehicleOdometerPage() {
        System.out.println("User navigates to the Vehicle Odometer page");
    }

    @Then("the user should see an error message for restricted access")
    public void theUserShouldSeeAnErrorMessageForRestrictedAccess() {
        Assert.assertTrue(vehicleOdometerPage.errorMessage.isDisplayed());
        System.out.println("User sees an error message for restricted access");
    }



}
