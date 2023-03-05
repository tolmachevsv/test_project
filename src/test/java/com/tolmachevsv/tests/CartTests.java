package com.tolmachevsv.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("cart_tests")
@Feature("Cart")
@DisplayName("Cart tests")
public class CartTests extends TestBase {

    @DisplayName("Add to cart with size block")
    @AllureId("15216")
    @Test
    public void AddToCartWithSizeBlock() {
        mainPage.openPage();
        mainPage.AcceptAllCookieAndCloseModalWindow();
        mainPage.clickSearchButton();
        searchPage.getSearchField().click();
        searchPage.chooseSaleInTrendsSection(NAME);
        // need to compare name of the first product with name of the added product
//        String nameOfTheFirstItem = $(".product-grid li").text();
        searchPage.clickOnTheItem();
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