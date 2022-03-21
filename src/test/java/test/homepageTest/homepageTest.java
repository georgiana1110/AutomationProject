package test.homepageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;
import static pages.BasePage.sleep;

public class homepageTest extends BaseTest {

    @Test
    public void testLogoIsDisplayed(){

        Assert.assertTrue(homePage.checkLogo(), "Logo is not displayed");
        homePage.clickSignInButton();
        sleep(5000);
        homePage.clickBack();
        homePage.clickSkipSignInButton();
        homePage.clickBack();
        homePage.checkEmailField("adresa@email.com");
        homePage.clickNextButton();

    }
}
