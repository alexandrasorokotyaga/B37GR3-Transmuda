package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class AccountPagesFilter {
    public AccountPagesFilter() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filterBtn;

    @FindBy(xpath = "(//span[normalize-space(text())='Customers'])[1]")
    public WebElement customersTitle;

    @FindBy(xpath = "(//span[normalize-space(text())='Accounts'])[1]")
    public WebElement accountsTitle;

    @FindBy(xpath = "//div[@class='ui-multiselect-menu']//ul/li/label")
    public WebElement selectItems;

    @FindBy(xpath = "//a[@class='add-filter-button']/span")
    public WebElement manageFilterButton;
}
