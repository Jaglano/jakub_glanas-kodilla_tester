package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

    WebDriver driver;

    public KodillaLoginPom() {
        System.setProperty("webdriver.chrome.driver", "\"C:\\\\selenium-drivers\\\\Chrome\\\\chromedriver.exe\"");
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this); // [1]

        driver.navigate().to("https://kodilla.com/pl/test/login");
    }

    public boolean login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        String message = driver.switchTo().alert().getText();
        return message.equals("Jesteś teraz zalogowany");
    }

    public void close() {
        driver.close();
    }
}
