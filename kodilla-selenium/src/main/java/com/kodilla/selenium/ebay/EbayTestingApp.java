package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EbayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gh-td-s")));


        WebElement inputfield = driver.findElement(By.name("_nkw"));
        inputfield.sendKeys("Laptop");
        inputfield.submit();
    }
}
