package com.transmuda.step_definitions;

import com.transmuda.pages.VehiclePageBasePage;
import com.transmuda.pages.VehiclesContractsPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US36_VehiclesContractsPage_StepDefinitions {

    VehiclePageBasePage vehiclePageBasePage = new VehiclePageBasePage();
    VehiclesContractsPage vehiclesContractsPage = new VehiclesContractsPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("hover over fleet tab and click on Vehicle Contracts page")
    public void hover_over_fleet_tab_and_click_on_vehicle_contracts_page() {

        BrowserUtils.sleep(2);
        actions.moveToElement(vehiclesContractsPage.basePage_fleet).perform();
        BrowserUtils.sleep(2);
        actions.moveToElement(vehiclesContractsPage.vehiclesContracts).click().perform();

    }

    @Then("verify the title as expected")
    public void verify_the_title_as_expected() {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @When("hover over fleet tab and click on Vehicle Contracts page as driver")
    public void hoverOverFleetTabAndClickOnVehicleContractsPageAsDriver() {
        BrowserUtils.sleep(2);
        actions.moveToElement(vehiclesContractsPage.driver_basePage_fleet).perform();
        BrowserUtils.sleep(2);
        actions.moveToElement(vehiclesContractsPage.driver_vehiclesContracts).click().perform();
    }


    @Then("verify error message is displayed {string}")
    public void verify_error_message_is_displayed(String string) {
        Assert.assertTrue(vehiclesContractsPage.driver_errorMessage.isDisplayed());
    }


}
