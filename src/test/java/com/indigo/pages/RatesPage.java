package com.indigo.pages;

import com.indigo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class RatesPage {
    public RatesPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@data-uid='TaxRate-Code']")
    public WebElement codeInput;
    @FindBy(xpath = "//*[@data-uid='TaxRate-DateFrom']")
    public WebElement dateFromInput;
    @FindBy(xpath = "//*[@data-uid='Tax Rate-insertButton']")
    public WebElement insertButton;
    @FindBy(xpath = "//*[@data-uid='TaxRate-DateTo']")
    public WebElement dateToInput;
    @FindBy(xpath = "//*[@data-uid='TaxRate-RangeFrom']")
    public WebElement rangeFromInput;
    @FindBy(xpath = "//*[@data-uid='TaxRate-RangeTo']")
    public WebElement rangeToInput;
    @FindBy(xpath = "//*[@data-uid='TaxRate-Rate']")
    public WebElement taxRateInput;
    @FindBy(xpath = "//*[@data-uid='TaxRate-Subtract']")
    public WebElement subtractInput;
    @FindBy(id = "saveButton")
    public WebElement saveButton;
    @FindBy(id = "taxratebutton")
    public WebElement taxratebutton;
    @FindBy(id = "cancelButton")
    public WebElement cancelButton;
    @FindBy(xpath = "//*[@data-uid='Tax Rate-cancelButton']")
    public WebElement taxRateCancelButton;
    @FindBy(xpath = "//td[starts-with(@id, 'rifgth')]")
    public WebElement dateYearRigth;
    @FindBy(xpath = "//td[starts-with(@id, 'left')]")
    public WebElement dateYearLeft;

    @FindBy(xpath = "//td[text()='1']")
    public WebElement selectDay;
    @FindBy(xpath = "//td[text()='31']")
    public WebElement selectLastDay;

    @FindBy(xpath = "//td[starts-with(@id, 'calendarTitle')]")
    public WebElement dateYear;
    @FindBy(xpath = "//div[starts-with(@id, 'datetimeeditor')]/div/div[1]")
    public WebElement dateIconFrom;
    @FindBy(xpath = "//input[starts-with(@id, 'datetimeeditor')]/../div/div[1]")
    public WebElement dateIconTo;

    public void dataPicker(String date) {
        String year = date.substring(6, 10); // I just want to take year ,in order to select first day of the year,
        while (true) {
            if (dateYear.getText().equals("January " + year)) {
                selectDay.click();
                break;
            }
            dateYearLeft.click();
        }
    }
    public void dataPickerTo(String date) {
        String year = date.substring(6, 10); // I just want to take year ,in order to select first day of the year,
        while (true) {
            if (dateYear.getText().equals("December " + year)) {
                selectLastDay.click();
                break;
            }
            dateYearLeft.click();
        }
    }

}










