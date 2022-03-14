package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        String url = "http://demo.automationtesting.in/Index.html";
        driver.get(url);
        LOG.info("Open browser");
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        LOG.info ("Close the browser");
        driver.quit();
    }

}

