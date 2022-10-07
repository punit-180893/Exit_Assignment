package tests;

import BasePages.Common;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Seller extends BasePages.mainPage {
    @Test
    public void seller() throws InterruptedException {

        //Test Become a seller feature and start selling
        driver.findElement(Common.SignUpSlide).click();
        driver.findElement(Common.BecomeASeller).click();
        driver.findElement(Common.StartSelling).click();
        driver.findElement(Common.RegisterBtn).click();
    }
}
