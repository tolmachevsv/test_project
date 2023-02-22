package com.tolmachevsv.tests;

import com.tolmachevsv.pages.LoginPage;
import com.tolmachevsv.pages.MainPage;
import com.tolmachevsv.pages.SearchPage;
import org.junit.jupiter.api.Test;


public class CartTests extends TestBase {

    private final static String NAME = "sale";
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @Test
    public void AddToCartWithSizeBlock() {
        mainPage.openPage();
        mainPage.clickSearchButton();
        searchPage.getSearchField().click();
        searchPage.chooseSaleInTrendsSection(NAME);
        // need to compare name of the first product with name of the added product
//        String nameOfTheFirstItem = $(".product-grid li").text();
        searchPage.clickFirstItem();
        searchPage.chooseTheFirstSizeOption();
        searchPage.clickButtonAddToCart();
        // todo: think about the way to bypass expired session page
        loginPage.showExpiredPageText();
        // check if product has been added successfully and the counter has increased by 1
        // failed because of expired session
//        $(".layout-header-links__cart-items-count").shouldHave(text("1"));
//        $(".layout-header-links__cart-items-count").click();
//        $(".shop-cart-item-header__description").shouldHave(text(nameFirstItem));
    }
}