package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchByBrandPage extends  Utils {

    //this method to be parameterised - so it will accept any product name

    public void ProductsContainActualWordInTitle(String givenBrand) {


        //use list of product title element
        List<WebElement> productcontainWordElementList = driver.findElements(By.xpath("//div[@class='item-box']//h2"));

        //String productName = loadProp.getProperty("BrandName");
        System.out.println(productcontainWordElementList.size());

        //String[] productName
        for (WebElement webelement : productcontainWordElementList) {

            Assert.assertTrue(webelement.getText().contains(givenBrand), "brand name is missing");
        }
    }
    public void nevigatedUrlContainGivenBrand(String containSearchBrand){
        //verify Url
          Assert.assertTrue(driver.getCurrentUrl().contains(containSearchBrand), "url doesn't match");
    }
}


