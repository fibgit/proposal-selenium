package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class PracticeWork extends BaseClass {

    @Test
    public static void verifyPageTitle() {
        driver.get(URL);
        assertEquals("Instant CrowdFunding", driver.getTitle());
    }

    @Test
    public void numberOfCampaigns(){
        List<WebElement> campaigns = driver
                .findElement(By.cssSelector(".my-2"))
                .findElements(By.cssSelector(".col-md-4"));
             System.out.println("Number of Campaigns: " + campaigns.size());
    }

    @Test
    public void listCurrentCampaigns(){
        List<WebElement> campaignTitles = driver
                .findElement(By.cssSelector(".my-2"))
                .findElements(By.cssSelector(".card-header"));
        for ( WebElement e : campaignTitles) {
            System.out.println(e.getText());
        }
    }
}
