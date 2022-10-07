package tests;

import BasePages.Common;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.testng.annotations.Test;

public class GiftCards extends BasePages.mainPage{
    @Test
    public void giftcards() throws InterruptedException {
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.login_btn).click();
        Thread.sleep(2500);
        driver.findElement(Common.giftCards).click();
        Thread.sleep(2500);
        driver.findElement(Common.addToWallet).click();
        Thread.sleep(2500);
        driver.findElement(Common.BuyGiftCard).click();

    }
}
