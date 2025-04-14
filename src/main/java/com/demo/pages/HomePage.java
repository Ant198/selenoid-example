package com.demo.pages;

import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

import java.sql.SQLOutput;

public class HomePage extends PageTools {

    private final By searchField = By.xpath("//input[@name=\"q\"]");
    private final By expectOption = By.xpath("//li[@data-index=\"6\"]");

    public boolean isExist() {
        waitForElementPresent(expectOption);
        return isElementVisible(expectOption);
    }
    public void selectOption() {
        System.out.println("complete");
        click(expectOption);
    }

    public void typeTicker(String name) {
        isElementVisible(searchField);
        type(name,searchField);
    }
}