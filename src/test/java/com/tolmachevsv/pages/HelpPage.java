package com.tolmachevsv.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HelpPage {

    private final ElementsCollection listOfThePayments = $$(".listPaymentMethods li");
    private final String[] expectedListOfThePayments = {
            "Visa",
            "Mastercard",
            "Online Banking",
            "Bank Transfer/Virtual Account"
    };

    public void checkPaymentsMethods() {
        listOfThePayments.shouldHave(size(4))
                .shouldHave(texts("Visa",
                "Mastercard",
                "Online Banking",
                "Bank Transfer/Virtual Account"
                ));
    }

    public void clickHelpButton() {
        $(byText("HELP")).click();
        $(".content-header__title").shouldHave(text("Help"));
    }

    public void clickPaymentButton() {
        $(byText("Payment")).parent().click();
    }

    public void clickPaymentMethodsButton() {
        $(byText("Payment methods")).parent().click();
    }
}
