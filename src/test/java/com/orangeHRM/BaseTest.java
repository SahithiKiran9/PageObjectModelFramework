package com.orangeHRM;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends BasePage {
    @BeforeClass
    public static void start() {
        startBrowser();
    }

    @AfterClass
    public static void close() {
        //to close the browser
        closeBrowser();
    }

    public static void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/Resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseURL);
    }

    public static void closeBrowser() {
        driver.close();
    }

}
