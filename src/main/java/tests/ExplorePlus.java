package tests;

import BasePages.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ExplorePlus extends BasePages.mainPage{
    @Test
    public void FlipkartPlus() throws InterruptedException {
        driver.findElement(Common.SignUpSlide).click();
        driver.findElement(Common.explorePlus).click();
        Thread.sleep(2500);
        driver.findElement(Common.coin_balance).click();
    }
}
