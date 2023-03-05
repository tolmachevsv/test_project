package com.tolmachevsv.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("login_tests")
@Feature("Authorization")
@DisplayName("Login tests")
@Severity(SeverityLevel.CRITICAL)
public class LoginTests extends TestBase {

    @AllureId("15213")
    @DisplayName("Successful login test")
    @Test
    public void SuccessfulLoginTest() {
        loginPage.openPage();
//        mainPage.AcceptAllCookieAndCloseModalWindow();
        loginPage.typeLogin(loginPage.getLogin());
        loginPage.typePassword(loginPage.getPassword());
        loginPage.clickLogonButton();
        // todo: think about the way to login successfully
        loginPage.showExpiredPageText();
    }

    @AllureId("15214")
    @DisplayName("Check login validation test")
    @Test
    public void CheckLoginValidationTest() {
        loginPage.openPage();
//        mainPage.AcceptAllCookieAndCloseModalWindow();
        loginPage.typeLogin("test123");
        loginPage.typePassword("123");
        loginPage.checkValidationText();
    }
}
