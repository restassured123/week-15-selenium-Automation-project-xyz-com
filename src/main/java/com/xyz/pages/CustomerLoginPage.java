package com.xyz.pages;

import com.aventstack.extentreports.Status;
import com.xyz.customlisteners.CustomListeners;
import com.xyz.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    // search customer that you created.
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customer;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement login;

    //click on "Logout"
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement clickLogout;


    // search customer that you created.

    public void searchCustomer() throws InterruptedException {
        Reporter.log("search Customer " + customer.toString());
        CustomListeners.test.log(Status.PASS, "search Customer "+ customer);
        selectByVisibleTextFromDropDown(customer, "Harry Potter");
    }
    public void clickOnLoginButton() throws InterruptedException {
        Reporter.log("click On Login Button " + login.toString());
        CustomListeners.test.log(Status.PASS, "click On Login Button "+ login);
        clickOnElement(login);
    }
    // click on "Logout"
    public void clickOnLogoutTab() throws InterruptedException {
        Reporter.log("click On Logout Tab " + clickLogout.toString());
        CustomListeners.test.log(Status.PASS, "click On Logout Tab "+ clickLogout);
        clickOnElement(clickLogout);
    }


}