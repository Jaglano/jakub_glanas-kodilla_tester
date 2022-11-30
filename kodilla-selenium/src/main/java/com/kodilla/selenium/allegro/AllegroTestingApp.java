package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");


        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]"));
        cookies.click();

        WebElement inputField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/header/div/div/div/div/form/input"));
        inputField.sendKeys("mavic mini");

        WebElement type = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/header/div/div/div/div/form/div[3]/div/select/optgroup[1]/option[3]"));
        type.click();
        type.submit();

    }
}
