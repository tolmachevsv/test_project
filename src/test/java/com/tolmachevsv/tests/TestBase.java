package com.tolmachevsv.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.tolmachevsv.helpers.Attach;
import com.tolmachevsv.pages.LoginPage;
import com.tolmachevsv.pages.MainPage;
import com.tolmachevsv.pages.SearchPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    final static String NAME = "sale";
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
