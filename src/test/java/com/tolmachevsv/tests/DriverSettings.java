package com.tolmachevsv.tests;

import com.codeborne.selenide.Configuration;
import com.tolmachevsv.config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.lang.String.format;

public class DriverSettings {

    public static CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);

    public static void configure() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        String loginSelenoid = credentials.loginSelenoid();
        String passwordSelenoid = credentials.passwordSelenoid();

        Configuration.browserCapabilities = capabilities;
        Configuration.baseUrl = System.getProperty("baseUrl", "https://www.zara.com/id/en/");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        String url = System.getProperty("selenoidUrl", "selenoid.autotests.cloud/wd/hub");
        Configuration.remote = format("https://%s:%s@%s", loginSelenoid, passwordSelenoid, url);
    }
}
