package test.registerTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class registerTest extends BaseTest{

    @Test
    public void testRegister(){
        homePage.clickSkipSignInButton();
        Assert.assertTrue(register.checkTitle(), "The title is not displayed");
        register.setFullName("Ion", "Ionescu");
        register.setAddress("Strada Crizantemelor, Nr 487 J");
        register.setEmailAddress("email@address.com");
        register.phoneNo("0678776555");
       // register.setgender();
        register.setCricket();
        register.setLanguages("Romanian");
        register.setSkills("Java");
    }

}
