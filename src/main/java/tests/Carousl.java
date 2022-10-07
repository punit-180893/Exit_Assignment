package tests;

import BasePages.Common;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Carousl extends BasePages.mainPage{
    @Test
    public void crousel(){
        driver.findElement(Common.SignUpSlide).click();
        driver.findElement(Common.carouselSlide).click();
        driver.findElement(Common.carouselSlide).click();
    }
}
