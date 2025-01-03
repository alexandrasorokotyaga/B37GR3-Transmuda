package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesContractsPage extends BasePage{

    public VehiclesContractsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //logged as store manager and sales manager
    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement basePage_fleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[6]")
    public WebElement vehiclesContracts;

    //logged as driver
    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement driver_basePage_fleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[4]")
    public WebElement driver_vehiclesContracts;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement driver_errorMessage;
}
