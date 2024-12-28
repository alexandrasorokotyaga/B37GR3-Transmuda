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

    @FindBy(xpath = "//a[.='Learn how to use this space']")
    public WebElement learnButton;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement howToUsePinBarText;

    @FindBy(xpath = "//p[1]")
    public WebElement usePinDescription;

    @FindBy(xpath = "//div/p[1]")
    public WebElement usePinIcon;

//    @FindBy(xpath = "//div/p[2]")
//    public WebElement imageSource;

    @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement imageSource;
}
