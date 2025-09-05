package stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("saya membuka halaman login")
    public void bukaHalamanLogin() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("saya memasukkan username {string} dan password {string}")
    public void inputLogin(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("saya klik tombol login")
    public void klikLogin() {
        loginPage.clickLogin();
    }

    @Then("saya berhasil login ke dashboard")
    public void loginSukses() {
        assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        driver.quit();
    }

    @Then("saya melihat pesan error")
    public void loginGagal() {
        assertTrue(driver.getPageSource().contains("Epic sadface"));
        driver.quit();
    }
}