package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends  Utils{
    BrowserManager browserManager = new BrowserManager();
    @Before
    //Method to open the browser
    public void setup() {
        browserManager.openBrowser();
    }

    @After
    //method to close browser
    public void tearDown(Scenario scenario) {
     if (scenario.isFailed()) {
         byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot, "image/png", scenario.getName()+randomDate());
}
 browserManager.closeBrowser(); }






}
