package com.tolmachevsv.tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("help_tests")
@Feature("Help")
@DisplayName("Help tests")
public class HelpTests extends TestBase {

    @DisplayName("Check payment methods")
    @Test
    public void checkPaymentMethods() {
        mainPage.openPage();
//        mainPage.AcceptAllCookieAndCloseModalWindow();
        helpPage.clickHelpButton();
        helpPage.clickPaymentButton();
        helpPage.clickPaymentMethodsButton();
        helpPage.checkPaymentsMethods();
    }
}
