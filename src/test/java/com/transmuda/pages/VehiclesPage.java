package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage {

    public VehiclesPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//table/tbody/tr/td[@data-column-label='test']")
    @FindBy (xpath = "//table/tbody/tr/td[@class='action-cell grid-cell grid-body-cell']")
    public List<WebElement> editCarInfo;

    //@FindBy (xpath = "//table/tbody/tr/td[@data-column-label='test']//ul[@class='nav nav-pills icons-holder launchers-list']/li/a[@title='Edit']")
    @FindBy (xpath = "(//ul[@class='nav nav-pills icons-holder launchers-list']/li[@class='launcher-item'])")
    public List<WebElement> editIcon;
}
