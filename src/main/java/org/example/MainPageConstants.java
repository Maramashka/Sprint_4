package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageConstants {

    private WebDriver driver;

    public static final By topOrderButton = By.xpath(".//button[@class='Button_Button__ra12g']");
    public static final By lowerOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By listFAQ = By.xpath(".//div[@class='Home_FAQ__3uVm4']");
}