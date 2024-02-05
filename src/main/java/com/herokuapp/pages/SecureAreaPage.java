package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends BasePage{
    public static String SECUREAREA_URL= BASE_URL + "secure";
    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (id="flash") private WebElement successMessage;
    @FindBy (linkText = "Logout") private WebElement logoutButon;

    public String getSuccessMessageText(){
        return successMessage.getText();
    }

    public boolean isLogoutButtonDisplayed(){
        return logoutButon.isDisplayed();
    }
}
