package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by adrachuk on 24/05/2017.
 */
public class BasePage {
    protected WebDriver driver;

    By chapter1Locator = By.linkText("Chapter1");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean verifyChapter1click() {
        WebElement element = driver.findElement(chapter1Locator);
        element.click();
        return true;
    }
}
