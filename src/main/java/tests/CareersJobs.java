package tests;

import BasePages.Common;
import org.testng.annotations.Test;

public class CareersJobs extends BasePages.mainPage{
    @Test
    public void jobs() throws InterruptedException {
        driver.findElement(Common.SignUpSlide).click();
        driver.findElement(Common.Careers).click();
        Thread.sleep(2500);
        driver.findElement(Common.exploreJobs).click();
    }
}
