package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStorePom {
    @FindBy(css = "#searchField")
    WebElement searchField;
    WebElement results;

    WebDriver driver;

    public KodillaStorePom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SearchContext search(String word) {
        searchField.sendKeys(word);
        return results;
    }

    public void close() {
        driver.close();
    }
}