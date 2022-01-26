package com.indigo.step_definitions;

import com.indigo.pages.RatesPage;
import com.indigo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RatesStepDef {
    RatesPage ratesPage = new RatesPage();
    WebDriverWait wait = new WebDriverWait(Driver.get(),15);
    Actions action = new Actions(Driver.get());
    @When("Navigate to Rates module")
    public void navigateToRatesModule() throws InterruptedException {
        Thread.sleep(2000);
        if(!ratesPage.taxratebutton.isEnabled()){
            ratesPage.cancelButton.click();}
        ratesPage.taxratebutton.click();
    }
    @And("Enter the uniq {string}  {string}  {string} {string} {string}")
    public void enterTheUniq(String code, String dateFrom, String dateTo, String rangeFrom, String rangeTo) throws InterruptedException {
        Thread.sleep(0000);
        ratesPage.taxRateCancelButton.click();
        ratesPage.insertButton.click();
        Thread.sleep(500);
        ratesPage.codeInput.sendKeys(code);
        action.doubleClick(ratesPage.dateFromInput).perform();
        Thread.sleep(500);
        ratesPage.dateIconFrom.click();
        ratesPage.dataPicker(dateFrom);
        action.doubleClick(ratesPage.dateToInput).perform();
        Thread.sleep(500);
        ratesPage.dateIconTo.click();
        ratesPage.dataPickerTo(dateTo);
        ratesPage.rangeFromInput.click();
        ratesPage.rangeFromInput.sendKeys(rangeFrom);
        ratesPage.rangeToInput.click();
        ratesPage.rangeToInput.sendKeys(rangeTo);
    }
    @And("Enter {string} {string}")
    public void enter(String taxRate, String subtract) {
        ratesPage.taxRateInput.click();
        ratesPage.taxRateInput.sendKeys(taxRate);
        ratesPage.subtractInput.click();
        ratesPage.subtractInput.sendKeys(subtract);
    }
    @Then("Click to save button")
    public void clickToSaveButton() {
        ratesPage.saveButton.click();
    }

    @And("Verify {string} to new rate added")
    public void verifyToNewRateAdded(String expectedCode) {
        Assert.assertEquals(ratesPage.codeInput.getText(),expectedCode);
    }
}
