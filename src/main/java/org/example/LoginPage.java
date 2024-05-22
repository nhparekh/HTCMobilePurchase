package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    //Type email
    public void clickOnCheckoutAsGuest() {

        //Click on checkout as guest
        clickOnElement(By.xpath("//div[@class='new-wrapper checkout-as-guest-or-register-block']/div[3]/button[1]"));

    }
}

