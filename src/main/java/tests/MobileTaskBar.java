package tests;

import BasePages.Common;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MobileTaskBar extends BasePages.mainPage {

    @Test
    public void mobile() throws InterruptedException {
        driver.findElement(Common.SignUpSlide).click();
        driver.findElement(Common.Mobile).click();
        Thread.sleep(2500);
        driver.findElement(Common.OfferZone).click();
        Thread.sleep(2500);
        driver.findElement(Common.ViewAll).click();
    }
}
