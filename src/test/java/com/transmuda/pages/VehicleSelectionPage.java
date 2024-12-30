package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleSelectionPage {

    public VehicleSelectionPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//input[@tabindex='-1'])[1]") //table/tbody/tr/td[@class='action-cell grid-cell grid-body-cell']
    public WebElement vehicleCheckbox;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[.=\"Vehicles\"]")
    public WebElement vehiclesOption;

}
