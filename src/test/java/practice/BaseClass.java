package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    static WebDriver driver;
    static String URL = "https://instantcrowdfunding.com/home";

    @BeforeMethod
    static void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }
    @AfterMethod
    static void cleanUp(){
        driver.quit();
    }

  }
