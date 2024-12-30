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

//    @FindBy(xpath = "//tbody/tr")
//    public WebElement rows;
//
//    @FindBy(tagName = "td")
//    public WebElement listOfColumns;

  //  @FindBy(xpath = "//span[@class='grid-header-cell__label']")
  //  public WebElement listOfColumns;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement hoverOverFleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[9]")
    public WebElement vehicleModelClick;
}
//
//    @FindBy(xpath = "(//th[@class='grid-cell grid-header-cell grid-header-cell-ModelName sortable renderable shortenable-label string-cell'])[1]")
//    public WebElement modelName;
//
//    @FindBy(xpath = "(//th[@class='grid-cell grid-header-cell grid-header-cell-Make sortable renderable shortenable-label string-cell'])[1]")
//    public WebElement make;
//
//    @FindBy (xpath = "(//th[@class='grid-cell grid-header-cell grid-header-cell-Canberequested sortable renderable shortenable-label boolean-cell'])[1]")
//    public WebElement canBeRequested;
//
//    @FindBy (xpath = "(//th[@class='grid-cell grid-header-cell grid-header-cell-CatalogValue sortable renderable number-cell'])[1]")
//    public WebElement CVVI;
//
//    @FindBy(xpath = "(//th[@class='grid-cell grid-header-cell grid-header-cell-CO2Fee sortable renderable shortenable-label number-cell'])[1]")
//    public WebElement co2Fee;
//
//    @FindBy(xpath = "(//th[@class='grid-cell grid-header-cell grid-header-cell-Cost sortable renderable shortenable-label number-cell'])[1]")
//    public WebElement costDepreciated;
//
//    @FindBy(xpath = "(//th[@class='grid-cell grid-header-cell grid-header-cell-TotalCost sortable renderable shortenable-label number-cell'])[1]")
//    public WebElement totalCost;
//
//    @FindBy(xpath = "(//th[@class='grid-cell grid-header-cell grid-header-cell-CO2Emissions sortable renderable shortenable-label number-cell'])[1]")
//    public WebElement co2Emissions;
//
//    @FindBy(xpath = "(//th[@class='grid-cell grid-header-cell grid-header-cell-FuelType sortable renderable shortenable-label string-cell'])[1]")
//    public WebElement fuelType;
//
//    @FindBy(xpath = "(//th[@class='grid-cell grid-header-cell grid-header-cell-Vendors sortable renderable shortenable-label string-cell'])[1]")
//    public WebElement vendors;
//}
