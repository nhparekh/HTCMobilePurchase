package org.example;

import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utils{
    //Confirm order page
    public void clickOnConfirmButton(){
        clickOnElement(By.xpath("//div[@id='checkout-step-confirm-order']/div[2]/button[1]"));
    }
}
