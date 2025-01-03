package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPageByAru {

    public CalendarEventsPageByAru(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarButton;

    @FindBy (xpath = "//iframe[contains(@id, 'oro_calendar_event_form_description')]")
    public WebElement iframe;

    @FindBy (xpath = "//p/br[@data-mce-bogus=\"1\"]/parent::p")
    public WebElement descriptionField;

   /* // Method to switch to the iframe
    public void switchToDescriptionIframe(WebDriver driver) {
        driver.switchTo().frame(iframe);
    }

    // Method to switch back to the main content
    public void switchToMainContent(WebDriver driver) {
        driver.switchTo().defaultContent();
    }

    */




}
