package tests;

import BasePages.Common;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CustomerCare extends BasePages.mainPage{
    @Test
    public void care(){
        driver.findElement(Common.SignUpSlide).click();
        driver.findElement(Common.More).click();
        driver.findElement(Common.Care).click();
    }
}
