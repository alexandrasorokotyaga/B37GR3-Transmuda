package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.CalendarEventsPageByAru;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.MainPageHover;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US42_CalendarEvents_StepDefinitions {


    LoginPage loginPage = new LoginPage();
    MainPageHover mainPageHover = new MainPageHover();
    CalendarEventsPageByAru calendarCreate = new CalendarEventsPageByAru();


    @When("user hover over Activities button he clicks to Calendar Page")
    public void user_hover_over_activities_button_he_clicks_to_calendar_page() {
        loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));
        BrowserUtils.sleep(1);

        BrowserUtils.hover(mainPageHover.activitiesButton);
        mainPageHover.calendarEvents.click();
        BrowserUtils.sleep(1);

    }

    @When("user clicks the button Create Calendar Event")
    public void user_clicks_the_button_create_calendar_event() {
        calendarCreate.createCalendarButton.click();
        BrowserUtils.sleep(1);

    }

    @When("user write message in Description")
    public void user_write_message_in_description() {

        BrowserUtils.sleep(5);

        Driver.getDriver().switchTo().frame(calendarCreate.iframe);
        calendarCreate.descriptionField.clear();
        BrowserUtils.sleep(1);
        calendarCreate.descriptionField.sendKeys("Hello World");
        calendarCreate.descriptionField.sendKeys(Keys.ENTER);


    }

    @Then("the message should be displayed")
    public void the_message_should_be_displayed() {

        String enteredText = calendarCreate.descriptionField.getText();
        BrowserUtils.sleep(1);
        Assert.assertEquals("Hello World", enteredText);
        Driver.getDriver().switchTo().defaultContent();


    }
}
