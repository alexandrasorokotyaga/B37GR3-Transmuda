package com.transmuda.step_definitions;

import com.transmuda.pages.VehicleModelPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class US37_VehicleModelPage_StepDefinitions {

    Actions actions = new Actions(Driver.getDriver());
    VehicleModelPage vehicleModelPage = new VehicleModelPage();


    @When("Hover over to Fleet")
    public void hover_over_to_fleet() {
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleModelPage.hoverOverFleet).perform();

    }

    @When("Click Vehicles model")
    public void click_vehicles_model() {
        actions.moveToElement(vehicleModelPage.vehicleModelClick).click().perform();

    }

    public static List<String> cleanColumnNames(List<String> columnNames){
        return columnNames.stream()
                .map(String::trim)            // Remove extra spaces
                .filter(s -> !s.isEmpty())    // Remove empty strings
                .distinct() // Remove duplicates
                .collect(Collectors.toList());
    }



    @Then("User can see ten columns")
    public void user_can_see_columns() {
        WebElement table = vehicleModelPage.tableVehicleModel;
        BrowserUtils.sleep(4);

        List<WebElement> columnsInRow = table.findElements(By.tagName("th"));
        List<WebElement> rows = columnsInRow.get(0).findElements(By.xpath("//thead"));


        for (int i = 0; i < rows.size()-1; i++) {
            System.out.println(rows.get(0).getText());

        }

        // Define the expected column names
        List<String> expectedColumnNames = Arrays.asList("MODEL NAME", "MAKE", "CAN BE REQUESTED", "CVVI", "CO2 FEE (/MONTH)",
        "COST (DEPRECIATED)", "TOTAL COST (DEPRECIATED)", "CO2 EMISSIONS","FUEL TYPE", "VENDORS");


        // Extract the actual column names from the table
        List<String> actualColumnNames = new ArrayList<>();
        for (WebElement column : columnsInRow) {
            actualColumnNames.add(column.getText().trim());
        }

        List<String> cleanedActualColumnNames = cleanColumnNames(actualColumnNames);


        // Assert that the expected column names match the actual column names
        Assert.assertEquals("The column names do not match!", expectedColumnNames, cleanedActualColumnNames);

    }

    @When("Hover over to Fleet and click Vehicles model")
    public void hoverOverToFleetAndClickVehiclesModel() {
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleModelPage.driver_basePage_fleet).perform();
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleModelPage.driver_vehiclesModel).click().perform();
    }

    @Then("User can see error message")
    public void userCanSeeErrorMessage() {
        Assert.assertTrue(vehicleModelPage.driver_errorMessage.isDisplayed());
    }

}



