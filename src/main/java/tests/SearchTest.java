package tests;

import BasePages.Common;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchTest extends BasePages.mainPage {

    @Test
    public void search() {
        driver.findElement(Common.SignUpSlide).click();
        driver.findElement(Common.search_field).sendKeys(ReadingPropertiesFile.getProperty("Search"));
        driver.findElement(Common.searchLens).click();
    }
}
