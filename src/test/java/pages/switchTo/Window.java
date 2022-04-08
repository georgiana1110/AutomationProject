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

    public static void clickWindowTabTabbed() {
        driver.findElement(windowTabTabbed).click();
    }
    public static void clickWindowTabSeperate() {
        driver.findElement(windowTabSeparate).click();
    }
    public static void clickWindowTabMultiple() {
        driver.findElement(windowTabMultiple).click();
    }

    public static void clickToTriggerTabbedWindow() {
        driver.findElement(triggerTabbedWindow).click();
    }
    public static void clickToTriggerSeperateWindow() {
        driver.findElement(triggerSeparateWindow).click();
    }
    public static void clickToTriggerMultipleWindow() {
        driver.findElement(triggerMultipleWindow).click();
    }

    public static void switchToNewTabWindow(){
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