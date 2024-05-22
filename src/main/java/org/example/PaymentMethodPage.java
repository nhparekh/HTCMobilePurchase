package org.example;

import org.openqa.selenium.By;

public class PaymentMethodPage extends Utils{
    //Payment method page
    public void selectCreditCardPaymentMethod(){
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
    }
    public void clickOnPaymentMethodContinueButton(){
        clickOnElement(By.xpath("//div[@id='checkout-step-payment-method']/div[1]/button[1]"));
    }
}
