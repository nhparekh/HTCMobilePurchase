package org.example;

import org.openqa.selenium.By;

public class BillingAddressPage extends Utils {

    public void billingAddressDetails() {
        //Enter First Name
        typeText(By.id("BillingNewAddress_FirstName"),loadProp.getProperty("FirstName"));
        //Enter Last Name
        typeText(By.id("BillingNewAddress_LastName"),loadProp.getProperty("LastName"));
        //Enter Email
        typeText(By.id("BillingNewAddress_Email"),email);
        //Select country
        selectTextByVisibleText(By.id("BillingNewAddress_CountryId"), "United Kingdom");
        //Enter City name
        typeText(By.id("BillingNewAddress_City"),loadProp.getProperty("City"));
        //Enter Address line 1
        typeText(By.id("BillingNewAddress_Address1"),loadProp.getProperty("Address1"));
        //Enter Zip/postal code
        typeText(By.id("BillingNewAddress_ZipPostalCode"),loadProp.getProperty("Zipcode"));
        //Enter phone number
        typeText(By.id("BillingNewAddress_PhoneNumber"),loadProp.getProperty("Phone"));
    }
    public void clickOnBillingAddressContinueButton() {
        //click on continue button
        clickOnElement(By.xpath("//div[@id='billing-buttons-container']/button[2]"));
    }

}
