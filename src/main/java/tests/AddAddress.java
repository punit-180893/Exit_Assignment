package tests;

import BasePages.Common;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddAddress extends BasePages.mainPage{
    @Test
    public void address() throws InterruptedException {
        driver.findElement(Common.SignUpSlide).click();
        WebElement mainMenu = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        Thread.sleep(2500);
        driver.findElement(Common.myProfile).click();
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.login_btn).click();
//        Thread.sleep(2500);
//        driver.findElement(Common.Hover).click();
//        Thread.sleep(2500);


    }
}
