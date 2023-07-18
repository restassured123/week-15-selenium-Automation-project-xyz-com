package com.xyz.pages;

import com.aventstack.extentreports.Status;
import com.xyz.customlisteners.CustomListeners;
import com.xyz.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;

    // Select currency "Pound"
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;

    // 	click on "process" button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement process;



    // click On "Open Account" Tab
    public void clickOnOpenAccount() throws InterruptedException {
        Reporter.log("click On Open Account " + openAccount.toString());
        CustomListeners.test.log(Status.PASS, "click On Open Account "+ openAccount);
        Thread.sleep(1000);
        clickOnElement(openAccount);
    }

    public void clickAndSelectCustomerName() {
        Reporter.log("click And Select Customer Name " + searchCustomer.toString());
        CustomListeners.test.log(Status.PASS, "click And Select Customer Name "+ searchCustomer);
        selectByVisibleTextFromDropDown(searchCustomer, "Harry Potter");

    }

    //Select currency "Pound"
    public void selectCurrency() throws InterruptedException {
        Reporter.log("select Currency " + currency.toString());
        CustomListeners.test.log(Status.PASS, "select Currency "+ currency);
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(currency, "Pound");
    }
    // 	click on "process" button
    public void clickOnProcessButton() throws InterruptedException {
        Reporter.log("click On Process Button " + process.toString());
        CustomListeners.test.log(Status.PASS, "click On Process Button "+ process);
        Thread.sleep(1000);
        clickOnElement(process);
    }

    // Popup Displayed and verify Message
    public String verifyTextFromPopUp(){
        Reporter.log("getting text from element ");
        CustomListeners.test.log(Status.PASS, "getting text from element ");
        return getTextFromAlert();
    }
    public void acceptAlert(){
        Reporter.log("Accept alert ");
        CustomListeners.test.log(Status.PASS, "Accept alert ");
        driver.switchTo().alert().accept();
    }

}
