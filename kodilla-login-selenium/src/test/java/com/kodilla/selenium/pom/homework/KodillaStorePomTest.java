package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTest {
    KodillaStorePom searchPom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        searchPom = new KodillaStorePom (driver);
    }

    @Test
    public void NotebookSearch() throws InterruptedException {
        String searchWord = "NoteBook";
        searchPom.search(searchWord);
        Thread.sleep(5000);

    }
    @Test
    public void SchoolSearch() throws InterruptedException {
        String searchWord = "School";
        searchPom.search(searchWord);
        Thread.sleep(5000);

    }
    @Test
    public void BrandSearch() throws InterruptedException {
        String searchWord = "Brand";
        searchPom.search(searchWord);
        Thread.sleep(5000);

    }
    @Test
    public void BusinessSearch() throws InterruptedException {
        String searchWord = "Business";
        searchPom.search(searchWord);
        Thread.sleep(5000);

    }
    @Test
    public void GamingSearch() throws InterruptedException {
        String searchWord = "Gaming";
        searchPom.search(searchWord);
        Thread.sleep(5000);

    }
    @Test
    public void PowerfulSearch() throws InterruptedException {
        String searchWord = "Powerful";
        searchPom.search(searchWord);
        Thread.sleep(5000);

    }
    @Test
    public void GamingSearch2() throws InterruptedException {
        String searchWord = "GaMiNg";
        searchPom.search(searchWord);
        Thread.sleep(5000);

    }

    @AfterEach
    public void closing() {
        searchPom.close();
    }
}


