package com.xyz.pages;


import com.aventstack.extentreports.Status;
import com.xyz.customlisteners.CustomListeners;
import com.xyz.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    //     click On "Bank Manager Login" Tab
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogInTab;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;



    public void clickOnBankMangerLogin() {
        Reporter.log("click On Bank Manger Login " + bankManagerLogInTab.toString());
        CustomListeners.test.log(Status.PASS, "click On Bank Manger Login "+ bankManagerLogInTab);
        clickOnElement(bankManagerLogInTab);
    }
    public void clickOnCustomerLogin() throws InterruptedException {
        Reporter.log("click On Customer Login " + customerLogin.toString());
        CustomListeners.test.log(Status.PASS, "click On Customer Login "+ customerLogin);
        Thread.sleep(1000);
        clickOnElement(customerLogin);
    }

}
