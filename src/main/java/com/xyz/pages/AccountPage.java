package com.xyz.pages;

import com.aventstack.extentreports.Status;
import com.xyz.customlisteners.CustomListeners;
import com.xyz.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {
    // click on "Deposit" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;

    // Enter amount 100
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountTab;


    //click on "Deposit" Button
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickDeposit;

    // verify message "Deposit Successful"
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessfullyText;


    //click on "Withdrawl" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawl;

    // Enter amount 50
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withdrawalAmountTab;

    //click on "Deposit" Button
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement withdrawTab;

    //	verify message "Transaction Successful"
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement withdrawalSuccessfullyText;




    //click on "Deposit" Tab
    public void clickOnDepositTab() throws InterruptedException {
        Reporter.log("click On Deposit Tab " + deposit.toString());
        CustomListeners.test.log(Status.PASS, "click On Deposit Tab"+ deposit);
        Thread.sleep(1000);
        clickOnElement(deposit);
    }
    // Enter amount 100
    public void enterAmount(String amount) throws InterruptedException {
        Reporter.log("enter Amount " + amountTab.toString());
        CustomListeners.test.log(Status.PASS, "enter Amount"+ amountTab);
        Thread.sleep(1000);
        sendTextToElement(amountTab, amount);
    }
    //click on "Deposit" Button
    public void clickDepositTab() throws InterruptedException {
        Reporter.log("click Deposit Tab " + clickDeposit.toString());
        CustomListeners.test.log(Status.PASS, "click Deposit Tab"+ clickDeposit);
        Thread.sleep(1000);
        clickOnElement(clickDeposit);
    }
    // verify message "Deposit Successful"
    public String verifyDepositSuccessfullyTextMessage() throws InterruptedException {
        Reporter.log("verify Deposit Successfully Text Message" + depositSuccessfullyText.toString());
        CustomListeners.test.log(Status.PASS, "verify Deposit Successfully Text Message"+ depositSuccessfullyText);
        Thread.sleep(1000);
        return getTextFromElement(depositSuccessfullyText);
    }

    //click on "Withdrawl" Tab
    public void clickOnWithdrawl() throws InterruptedException {
        Reporter.log("click On Withdrawal" + withdrawl.toString());
        CustomListeners.test.log(Status.PASS, "click On Withdrawal"+ withdrawl);
        Thread.sleep(1000);
        clickOnElement(withdrawl);
    }

    //Enter amount 50
    public void enterWithdrawlAmount(String amount) throws InterruptedException {
        Reporter.log("enter Withdrawal Amount" + withdrawalAmountTab.toString());
        CustomListeners.test.log(Status.PASS, "enter Withdrawal Amount"+ withdrawalAmountTab);
        Thread.sleep(1000);
        sendTextToElement(withdrawalAmountTab, amount);
    }

    //click on "Deposit" Button
    public void clickOnWithdrawTransactionTab() throws InterruptedException {
        Reporter.log("click On Withdraw Transaction Tab" + withdrawTab.toString());
        CustomListeners.test.log(Status.PASS, "click On Withdraw Transaction Tab"+ withdrawTab);
        Thread.sleep(1000);
        clickOnElement(withdrawTab);
    }

    //	verify message "Transaction Successful"
    public String verifyWithdrawalSuccessfullyTextMessage() throws InterruptedException {
        Reporter.log("verify Withdrawal Successfully Text Message" + withdrawalSuccessfullyText.toString());
        CustomListeners.test.log(Status.PASS, "verify Withdrawal Successfully Text Message"+ withdrawalSuccessfullyText);
        Thread.sleep(1000);
        return getTextFromElement(withdrawalSuccessfullyText);
    }

}

