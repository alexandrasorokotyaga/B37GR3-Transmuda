package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageHover {

    public MainPageHover() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class = 'title title-level-1'])[3]")
    public WebElement activitiesButton;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEvents;
}
