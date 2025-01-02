package com.transmuda.step_definitions;

import com.transmuda.pages.AccountPagesFilter;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US44_AccountsPageStepDefs {
    AccountPagesFilter accountPagesFilter = new AccountPagesFilter();

    @When("the user goes to Customers modules")
    public void the_user_goes_to_customers_modules() {
        BrowserUtils.waitFor(2);
        accountPagesFilter.customersTitle.click();
        BrowserUtils.waitFor(2);


    }


    @Then("the user hover to the Accounts")
    public void the_user_hover_to_the_accounts() {
        BrowserUtils.hover(accountPagesFilter.accountsTitle);
        BrowserUtils.waitFor(2);



    }


    @Then("the user clicks on the Accounts")
    public void the_user_clicks_on_the_accounts() {
        accountPagesFilter.accountsTitle.click();
        BrowserUtils.waitFor(2);

    }


    @Then("the user clicks on the filter icon")
    public void the_user_clicks_on_the_filter_icon() {
        accountPagesFilter.filterBtn.click();
        BrowserUtils.waitFor(2);
       accountPagesFilter.manageFilterButton.click();
       BrowserUtils.waitFor(1);


    }


    @Then("verify the users see below filters under Manage filters items on the Accounts page")
    public void verifyTheUsersSeeBelowFiltersUnderItemsOnTheAccountsPage(List<String> expectedFilterItems) {

    List<String> actualFilterItems = BrowserUtils.getElementsText(By.xpath("//div[contains(@class, 'ui-multiselect-menu')]//ul/li//label"));

    Assert.assertEquals(expectedFilterItems, actualFilterItems);

    }


}
