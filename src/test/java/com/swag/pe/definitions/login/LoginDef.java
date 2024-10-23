package com.swag.pe.definitions.login;

import com.swag.pe.steps.login.LoginStep;
import com.swag.pe.steps.validations.ValidationStep;
import com.swag.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("el ususario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/");

    }

    @When("ingresa credenciales validas")
    public void userLoginWithValidCredentials(){
        login.tyUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();

    }

    @Then("la aplicacion deberia mostrar el modulo principal de productos")
    public void systemShowProductsModule(){
        Assert.assertTrue(validate.titleIsVisible());
    }
    @When("ingresa credenciales invalidas")
    public void userLoginWithInvalidCredentials(){
        login.tyUsername("standard_user");
        login.typePassword("12345");
        login.clickLogin();

    }
    @Then("la aplicacion deberia mostrar un mensaje de error")
    public void systemShowErrorMessage(){
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }



}
