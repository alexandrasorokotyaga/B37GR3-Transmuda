package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderEventPage {
    public CalenderEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//span[normalize-space(text())='Activities'])[1]")
    public WebElement activities;


    @FindBy(xpath = "//*[text()='Calendar Events']")
    public WebElement calendarEventsTitle;


    @FindBy(xpath = "//a[normalize-space(text())='Create Calendar event']")
    public WebElement createCalendarEventButton;


    @FindBy(xpath = "//div//input[@data-name='recurrence-repeat']")
    public WebElement eventCheckbox;


    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement repeatEvery;


    @FindBy(xpath = "(//span[.='This value should not be blank.'])[3]")
    public WebElement blankWarningText;

}
