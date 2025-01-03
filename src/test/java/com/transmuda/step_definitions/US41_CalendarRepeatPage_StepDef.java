package com.transmuda.step_definitions;

import com.transmuda.pages.CalendarRepeatPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


public class US41_CalendarRepeatPage_StepDef {
    CalendarRepeatPage calendarRepeatPage = new CalendarRepeatPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("the user logs in with username {string} and password {string}")
    public void theUserLogsInWithUsernameAndPassword(String username, String password) {
        calendarRepeatPage.login(username, password);
    }

    @When("the user goes to Activities modules")
    public void theUserGoesToActivitiesModules() {


        calendarRepeatPage.activitiesButton.click();

    }

    @And("the user hovers over the Activities button")
    public void theUserHoversOverTheActivitiesButton() {
        actions.moveToElement(calendarRepeatPage.activitiesButton).perform();
        BrowserUtils.waitFor(5);
    }



    @And("the user clicks on the Calendar Events button")
    public void theUserClicksOnTheCalendarEventsButton() {

        calendarRepeatPage.calendarEventsButton.click();
        BrowserUtils.waitForTitleContains("Calendar Events");
        BrowserUtils.waitFor(2);
    }

    @And("the user clicks on the Create Calendar Event button")
    public void theUserClicksOnTheCreateCalendarEventButton() {
        calendarRepeatPage.createCalendarEventsButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("the user selects the Repeat checkbox")
    public void theUserSelectsTheRepeatCheckbox() {
        calendarRepeatPage.repeatCheckbox.click();
        BrowserUtils.waitFor(2);
    }




    @Then("an error message {string} should be displayed")
    public void anErrorMessageShouldBeDisplayed(String expectedMessage) {
        if (expectedMessage.equals("The value must be at least 1.")) {
            Assert.assertTrue(calendarRepeatPage.lessThanOneErrorMessage.isDisplayed());
        } else if (expectedMessage.equals("The value cannot be more than 99.")) {
            Assert.assertTrue(calendarRepeatPage.greaterThanNinetyNineErrorMessage.isDisplayed());
        }
    }

    @Then("the user goes to Repeat Every input box")
    public void theUserGoesToRepeatEveryInputBox() {
        calendarRepeatPage.repeatEveryInputBox.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user enters {string} into the {string} input box")
    public void theUserEntersIntoTheInputBox(String inputValue, String inputBoxName) {

        calendarRepeatPage.repeatEveryInputBox.clear();


        calendarRepeatPage.repeatEveryInputBox.sendKeys(inputValue);

//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("arguments[0].setAttribute('value', arguments[1]);", calendarRepeatPage.repeatEveryInputBox, inputValue);

    }
}

