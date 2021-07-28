package com.zerobank.stepDefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class login_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on yhe login page")
    public void the_user_is_on_yhe_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.id("signin_button")).click();



    }

    @Then("user enters credentials and logs in")
    public void user_enters_credentials_and_logs_in() {
        loginPage.username.sendKeys("username");
        loginPage.password.sendKeys("password");
        BrowserUtils.sleep(1);
        loginPage.loginButton.click();
        loginPage.resolveUnsecureConnections();

    }

}
