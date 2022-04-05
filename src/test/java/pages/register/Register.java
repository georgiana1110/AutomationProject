package pages.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Register extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Register.class);
    private static Register instance;
    private By title = By.xpath("//div[h1='Automation Demo Site ']");
    private By firstName = By.xpath("//input[@ng-model='FirstName']");
    private By lastName = By.xpath("//input[@ng-model='LastName']");

    private By address = By.xpath("//textarea[@ng-model='Adress']");

    private By emailAddress = By.xpath("//input[@ng-model='EmailAdress']");

    private By phoneNumber = By.xpath("//input[@ng-model='Phone']");

    private By gender = By.xpath("//input[@value='Male']");

    private By cricket = By.id("checkbox1");
    private By movies = By.id("checkbox2");
    private By hockey = By.id("checkbox3");

    private By languages = By.id("msdd");
    String selectlanguage = "//a[contains(text(),'%s')]";

    String selectSkills = "Skills";

    private By submit = By.id("submitbtn");
    private By refresh = By.id("Button1");

    private By selectCountry = By.xpath("//span[@role='combobox']");
    private By eneterCountry = By.xpath("//input[@role='textbox']");

    String selectYear = "yearbox";
    String selectMonth = ("//select[@ng-model = 'monthbox']");
    String selectDay = "daybox";

    private By password = By.id("firstpassword");
    private By confirmPassword = By.id("secondpassword");



    private Register() {

    }

    public static Register getInstance() {
        if (instance == null) {
            instance = new Register();
        }
        return instance;
    }

    public boolean checkTitle() {
        LOG.info("Check the title");
        return driver.findElement(title).isDisplayed();
    }

    public void setFullName(String fname, String lname) {
        LOG.info("Set full name into Form");
        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);

    }

    public void setAddress(String enterAddress) {
        LOG.info("Set Address");
        driver.findElement(address).sendKeys(enterAddress);
    }

    public void setEmailAddress(String emailAddress) {
        LOG.info("Set Email Address");
        driver.findElement(address).sendKeys(emailAddress);
    }

    public void phoneNo(String phone) {
        LOG.info("Enter Phone Number");
        driver.findElement(phoneNumber).sendKeys(phone);
    }

    public void setGenderMale() {
        LOG.info("Set gender info");
        driver.findElement(gender).click();
    }

    public void setCricket() {
        LOG.info("Set Cricket");
        driver.findElement(cricket).click();
    }

    public void setMovies() {
        LOG.info("Set Movies");
        driver.findElement(movies).click();
    }

    public void setHockey() {
        LOG.info("Set Hockey");
        driver.findElement(hockey).click();
    }

    public void setLanguages(String language) {
        driver.findElement(languages).click();
        driver.findElement(By.xpath(String.format(selectlanguage, language))).click();
    }

    public void setSkills(String skill) {
        LOG.info("Set Skill");
        Select newSkill = new Select(driver.findElement(By.id(selectSkills)));
        newSkill.selectByValue(skill);
    }

    public void setSubmit() {
        LOG.info("Set Submit");
        driver.findElement(submit).click();
    }

    public void setRefresh() {
        LOG.info("Set Refresh");
        driver.findElement(refresh).click();
    }

    public void setCountry(String country) {
        LOG.info("Set Country");
        driver.findElement(selectCountry).click();
        driver.findElement(eneterCountry).sendKeys(country);
    }

    public void setPassword(String pass, String confirmPass) {
        LOG.info("Set Password");
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(confirmPass);
    }

    public void setDateOfBirth(String year, String month, String day) {
        LOG.info("Set Date Of Birth");
        Select newYear = new Select(driver.findElement(By.id(selectYear)));
        newYear.selectByValue(year);
        Select newMonth = new Select(driver.findElement(By.xpath(selectMonth)));
        newMonth.selectByValue(month);
        Select newDay = new Select(driver.findElement(By.id(selectDay)));
        newDay.selectByValue(day);
    }
    public void scrolltoElement(){
        WebElement element = driver.findElement(submit);
        Actions actions =new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
}