package org.example;

import org.openqa.selenium.By;

public class ShippingMethodPage extends Utils {
    //Shipping method
    public void selectNextDayAirShippingMethod() {
        //select next day air shipping method
        clickOnElement(By.id("shippingoption_1"));
    }
    public void clickOnShippingMethodContinueButton() {
        clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button[1]"));
    }
}
