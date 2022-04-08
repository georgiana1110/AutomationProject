package pages.switchTo;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Window extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Window.class);
    private static Window instance;

    private By windowTabTabbed = By.xpath("//a[@href='#Tabbed']");
    private By windowTabSeparate = By.xpath("//a[@href='#Seperate']");
    private By windowTabMultiple = By.xpath("//a[@href='#Multiple']");

    private By triggerTabbedWindow = By.xpath("//div[@id='Tabbed']/a/button");
    private By triggerSeparateWindow = By.xpath("//div[@id='Seperate']/button");
    private By triggerMultipleWindow = By.xpath("//div[@id='Multiple']/button");

    private Window(){}

    public static Window getInstance(){
        if (instance == null){
            instance = new Window();
        }
        return instance;
    }

    public void clickWindowTabTabbed() {
        driver.findElement(windowTabTabbed).click();
    }
    public void clickWindowTabSeperate() {
        driver.findElement(windowTabSeparate).click();
    }
    public void clickWindowTabMultiple() {
        driver.findElement(windowTabMultiple).click();
    }

    public void clickToTriggerTabbedWindow() {
        driver.findElement(triggerTabbedWindow).click();
    }
    public void clickToTriggerSeperateWindow() {
        driver.findElement(triggerSeparateWindow).click();
    }
    public void clickToTriggerMultipleWindow() {
        driver.findElement(triggerMultipleWindow).click();
    }

    public void switchToNewTabWindow(){
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.switchTo().window(originalWindow);
    }
}