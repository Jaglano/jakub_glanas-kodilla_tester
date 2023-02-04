package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StoreSearchExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");  	// [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/store");

        WebElement inputField = driver.findElement(By.name("search"));
        inputField.sendKeys("School");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("my_Class")));
    }
}
