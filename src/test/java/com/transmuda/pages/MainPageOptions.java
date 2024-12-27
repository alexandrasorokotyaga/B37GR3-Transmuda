package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageOptions {

    public MainPageOptions() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa-bars']")
    public WebElement optionsButton;

    @FindBy(xpath = "//a[@href='/pinbar/help']")
    public WebElement howToUsePinBar;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement howToUsePinBarText;

}
