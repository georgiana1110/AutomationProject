package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.homepage.HomePage;
import pages.register.Register;
import pages.switchTo.Alert;

public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public Register register = Register.getInstance();
    public Alert alert = Alert.getInstance();

    @BeforeSuite
    public void imit(){
        BasePage.setUp();
    }
    @AfterSuite
    public void tearDown(){
        BasePage.tearDown();
    }

}
