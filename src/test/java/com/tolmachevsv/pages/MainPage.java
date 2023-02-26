package com.tolmachevsv.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    SelenideElement searchButton = $("[role=search]");

    @Step("Open the main page")
    public void openPage() {
        open("");
    }

    @Step("Click on the search button")
    public void clickSearchButton() {
        searchButton.click();
    }
}
