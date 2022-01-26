package com.indigo.pages;

import com.indigo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaxProfilePage {
    public TaxProfilePage() {PageFactory.initElements(Driver.get(), this);}
    @FindBy (xpath = "//span[text()='Tax Profiles']")
    public WebElement taxProfileModule;
    @FindBy(xpath = "//div[@data-uid='modulePayroll']")
    public WebElement payrollModule;
    @FindBy(id = "insertButton")
    public WebElement addIcon;
    @FindBy(xpath = "//*[@data-uid='TaxProfile-Code']")
    public WebElement TaxProfile;
    @FindBy(xpath = "//*[@data-uid='Tax Profile-editButton']")
    public WebElement TaxProfileEdit;
    @FindBy(xpath = "//*[@data-uid='TaxProfile-Description']")
    public WebElement Description;
    @FindBy(xpath ="//*[@data-uid='TaxProfile-FssStatusType']")
    public WebElement FssStatusType;
    @FindBy(xpath = "//*[@data-uid='TaxProfile-undefined']/div")
    public WebElement taxOnAnnualGross;
    @FindBy(id = "saveButton")
    public WebElement saveButton;
    @FindBy(id = "formViewButton")
    public WebElement formViewButton;
    @FindBy(id = "taxratebutton")
    public WebElement taxratebutton;
    @FindBy(id = "jqxWidgetbaf4ce022d41")
    public WebElement rowCheckButton;
    @FindBy(xpath = "//*[@data-uid='Tax Profile-navigateNextRecordButton']")
    public WebElement nextRecord;
    @FindBy(xpath = "//*[@data-uid='Tax Profile-deleteActionButton']")
    public WebElement deleteButton;
    @FindBy(xpath = "//button[text()='delete']")
    public  WebElement deleteConfirmButton;
    @FindBy(xpath = "//div[@class='toast toast-error']")
    public WebElement toastError;












    }

