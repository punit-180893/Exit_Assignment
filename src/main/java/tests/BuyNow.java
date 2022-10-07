package tests;

import BasePages.Common;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BuyNow extends BasePages.mainPage{
    @Test
    public void BuyFeature() throws InterruptedException {
        driver.findElement(Common.SignUpSlide).click();
        driver.findElement(Common.Fashion).click();
        Thread.sleep(2500);
        driver.findElement(Common.Watch).click();
        Thread.sleep(4000);
        driver.findElement(Common.Lacoste).click();
        Thread.sleep(3000);
        driver.findElement(Common.Buy).click();
    }
}
