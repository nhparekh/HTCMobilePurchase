package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils {

    public void clickOnShoppingCart() {

        //click on shopping cart button
        clickOnElement(By.className("cart-label"));
        //
        String expectedProductName =loadProp.getProperty("ExpectedProductName");
        //verify correct product show in cart
        String actualProductName = getTextFromElement(By.className("product-name"));
        Assert.assertEquals(actualProductName,expectedProductName,"Wrong Product");
    }
    public void clickOnTermsOfService() {
        //click on Terms of service checkbox
        clickOnElement(By.id("termsofservice"));
    }
    public void clickOnCheckout() {
        //click on checkout button
        clickOnElement(By.id("checkout"));
    }

}
