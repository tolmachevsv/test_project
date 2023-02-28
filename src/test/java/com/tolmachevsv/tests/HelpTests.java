package com.tolmachevsv.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Tag("help_tests")
@Feature("Help")
public class HelpTests extends TestBase {

    @Test
    public void checkPaymentMethods() {
        mainPage.openPage();
        $(byText("help")).click();
        $("h1 .content-header__title").shouldHave(text("Help"));
        $(byText("Payment")).parent().click();
    }
}
