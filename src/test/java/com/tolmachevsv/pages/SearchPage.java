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

    SelenideElement searchField = $("#search-products-form-combo-input");
    SelenideElement trendsSection = $(".search-products-view__trends");
    SelenideElement firstGridItem = $(".product-grid li");
    ElementsCollection chooseSizeBlock = $$(".size-selector__size-list li");
    SelenideElement addToCart = $(".product-cart-buttons");
    SelenideElement genderField = $(".search-products-view__header");

    @Step("Выбираем наименование {name} в трендах")
    public void chooseSaleInTrendsSection(String name) {
        trendsSection.$(byText(name)).click();
    }

    @Step("Выбираем первый продукт")
    public void clickFirstItem() {
        firstGridItem.click();
    }

    @Step("Выбираем первый вариант из списка размеров")
    public void chooseTheFirstSizeOption() {
        chooseSizeBlock.get(0).shouldBe(visible);
        chooseSizeBlock.get(0).click();
    }

    @Step("Нажимаем на кнопку Add to cart")
    public void clickButtonAddToCart() {
        addToCart.click();
    }

    @Step("Проверяем, что наименование товара совпадает с запрашиваемым товаром")
    public void checkCorrectProductNameInResults(String item) {
        firstGridItem.shouldHave(text(item));
    }

    @Step("Выбираем мужской пол")
    public void chooseAMaleGender() {
        genderField.$(byText("Man")).click();
    }

    public SelenideElement getSearchField() {
        return searchField;
    }
}
