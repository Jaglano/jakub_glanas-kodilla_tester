package com.kodilla.selenium.visual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");        // [1]
        WebDriver webDriver = new ChromeDriver();

        WorldTimePage page = new WorldTimePage(webDriver);

        page.open();
        page.close();
    }
}
