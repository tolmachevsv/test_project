package com.tolmachevsv.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@Tag("search_tests")
@Feature("Search")
@DisplayName("Search tests")
public class SearchTests extends TestBase {

    @AllureId("15215")
    @ValueSource(strings = {
            "dress",
            "blazer"
    })
    @ParameterizedTest(name = "Search for {0} in the women's section")
    public void WomanItemsSearchTest(String womanItem) {
        mainPage.openPage();
        mainPage.AcceptAllCookieAndCloseModalWindow();
        mainPage.clickSearchButton();
        searchPage.getSearchField().setValue(womanItem);
        searchPage.checkCorrectProductNameInResults(womanItem);
    }

    @ValueSource(strings = {
            "jacket",
            "jeans"
    })
    @ParameterizedTest(name = "Search for {0} in the man's section")
    public void MenItemsSearchTest(String manItem) {
        mainPage.openPage();
        mainPage.AcceptAllCookieAndCloseModalWindow();
        mainPage.clickSearchButton();
        searchPage.chooseAMaleGender();
        searchPage.getSearchField().setValue(manItem);
        searchPage.checkCorrectProductNameInResults(manItem);
    }
}
