package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutCompletedPage extends Utils {
    //Checkout completed page
    public void userShouldBeAbleToSeeConfirmationMessage(){

        //verify user can see confirmation message
        String actualMsg = driver.findElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]")).getText();

        String expectedConfirmationMessage = loadProp.getProperty("ExpectedConfirmationMsg");

        Assert.assertEquals(actualMsg, expectedConfirmationMessage,"User can not see confirmation message");
    }
    //verify order number is displayed
    public void userShouldBeAbleToSeeOrderNumber(){
        Boolean orderNumber=driver.findElement(By.xpath("//div[@class='order-number']")).isDisplayed();
        Assert.assertTrue(orderNumber, "Order number is not displayed");
        //Assert.assertFalse(orderNumber, "Order number is displayed");
    }
    //verify user is logged in as guest user
    public void userIsLoggedInAsGuestUser(){
        String actualMsg = getTextFromElement(By.linkText("Log in"));
        String expectedLogInStatus = "Log in";
        Assert.assertEquals(actualMsg, expectedLogInStatus,"User is not logged in as guest user");
    }
}
