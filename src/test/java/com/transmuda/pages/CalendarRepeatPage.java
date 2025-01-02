package com.transmuda.pages;

import com.transmuda.utilities.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalendarRepeatPage {


    public CalendarRepeatPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement repeatEvery;
    @FindBy(xpath = "(//span[normalize-space(text())='Activities'])[1]")
    //    @FindBy(xpath = "//span[@class='title title-level-1' and text()= 'Activities']")
    public WebElement activitiesButton;

    @FindBy(xpath = "//*[text()='Calendar Events']")
    public WebElement calendarEventsButton;
    @FindBy(xpath = "//a[normalize-space(text())='Create Calendar event']")
    public WebElement createCalendarEventsButton;
    @FindBy(xpath = "//div//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckbox;
    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement repeatEveryInputBox;
    @FindBy(xpath = "//span[text()='The value have not to be less than 1']")
    public WebElement zeroValueInput;
    @FindBy(xpath = "//span[text()='The value have not to be less than 1']")
    public WebElement lessThanOneErrorMessage;
    @FindBy(xpath = "//span[text()='The value have not to be more than 99']")
    public WebElement greaterThanNinetyNineErrorMessage;
    @FindBy(id="prependedInput")
    public WebElement usernameField;



    @FindBy(id="prependedInput2")
    public WebElement passwordField;

    @FindBy(name = "_submit")
    public WebElement loginButton;

    public void login(String username,String password){

        usernameField.sendKeys(username);

        passwordField.sendKeys(password);

        loginButton.click();
    }





}
