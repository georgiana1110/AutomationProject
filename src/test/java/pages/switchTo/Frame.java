package pages.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Frame extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Frame.class);
    private static Frame instance;

    private By singleFrameButton = By.xpath("//a[@href='#Single']");
    private By multipleFrameButton = By.xpath("//a[@href='#Multiple']");

    private By singleFrame = By.id("singleframe");
    private By multipleFrame = By.xpath("//div[@id='Multiple']/iframe");
    private By inputText = By.xpath("//input[@type='text']");

    private Frame(){}

    public static Frame getInstance(){
        if (instance == null){
            instance = new Frame();
        }
        return instance;
    }

    public void clickSingleFrame (){
        driver.findElement(singleFrameButton).click();
        WebElement iframe = driver.findElement(singleFrame);
        driver.switchTo().frame(iframe);
        sleep(5000);
        driver.findElement(inputText).sendKeys("sdsdsds");
        sleep(5000);
        driver.switchTo().defaultContent();
    }

    public void clickMultipleFrame(){
        driver.findElement(multipleFrameButton).click();

        WebElement iframe = driver.findElement(multipleFrame);
        driver.switchTo().frame(iframe);
        driver.switchTo().frame(0);
        sleep(5000);
        driver.findElement(inputText).sendKeys("sdsdsds");
        sleep(5000);
        driver.switchTo().defaultContent();
    }
}
