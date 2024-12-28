package com.juice.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    // Object repository
    @FindBy(id = "navbarAccount")
    private WebElement accountLink;

    // Object repository
    @FindBy(id = "navbarLoginButton")
    private WebElement loginLink;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    // constructor with PageFactory for initiate all the page objects
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void fillOutForm(String user, String pas) {

    }

    // actions or functions that require the automation process
    public void setEmail(String email) {
        emailField.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void navigateToLoginPage() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        accountLink.click();
        loginLink.click();
    }

    public void doLogin() {
        loginButton.submit();
    }

    public void doLoginUser(String email, String password) {
        // implement me
    }

    public void isDashboardPageDisplayed() {
        // implement me
    }

}
