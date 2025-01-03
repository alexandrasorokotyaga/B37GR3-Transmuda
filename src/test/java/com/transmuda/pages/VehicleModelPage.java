
package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleModelPage extends BasePage{

    public VehicleModelPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']")
    public WebElement tableVehicleModel;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement hoverOverFleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[9]")
    public WebElement vehicleModelClick;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement driver_basePage_fleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[7]")
    public WebElement driver_vehiclesModel;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement driver_errorMessage;
}

