package org.example;

import org.openqa.selenium.By;

public class PaymentInformationPage extends Utils{
    //Payment information page
    public void paymentInformation(){
        //select credit card type
        selectTextByVisibleText(By.id("CreditCardType"), "Master card");
        //enter card holder name
        typeText(By.id("CardholderName"),loadProp.getProperty("FullName"));
        //Enter card number
        typeText(By.id("CardNumber"), "4111111111111111");
        //select expiration date
        selectTextByVisibleText(By.id("ExpireMonth"), "04");
        //select expiration year
        selectTextByVisibleText(By.id("ExpireYear"), "2028");
        //Enter card code
        typeText(By.id("CardCode"), "411");
    }
    public void clickOnPaymentInformationContinueButton(){
        clickOnElement(By.xpath("//div[@id='checkout-step-payment-info']/div[1]/button[1]"));
    }
}
