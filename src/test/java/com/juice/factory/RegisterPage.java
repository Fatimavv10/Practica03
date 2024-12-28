package com.juice.factory;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver driver;

    // Object repository
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement registerLink;

    @FindBy(id = "FirstName")
    private WebElement firstnameField;

    @FindBy(id = "LastName")
    private WebElement lastnameField;

    @FindBy(id = "Email")
    private WebElement emailField;

    @FindBy(id = "Password")
    private WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    private WebElement repasswordField;

    @FindBy(id = "register-button")
    private WebElement registerButton;

    @FindBy(xpath = "//div[@class='result']")
    private WebElement messageText;

    // constructor
    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // methods
    public void goToRegisterPage() {
        registerLink.click();
    }

    public void fillOutRegisterForm(String fname, String lname, String email, String pass, String repass) {
        firstnameField.sendKeys(fname);
        lastnameField.sendKeys(lname);
        emailField.sendKeys(email);
        passwordField.sendKeys(pass);
        repasswordField.sendKeys(repass);
    }

    public void sendDataForNewAccount() {
        registerButton.submit();
    }

    public boolean isRegisterSuccessPageDisplayed() {
        try {
            return messageText.isDisplayed();
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public String getMessage() {
        return messageText.getText();
    }

}
