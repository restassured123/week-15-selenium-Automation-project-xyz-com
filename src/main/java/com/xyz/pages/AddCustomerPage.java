package com.xyz.pages;

import com.aventstack.extentreports.Status;
import com.xyz.customlisteners.CustomListeners;
import com.xyz.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    // * 	click On "Add Customer" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    // Enter PostCode
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;

    // Click on Add Button
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addButton;



    // * 	click On "Add Customer" Tab
    public void clickOnAddCustomer() {
        Reporter.log("click On Add Customer " + addCustomer.toString());
        CustomListeners.test.log(Status.PASS, "click On Add Customer "+ addCustomer);
        clickOnElement(addCustomer);
    }

    public void enterFirstName(String value) {
        Reporter.log("enter First Name " + firstName.toString());
        CustomListeners.test.log(Status.PASS, "enter First Name "+ firstName);
        sendTextToElement(firstName, value);
    }

    // Enter Last Name
    public void enterLastname(String value) throws InterruptedException {
        Reporter.log("enter last Name " + lastName.toString());
        CustomListeners.test.log(Status.PASS, "enter last Name "+ lastName);
        Thread.sleep(1000);
        sendTextToElement(lastName, value);
    }

    // Enter PostCode
    public void enterPostCode(String value) throws InterruptedException {
        Reporter.log("enter postcode " + postCode.toString());
        CustomListeners.test.log(Status.PASS, "enter postcode "+ postCode);
        Thread.sleep(1000);
        sendTextToElement(postCode, value);
    }

    // Click On Add Button
    public void clickOnAddButton() throws InterruptedException {
        Reporter.log("click On Add Button " + addButton.toString());
        CustomListeners.test.log(Status.PASS, "click On Add Button "+ addButton);
        Thread.sleep(1000);
        clickOnElement(addButton);
    }

    // Popup Display
    public String verifyTextFromPopUp() {
        return getTextFromAlert();
    }


}