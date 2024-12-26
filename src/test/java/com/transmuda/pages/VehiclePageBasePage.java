package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePageBasePage extends BasePage{

    public VehiclePageBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
