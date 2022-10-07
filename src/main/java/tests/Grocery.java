package tests;

import BasePages.Common;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Grocery extends BasePages.mainPage{
    @Test
    public void grocery() {
        driver.findElement(Common.SignUpSlide).click();
        driver.findElement(Common.grocery).click();
        driver.findElement(Common.pincode).click();


    }
}
