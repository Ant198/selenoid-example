package com.demo.pages;

import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

public class IncomeStatementPage extends PageTools {
private final By revenue = By.xpath("//div[@role=\"gridcell\"]//a[text()=\"Revenue\"]");

public void clickRevenue() {
    waitForElementVisibility(revenue);
    click(revenue);
}

}