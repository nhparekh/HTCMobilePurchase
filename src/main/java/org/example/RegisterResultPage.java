package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{

    public void userShouldBeAbleToGetRegistrationMsg(){

    // for compare message as required.
  //  String expectedRegistrationMessage = loadProp.getProperty("ExpectedRegisterMsg");

    String actualMsg = getTextFromElement(By.className("result"));
        String expectedRegistrationMessage = loadProp.getProperty("ExpectedRegisterMsg");
        Assert.assertEquals(actualMsg,expectedRegistrationMessage,"Your test case is fail.");
    }
}
