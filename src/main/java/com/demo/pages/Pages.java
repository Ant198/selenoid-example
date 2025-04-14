package com.demo.pages;

import com.demo.core.allure.AllureLogger;

public class Pages extends AllureLogger {
    /**
     * Pages
     */
    private static LoginPage loginPage;
    private static RevenuePage revenuePage;
    private static HomePage homePage;
    private static IncomeStatementPage incomeStatementPage;

    /**
     * This function return an instance of `NavigationPage`
     */
    public static LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public static RevenuePage revenuePage() {
        if (revenuePage == null) {
            revenuePage = new RevenuePage();
        }
        return revenuePage;
    }

    public static HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public static IncomeStatementPage incomeStatementPage() {
        if (incomeStatementPage == null) {
            incomeStatementPage = new IncomeStatementPage();
        }
        return incomeStatementPage;
    }
}