package com.tolmachevsv.pages;

import com.codeborne.selenide.SelenideElement;
import com.tolmachevsv.tests.DriverSettings;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    String login = DriverSettings.credentials.loginZara();
    String password = DriverSettings.credentials.passwordZara();

    SelenideElement loginTitleText = $(".logon-view__section-title span");
    SelenideElement loginField = $("[name=logonId]");
    SelenideElement passwordField = $("[name=password]");
    SelenideElement logonButton = $(byText("LOG IN"));
    SelenideElement validationText = $("#form-input__desc-logonId");
    SelenideElement expiredSessionText = $(".content-header__title span");

    @Step("Open /login")
    public void openPage() {
        open("/logon");
        loginTitleText.shouldHave(text("Log in to your account"));
    }

    @Step("Type login {text}")
    public void typeLogin(String text) {
        loginField.setValue(text);
    }

    @Step("Type secret password")
    public void typePassword(String password) {
        passwordField.setValue(password);
    }

    @Step("Click on the LOG IN button")
    public void clickLogonButton() {
        logonButton.click();
    }

    @Step("Check if we type correct email")
    public void checkValidationText() {
        validationText.shouldHave(text("Enter a valid e-mail address."));
    }

    @Step("Expired session notification opens")
    public void showExpiredPageText() {
        expiredSessionText.shouldHave(text("The session has expired"));
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

