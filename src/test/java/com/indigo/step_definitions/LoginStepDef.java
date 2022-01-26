package com.indigo.step_definitions;
import com.indigo.pages.LoginPage;
import com.indigo.utilities.ConfigurationReader;
import com.indigo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.navigateToLoginPage();
    }
    @When("the user enters the valid credentials")
    public void theUserEntersTheValidCredentials() {
        loginPage.login();
    }
    @Then("Homepage should be displayed.")
    public void homepageShouldBeDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        String expectedResult = "QATest01 - People Module";
        Assert.assertEquals(expectedResult,Driver.get().getTitle());
    }
    @Then("Alert error is seen")
    public void alertErrorIsSeen() {
        String expectedResult = "Invalid user name or password";
        Assert.assertEquals(loginPage.loginMessage.getText(),expectedResult);
    }
    @When("the user enters invalid {string} and {string}")
    public void theUserEntersInvalidAnd(String username, String password) {
        loginPage.login(username, password);
    }
    @Then("Blank alert error is seen")
    public void blankAlertErrorIsSeen() {
        String expectedResult = "The UserName field is required.";
        Assert.assertEquals(loginPage.loginMessage.getText(),expectedResult);
    }

    @Then("Blank password alert error is seen")
    public void blankPasswordAlertErrorIsSeen() {
        String expectedResult = "Please input your password";
        Assert.assertEquals(loginPage.loginMessage.getText(),expectedResult);
    }
}
