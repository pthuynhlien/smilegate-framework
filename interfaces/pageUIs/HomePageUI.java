package pageUIs;

public class HomePageUI {
    public static final String SEARCH_GAMES_TEXTBOX = "//input[@placeholder='Search Games']";

    public static final String SEARCHED_RESULT = "//div[@class='relative']//div[contains(@class, 'inds-autocomplete-list')]//a[@target = '_blank']/div/p";

    public static final String DEMO_GAME_TYPE = "//input[@value = 'DEMO']/following-sibling::label/span";

    public static final String NUMBER_OF_FILTER_RESULT = "//span[contains(text(),'Search Result')]/following-sibling::em";

    public static final String GRID_VIEW_BUTTON = "//span[contains(text(), '카드형')]/parent::i//parent::button";

    public static final String GAME_ITEM = "//p[contains(text(), 'Pulse of Love')]/parent::div/parent::div[contains(@class,'inds-product-relate-games-card-box')]";

    public static final String GAME_TITLE = "//p[@class='inds-product-card-hover-title' and contains(text(), 'Pulse of Love')]";

    public static final String HEART_ICON = "//p[@class='inds-product-card-hover-title' and contains(text(), 'Pulse of Love')]/parent::div/preceding-sibling::div//i[contains(@class,'community-like-fill')]";

    public static final String CART_ICON = "//p[@class='inds-product-card-hover-title' and contains(text(), 'Pulse of Love')]/parent::div/preceding-sibling::div//i[contains(@class,'avigation-cart-fill')]";

    public static final String GAME_PRICE_CHECKBOX = "//label[contains(text(),'View Discounted Only')]/preceding-sibling::input";
}
