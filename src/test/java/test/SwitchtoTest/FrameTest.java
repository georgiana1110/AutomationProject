package test.SwitchtoTest;


import org.testng.annotations.Test;
import pages.switchTo.Frame;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class FrameTest extends BaseTest {
    private String newUrl = getBaseUrl()+ "Frames.html";
    private Frame frames;

    @Test
    public void CheckFrames() {
        driver.get(newUrl);
        //frames.clickSingleFrame();
      // frames.clickMultipleFrame();
    }
}

