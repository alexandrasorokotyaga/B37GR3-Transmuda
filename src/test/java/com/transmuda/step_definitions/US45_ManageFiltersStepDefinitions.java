package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.ManageFilters;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US45_ManageFiltersStepDefinitions {

    LoginPage loginPage = new LoginPage();
    ManageFilters manageFilters = new ManageFilters();

    @Given("User logged in as a Store Manager")
    public void user_logged_in_as_a_store_manager() {
        loginPage.userName.sendKeys("salesmanager111");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();
    }

    @When("User goes to Vehicle cost page should be able to see")
    public void userGoesToVehicleCostPageShouldBeAbleToSee(List<String> expectedFilters) {

        manageFilters.fleetOption.click();
        BrowserUtils.sleep(2);
        manageFilters.vehicleCosts.click();
        BrowserUtils.sleep(2);

        List<String> actualFilters = BrowserUtils.getElementsText(manageFilters.headerFilter);
        actualFilters.removeIf(String::isEmpty);
        Assert.assertEquals(actualFilters, expectedFilters);

    }

    @When("User verifies that can check the first checkbox to select All Vehicle Costs")
    public void user_verifies_that_can_check_the_first_checkbox_to_select_all_vehicle_costs() {
        manageFilters.checkboxSelectAll.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(manageFilters.checkboxSelectAll.isSelected());
        BrowserUtils.sleep(2);
    }


}
