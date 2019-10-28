package com.automation.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupActions {

    private static WebDriver driver;

    public void startBrowser() {
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void quitBrowser() {
        driver.close();
        driver.quit();
        driver = null;
    }
}
