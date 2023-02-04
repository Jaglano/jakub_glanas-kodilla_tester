package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegroTestingAppCssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));


        driver.findElement(By.cssSelector("button[data-role*=accept-consent]")).click();
        WebElement category = driver.findElement(By.cssSelector("select[data-role*=filters-dropdown-toggle]"));
        Select categorySelect = new Select(category);
        categorySelect.selectByVisibleText("Elektronika");
        WebElement inpuField = driver.findElement(By.cssSelector("input[data-role*=search-input]"));
        inpuField.sendKeys("Mavic mini");
        inpuField.submit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article")));
        List<WebElement> element = driver.findElements(By.cssSelector("section > article"));
        for (WebElement elementList : element) {
            System.out.println(elementList.getText());
            System.out.println("/----Next article---/");

        }
    }
}
