package practice;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PracticeWork extends BaseClass {

    @Test
    public static void verifyPageTitle() {
        driver.get(URL);
        assertEquals("Instant CrowdFunding", driver.getTitle());
    }
}
