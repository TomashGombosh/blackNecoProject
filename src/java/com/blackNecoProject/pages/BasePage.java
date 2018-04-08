package com.blackNecoProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitToBeVisible(By element, int timeout){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void waitToBeVisible(By element){
        this.waitToBeVisible(element, 10);
    }

    public void waitToBeClickable(By element, int timeout){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitToBeClickable(By element){
        this.waitToBeClickable(element, 10);
    }

    public String getText(By element) {
        waitToBeVisible(element);
        return driver.findElement(element).getText();
    }

    public void enterText(By element, String text) {
        waitToBeClickable(element);
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }

    public void click(By element) {
        waitToBeClickable(element);
        driver.findElement(element).click();
    }
    public void setBirth(By element,String text ) {
        waitToBeClickable(element);
        driver.findElement(element).sendKeys(text);
    }
}
