package com.indigo.pages;

import com.indigo.utilities.ConfigurationReader;
import com.indigo.utilities.Driver;
import com.indigo.utilities.ConfigurationReader;
import com.indigo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "txtUsername")
    public WebElement usernameInput;

    @FindBy(id ="txtPassword")
    public WebElement passwordInput;

    //driver.findElement(By.id("_submit"));
    @FindBy(id = "submit")
    public WebElement loginBtn;

    @FindBy(css = "p.loginMessage")
    public WebElement loginMessage;


    public void login(){
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    public void navigateToLoginPage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
}


