package com.indigo.step_definitions;

import com.indigo.pages.TaxProfilePage;
import com.indigo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaxProfileStepDef {
    TaxProfilePage taxProfilePage = new TaxProfilePage();
    WebDriverWait wait = new WebDriverWait(Driver.get(),15);
    @When("Navigate to Tax profile module")
    public void navigateToTaxProfileModule() {
        taxProfilePage.taxProfileModule.click();
    }
    @And("Click to Add icon")
    public void clickToAddIcon() throws InterruptedException {
        taxProfilePage.addIcon.click();
        Thread.sleep(1500);
    }
    @Then("Click to save as a template button")
    public void clickToSaveAsATemplateButton() throws InterruptedException {
        taxProfilePage.saveButton.click();
        System.out.println(taxProfilePage.TaxProfile.getText());

    }
    @When("Enter the {string}  {string}  {string} and {string}")
    public void enterTheAnd(String taxprofile, String desc, String FSS, String taxGross) throws InterruptedException {
        taxProfilePage.TaxProfile.click();
        taxProfilePage.TaxProfile.sendKeys(taxprofile);
        Thread.sleep(1500);
        taxProfilePage.Description.click();
        taxProfilePage.Description.sendKeys(desc);
        Thread.sleep(1500);
        taxProfilePage.FssStatusType.click();
        Thread.sleep(1500);
        if(taxGross.equals("Y")){
        taxProfilePage.taxOnAnnualGross.click();}
    }
    @And("Click the edit button")
    public void clickTheEditButton() throws InterruptedException {
        Thread.sleep(500);
        taxProfilePage.nextRecord.click();

        taxProfilePage.TaxProfileEdit.click();
    }
    @When("Edit the  {string}")
    public void editThe(String desc) {
        taxProfilePage.Description.click();
        taxProfilePage.Description.clear();
        taxProfilePage.Description.sendKeys(desc);
    }
    @And("Select a Tax profile")
    public void selectATaxProfile() {
        taxProfilePage.nextRecord.click();
    }
    @Then("Click to delete button")
    public void clickToDeleteButton() throws InterruptedException {
        taxProfilePage.deleteButton.click();
        taxProfilePage.deleteConfirmButton.click();
    }
    @Then("Click to save as a template button and verify new {string} added")
    public void clickToSaveAsATemplateButtonAndVerifyNewAdded(String expected) {
        taxProfilePage.saveButton.click();
        System.out.println(taxProfilePage.TaxProfile.getText());
        Assert.assertEquals(taxProfilePage.TaxProfile.getText(),expected);
    }

    @And("Verify that selected tax profile deleted")
    public void verifyThatSelectedTaxProfileDeleted() {

    }

    @And("Verify that {string} is editted")
    public void verifyThatIsEditted(String expected) {
        Assert.assertFalse(taxProfilePage.Description.getText().equals(expected));
    }
}
