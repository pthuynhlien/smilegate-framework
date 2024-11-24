package pageObjects;

import commons.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageUIs.HomePageUI;


public class HomePageObject extends BasePage {
    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void enterToSearchGamesTextbox(String gameName) {
        waitForElementVisible(driver, HomePageUI.SEARCH_GAMES_TEXTBOX);
        sendKeyToElement(driver, HomePageUI.SEARCH_GAMES_TEXTBOX, gameName);
    }

    public String getSearchedResult() {
        waitForElementVisible(driver, HomePageUI.SEARCHED_RESULT);
        return getElementText(driver, HomePageUI.SEARCHED_RESULT);
    }

    public void pressEnter() {
        waitForElementVisible(driver, HomePageUI.SEARCH_GAMES_TEXTBOX);
        pressKeyToElement(driver, HomePageUI.SEARCH_GAMES_TEXTBOX, Keys.ENTER);
    }

    public String getNumberOfSearchResult() {
        waitForElementVisible(driver, HomePageUI.NUMBER_OF_FILTER_RESULT);
        return getElementText(driver, HomePageUI.NUMBER_OF_FILTER_RESULT);
    }

    public void clickToDemoGameType() {
        waitForElementClickable(driver, HomePageUI.DEMO_GAME_TYPE);
        clickToElement(driver, HomePageUI.DEMO_GAME_TYPE);
        sleepInSeconds(5);
    }

    public void clickToGridViewButton() {
        waitForElementClickable(driver, HomePageUI.GRID_VIEW_BUTTON);
        clickToElement(driver, HomePageUI.GRID_VIEW_BUTTON);
    }

    public void hoverOnGame() {
        waitForElementVisible(driver, HomePageUI.GAME_ITEM);
        hoverToElement(driver, HomePageUI.GAME_ITEM);
    }

    public String getGameTitle() {
        waitForElementVisible(driver, HomePageUI.GAME_TITLE);
        return getElementText(driver, HomePageUI.GAME_TITLE);
    }

    public void waitForPageLoad() {
        sleepInSeconds(5);
    }

    public boolean isHeartIconDisplayed () {
        waitForElementVisible(driver, HomePageUI.HEART_ICON);
        return isElementDisplayed(driver, HomePageUI.HEART_ICON);
    }

    public boolean isCartIconDisplayed () {
        waitForElementVisible(driver, HomePageUI.CART_ICON);
        return isElementDisplayed(driver, HomePageUI.CART_ICON);
    }

    public void clickToGamePriceCheckbox() {
        waitForElementClickable(driver, HomePageUI.GAME_PRICE_CHECKBOX);
        checkToCheckbox(driver, HomePageUI.GAME_PRICE_CHECKBOX);
        sleepInSeconds(5);
    }
}
