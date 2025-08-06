package stepdefs;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on Facebook login page")
    public void user_is_on_facebook_login_page() {
        driver = DriverFactory.initDriver();
        driver.get("https://www.facebook.com/");
        loginPage = new LoginPage(driver);
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.enterUsername("your_email");
        loginPage.enterPassword("your_password");
        loginPage.clickLogin();
    }

    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
        System.out.println("Assume: Verify homepage element here");
        DriverFactory.quitDriver();
    }
}
