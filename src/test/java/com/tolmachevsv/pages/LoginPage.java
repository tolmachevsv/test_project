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

    @Step("Открываем страницу авторизации")
    public void openPage() {
        open("/logon");
        loginTitleText.shouldHave(text("Log in to your account"));
    }

    @Step("Вводим логин {text}")
    public void typeLogin(String text) {
        loginField.setValue(text);
    }

    @Step("Вводим пароль (секретный)")
    public void typePassword(String password) {
        passwordField.setValue(password);
    }

    @Step("Нажимаем кнопку LOG IN")
    public void clickLogonButton() {
        logonButton.click();
    }

    @Step("Проверка корректного ввода email")
    public void checkValidationText() {
        validationText.shouldHave(text("Enter a valid e-mail address."));
    }

    @Step("Открывается уведомление о просроченной сессии")
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

