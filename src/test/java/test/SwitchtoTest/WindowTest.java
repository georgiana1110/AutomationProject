package test.SwitchtoTest;

import org.testng.annotations.Test;
import pages.switchTo.Window;
import test.BaseTest;

import static pages.BasePage.*;
import static pages.BasePage.sleep;

public class WindowTest extends BaseTest {
    private String newUrl = getBaseUrl() + "Windows.html";

    @Test
    public void checkWindow() {
        driver.get(newUrl);

        //Window Tabbed
        Window.clickWindowTabTabbed();
        Window.clickToTriggerTabbedWindow();
        Window.switchToNewTabWindow();


        //Window Seperate
        Window.clickWindowTabSeperate();
        sleep(3000);
        Window.clickToTriggerSeperateWindow();
        sleep(3000);
        Window.switchToNewTabWindow();
        sleep(3000);

        //Window Multiple
        Window.clickWindowTabMultiple();
        sleep(3000);
        Window.clickToTriggerMultipleWindow();
        sleep(3000);
        Window.switchToNewTabWindow();
        sleep(3000);
    }
}