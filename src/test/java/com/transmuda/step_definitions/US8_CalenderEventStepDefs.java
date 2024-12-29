package com.transmuda.step_definitions;

import com.transmuda.pages.CalenderEventPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US8_CalenderEventStepDefs {
    CalenderEventPage calenderEventPage = new CalenderEventPage();


    @Then("the user clicks on the calender events")
    public void userClicksOnTheCalenderEvents() {
        BrowserUtils.waitFor(2);
        calenderEventPage.createCalendarEventButton.click();

    }

    @And("the user goes to activities modules")
    public void userGoesToActivitiesModules() {
        calenderEventPage.activities.click();
        BrowserUtils.waitFor(2);


    }

    @Then("the user hover to the Calender Event")
    public void hoverToTheCalenderEvent() {
        BrowserUtils.hover(calenderEventPage.calendarEventsTitle);
        calenderEventPage.calendarEventsTitle.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the user enables the Repeat checkbox")
    public void the_user_enables_the_checkbox() {

        calenderEventPage.eventCheckbox.click();
        BrowserUtils.waitFor(1);


    }

    @Then("the {string} field should display the default value {string}")
    public void the_field_should_display_the_default_value(String field, String value) {

        String actualValue = calenderEventPage.repeatEvery.getAttribute("value");
        String expectedValue = "1";
        Assert.assertEquals(actualValue, expectedValue);
        BrowserUtils.waitFor(1);


    }

    @And("clear the Repeat Every field")
    public void clearTheRepeatEveryField() {

        calenderEventPage.repeatEvery.clear();

    }

    @Then("an error message should be displayed saying {string}")
    public void anErrorMessageShouldBeDisplayedSaying(String textWarning) {
        String actualText = calenderEventPage.blankWarningText.getText();
        String expectedText = textWarning;
        Assert.assertEquals(actualText, expectedText);


    }
}