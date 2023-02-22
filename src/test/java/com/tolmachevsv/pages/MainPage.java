package com.tolmachevsv.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    SelenideElement searchButton = $("[role=search]");

    @Step("Открываем главную страницу")
    public void openPage() {
        open("");
    }

    @Step("Нажимаем на кнопку поиска")
    public void clickSearchButton() {
        searchButton.click();
    }
}
