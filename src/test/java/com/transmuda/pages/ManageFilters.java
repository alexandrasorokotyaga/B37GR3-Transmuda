package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ManageFilters {
    public ManageFilters() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetOption;

    @FindBy(xpath = "(//li[@class='dropdown-menu-single-item'])[2]//span")
    public WebElement vehicleCosts;

    @FindBy(xpath = "//table[contains(@class, 'grid')]//th//span[contains(@class, 'grid-header-cell__label')]")
    public List<WebElement> headerFilter;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input")
    public WebElement checkboxSelectAll;

}
