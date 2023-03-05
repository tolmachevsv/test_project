package com.tolmachevsv.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement searchButton = $("[role=search]");
    private final SelenideElement acceptCookies = $("#onetrust-accept-btn-handler");
    private final SelenideElement closeModalWindow = $(".modal__body")
            .$(byText("Yes, continue on Indonesia"));

    @Step("Open the main page")
    public void openPage() {
        open("");
    }

    @Step("Click on the search button")
    public void clickSearchButton() {
        searchButton.click();
    }

    @Step("Accept all cookies and close a modal window")
    public void AcceptAllCookieAndCloseModalWindow() {
        acceptCookies.click();
        closeModalWindow.click();
    }
}
