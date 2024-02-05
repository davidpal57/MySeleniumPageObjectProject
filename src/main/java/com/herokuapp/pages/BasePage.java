package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    public static String BASE_URL = "https://the-internet.herokuapp.com/";

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
}
