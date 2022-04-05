package test.registerTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class registerTest extends BaseTest{
private String newUrl =getBaseUrl()+ "Register.html";

    @Test
    public void testRegister(){
        driver.get(newUrl);
       // homePage.clickSkipSignInButton();
        Assert.assertTrue(register.checkTitle(), "The title is not displayed");
        register.setFullName("Ion", "Ionescu");
        register.setAddress("Strada Crizantemelor, Nr 487 J");
        register.setEmailAddress("email@address.com");
        register.phoneNo("0678776555");
        register.setGenderMale();
        register.setCricket();
        register.setLanguages("Romanian");
        register.setSkills("Java");
        register.setSubmit();
        register.setRefresh();
        register.setCountry("India");
        register.setPassword("parola", "parola");
        register.setDateOfBirth("2000", "October", "7");
    }
}
