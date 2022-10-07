package tests;

import BasePages.Common;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class topOffers extends BasePages.mainPage{
    @Test
    public void offerZoneTest() throws InterruptedException {

        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.login_btn).click();
        Thread.sleep(2500);
        driver.findElement(Common.topOffer).click();
        Thread.sleep(2500);
        driver.findElement(Common.flights).click();
    }
}
