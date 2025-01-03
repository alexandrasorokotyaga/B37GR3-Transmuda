package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class ='message']")

    public WebElement errorMessage;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")

    public WebElement defaultDropdown;
}
