package com.tolmachevsv.tests;

import com.tolmachevsv.pages.LoginPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("login_tests")
public class LoginTests extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void SuccessfulLoginTest() {
        loginPage.openPage();
        loginPage.typeLogin(loginPage.getLogin());
        loginPage.typePassword(loginPage.getPassword());
        loginPage.clickLogonButton();
        // todo: think about the way to login successfully
        loginPage.showExpiredPageText();
    }

    @Test
    public void CheckLoginValidationTest() {
        loginPage.openPage();
        loginPage.typeLogin("test123");
        loginPage.typePassword("123");
        loginPage.checkValidationText();
    }
}
