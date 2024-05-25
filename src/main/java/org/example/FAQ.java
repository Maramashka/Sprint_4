package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FAQ {

    private final WebDriver driver;

    private final By faq_0 = By.id("accordion__heading-0");
    private final By faq_1 = By.id("accordion__heading-1");
    private final By faq_2 = By.id("accordion__heading-2");
    private final By faq_3 = By.id("accordion__heading-3");
    private final By faq_4 = By.id("accordion__heading-4");
    private final By faq_5 = By.id("accordion__heading-5");
    private final By faq_6 = By.id("accordion__heading-6");
    private final By faq_7 = By.id("accordion__heading-7");

    private final By answer_faq_0 = By.id("accordion__panel-0");
    private final By answer_faq_1 = By.id("accordion__panel-1");
    private final By answer_faq_2 = By.id("accordion__panel-2");
    private final By answer_faq_3 = By.id("accordion__panel-3");
    private final By answer_faq_4 = By.id("accordion__panel-4");
    private final By answer_faq_5 = By.id("accordion__panel-5");
    private final By answer_faq_6 = By.id("accordion__panel-6");
    private final By answer_faq_7 = By.id("accordion__panel-7");

    private final String answer_0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private final String answer_1 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private final String answer_2 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private final String answer_3 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private final String answer_4 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private final String answer_5 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private final String answer_6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private final String answer_7 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    private static final String URL = "https://qa-scooter.praktikum-services.ru/";

    public FAQ(WebDriver driver) {
        this.driver = driver;
        open();
        scrollListFAQ();
    }

    private void open() {
        driver.get(URL);
    }

    private void scrollListFAQ() {
        WebElement element = driver.findElement(MainPageConstants.listFAQ); // скролл до раздела
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFAQ0() {
        if (driver.findElement(faq_0).isEnabled()) {
            driver.findElement(faq_0).click();
        } else {
            System.out.println("Ошибочка, " + faq_0 + " неактивен");
        }
    }

    public boolean check0Answer() {
        String actual_answer = driver.findElement(answer_faq_0).getText();
        return actual_answer.equals(answer_0);
    }

}

