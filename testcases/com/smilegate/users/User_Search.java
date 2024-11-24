package com.smilegate.users;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.HomePageObject;
import pageObjects.PageGenerator;

public class User_Search extends BaseTest {
    private WebDriver driver;
    private HomePageObject homePage;
    private String gameName;

    @Parameters("browser")
    @BeforeMethod
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);

        homePage = PageGenerator.getHomePage(driver);

        gameName = "lord";
    }

    @Test
    public void TC_03_Check_Item_In_Dropdown_List() {
        homePage.waitForPageLoad();
        homePage.enterToSearchGamesTextbox(gameName);
        Assert.assertEquals(homePage.getSearchedResult(), "Lord Nine");
    }

    @Test
    public void TC_04_Check_Total_Items_In_Search_Result_Page() {
        homePage.waitForPageLoad();
        homePage.enterToSearchGamesTextbox("action");
        homePage.pressEnter();
        homePage.clickToGamePriceCheckbox();
        homePage.clickToDemoGameType();
        Assert.assertEquals(homePage.getNumberOfSearchResult(), "0");
    }

    @Test
    public void TC_05_Open_A_Product_Via_Search_Result() {
        homePage.waitForPageLoad();
        homePage.enterToSearchGamesTextbox("Love of");
        homePage.pressEnter();
        homePage.clickToGridViewButton();
        homePage.hoverOnGame();
        Assert.assertTrue(homePage.isHeartIconDisplayed());
        Assert.assertTrue(homePage.isCartIconDisplayed());
        Assert.assertEquals(homePage.getGameTitle(), "Pulse of Love");

    }

    @AfterMethod
    public void afterClass() {
        driver.quit();
    }
}
