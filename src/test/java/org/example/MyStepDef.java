package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDef extends Utils {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    SearchByBrandPage searchByBrandPage = new SearchByBrandPage();
    Electronics electronics = new Electronics();
    CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
    LeicaT_MirrorlessDigital_CameraPage leicaT_mirrorlessDigital_cameraPage = new LeicaT_MirrorlessDigital_CameraPage();
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
    NewsRelease newsRelease = new NewsRelease();



    @Given("I am On Home Page")
    public void i_am_on_home_page() {

    }
    @And("I click On Register Button")
    public void i_click_on_register_button() {
        homePage.clickOnRegisterPage();

    }
    @When("I Enter Registration details")
    public void i_enter_registration_details() {
        registerPage.enterRegistrationDetails();

    }
    @Then("I Should Be Able to register successfully")
    public void i_should_be_able_to_register_successfully() {
        registerResultPage.userShouldBeAbleToGetRegistrationMsg();

    }
    @When("I click on {string} button")
    public void i_click_on_button(String buttonName) {
      homePage.clickOnButtonByGivenButtonName(buttonName);
    }
    @Then("I should be able to verify that user navigated to {string} page")
    public void i_should_be_able_to_verify_that_user_navigated_to_page(String url_contains) {
        verifyURLContains(url_contains);
    }



    @When("I enter {string} in search Box")
    public void i_enter_in_search_box(String givenBrand) {
      homePage.searchByBrandName(givenBrand);
    }
    @When("I click on Search button")
    public void i_click_on_search_button() {
        homePage.clickOnSearchButton();
    }
    @Then("I should be able to see all the product by {string}")
    public void i_should_be_able_to_see_all_the_product_by_ (String givenBrand) {
        searchByBrandPage.ProductsContainActualWordInTitle(givenBrand);

    }
    @Then("I should verify navigated url contain searched {string}")
    public void i_should_verify_navigated_url_contain_searched(String word) {
       searchByBrandPage.nevigatedUrlContainGivenBrand(word);
    }


    @When("I click on Electronics")
    public void iClickOnElectronics(){
    homePage.clickOnElectronics();

    }


    @And("I click on Camera & Photo")
    public void iClickOnCameraPhoto() {
    electronics.clickOnCameraAndPhoto();
    }

    @And("I click on Leica T Mirrorless Digital Camera")
    public void iClickOnLeicaTMirrorlessDigitalCamera() {
       cameraAndPhoto.clickOnLeicaTMirrorLessDigitalCamera();
    }
    @And("I click on email a friend option")
    public void iClickOnEmailAFriendOption() {
        leicaT_mirrorlessDigital_cameraPage.referAFriend();
    }

    @Then("I enter friend email id and i enter my email id and i type text on comment box and i click on send email")
    public void iEnterFriendEmailIdAndIEnterMyEmailIdAndITypeTextOnCommentBoxAndIClickOnSendEmail() {
        productEmailAFriend.enterFriendDetails();
    }

    @When("I click on Details")
    public void iClickOnDetails() {
        homePage.clickOnDetailsButton();
    }

    @And("I enter Comment Details and verify new comment msg display")
    public void andIEnterCommentDetailsAndVerifyNewCommentMsgDisplay() {
        newsRelease.addNewComment();
    }

    @Then("verify new comment is added at last")
    public void verifyNewCommentIsAddedAtLast() {
        newsRelease.verifyNewAddedCommentDisplayAtLast();
    }


    @When("I am select {string}")
    public void i_am_select(String Currency) {
       homePage.chooseCurrency(Currency);
    }
    @Then("each product contain {string}")
    public void each_product_contain(String currencySymbol) {
        homePage.verifyEachProductContainCurrencySymbol(currencySymbol);
    }


}


