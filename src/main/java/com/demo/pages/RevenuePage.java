package com.demo.pages;

import com.codeborne.selenide.SelenideElement;
import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RevenuePage extends PageTools {
    List<Map<String, String>> listOfRevenue;
    private final By revenue = By.xpath("//table[contains(@class, \"historical_data_table\")][1]//tr");

    public void setListOfRevenue() {
        List<SelenideElement> elements = getElements(revenue);
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(elements.get(i).text().split(" ", 2)));
        }
        System.out.println(elements.get(1).text());
    }
}