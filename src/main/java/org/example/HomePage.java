package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils {
    private By _currency = By.id("customerCurrency");

    // click on registerButton from header bar
    public void clickOnRegisterPage() {
        clickOnElement(By.className("ico-register"));
    }

    //to click on log in button from header bar
    public void clickOnLoginButton() {
        clickOnElement(By.className("ico-login"));
    }

    //click on build your own computer
    public void featuredProduct() {
        clickOnElement(By.linkText("Build your own computer"));
    }

    // click on ElectronicsButton from header bar
    public void clickOnElectronics() {
        clickOnElement(By.xpath("//h2[@class='title']/a[@title=\"Show products in category Electronics\"]"));
    }

    // click on computer
    public void clickOnComputer() {
        clickOnElement(By.linkText("Computers"));
    }

    //scroll down home page and click on vote
    public void clickOnVote() {
        clickOnElement(By.id("vote-poll-1"));
    }

    //click on shopping cart Button

    public void clickOnShoppingCart() {
        clickOnElement(By.className("cart-label"));
    }


    // Switching to Alert
    public void handleMsg() {
        // Capturing message from alert.
        String actualAlertMessage = getTextFromAlertMsg();

        //expected requirement
        String expectedMessage = "Please select an answer";

        Assert.assertEquals(actualAlertMessage, expectedMessage, "your test case is fail");

        // Accepting alert
        acceptAlert();

    }

    //method to homepage click on search button
    public void clickOnSearchButton() {
        clickOnElement(By.xpath("//*[@id='small-search-box-form']/button"));
    }

    // Switching to Alert
    public void getAlertMsg() {

        // Capturing alert message.
        String actualAlertMessage = getTextFromAlertMsg();

        //expected msg
        String expectedMessage = "Please enter some search keyword";

        Assert.assertEquals(actualAlertMessage, expectedMessage, "your test case is fail");

        // Accepting alert
        acceptAlert();
    }

    //method to homepage click on facebook icon
    public void clickOnFacebookIcon() {
        clickOnElement(By.linkText("Facebook"));
    }

    public void searchByBrandName(String givenBrand) {
        typeText(By.id("small-searchterms"), (givenBrand));
    }

    public void clickOnDetailsButton() {
        clickOnElement(By.xpath("//div[@class='news-items']/div[2]/div[3]/a"));
    }


    //click on add to cart button for HTC one m8 android l5.o lolipop on homepage
    public void clickOnAddToCartForHTCOne() {
        clickOnElement(By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]"));

    }

    public void clickOnButtonByGivenButtonName(String buttonName) {
        clickOnElement(By.linkText("" + buttonName + ""));

    }

    public void chooseCurrency(String currency) {
        selectTextByVisibleText(_currency, currency);
    }

    public void verifyEachProductContainCurrencySymbol(String currencySymbol) {
        List<WebElement> productListContainCurrencySymbol = driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='prices']"));



        for (WebElement webelement : productListContainCurrencySymbol) {
            Assert.assertNotNull(webelement.getText().contains(currencySymbol), "Product's currency does not match. ");
        }
    }
}

