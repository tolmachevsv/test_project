package com.tolmachevsv.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    private final SelenideElement searchField = $("#search-products-form-combo-input");
    private final SelenideElement trendsSection = $(".search-products-view__trends");
    private final SelenideElement findTheGridItem = $$(".product-grid li")
            .findBy(text("BASIC EXTRA-FINE KNIT TOP"));
    private final ElementsCollection searchItem = $$(".product-grid li");
    private final ElementsCollection chooseSizeBlock = $$(".size-selector__size-list li");
    private final SelenideElement addToCart = $(".product-cart-buttons");
    private final SelenideElement genderField = $(".search-products-view__header");

    @Step("Choose a {name} in trends")
    public void chooseSaleInTrendsSection(String name) {
        trendsSection.$(byText(name)).click();
    }

    @Step("Choose the product")
    public void clickOnTheItem() {
        findTheGridItem.click();
    }

    @Step("Choose the first option from the list of sizes")
    public void chooseTheFirstSizeOption() {
        chooseSizeBlock.get(0).shouldBe(visible);
        chooseSizeBlock.get(0).click();
    }

    @Step("Click on the 'Add to cart' button")
    public void clickButtonAddToCart() {
        addToCart.click();
    }

    @Step("Check if the product name matches the requested product")
    public void checkCorrectProductNameInResults(String item) {
        SelenideElement requirementItem = searchItem.findBy(text(item));
        requirementItem.shouldHave(text(item));
    }

    @Step("Choose the male gender")
    public void chooseAMaleGender() {
        genderField.$(byText("Man")).click();
    }

    public SelenideElement getSearchField() {
        return searchField;
    }
}
