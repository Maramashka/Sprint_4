package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public static final By topOrderButton = By.xpath(".//button[@class='Button_Button__ra12g']");
    public static final By lowerOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public static final By listFAQ = By.xpath(".//div[@class='Home_FAQ__3uVm4']");

    public boolean checkTopOrderButtonIsEnabled() {
        return driver.findElement(topOrderButton).isEnabled();
    }

    public void clickTopOrderButton() {
        driver.findElement(topOrderButton).click();
    }

    public boolean checkLowerOrderButtonIsEnabled() {
        return driver.findElement(lowerOrderButton).isEnabled();
    }

    public void clickLowerOrderButton() {
        driver.findElement(lowerOrderButton).click();
    }
}