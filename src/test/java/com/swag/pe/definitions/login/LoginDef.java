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

    @When("ingresa credenciales validas usuario {string} y la contraseña {string}")
    public void userLoginWithValidCredentials(String user, String password){
        login.tyUsername(user);
        login.typePassword(password);
        login.clickLogin();

    }

    @Then("la aplicacion deberia mostrar el modulo principal de productos")
    public void systemShowProductsModule(){
        Assert.assertTrue(validate.titleIsVisible());
    }
    @When("ingresa credenciales invalidas usuario {string} y la contraseña {string}")
    public void userLoginWithInvalidCredentials(String usuario, String contrasena) {
        // Aquí los valores de usuario y contrasena ya contienen los valores de la tabla
        login.tyUsername(usuario);
        login.typePassword(contrasena);
        login.clickLogin();
    }
    @Then("la aplicacion deberia mostrar un mensaje de error")
    public void systemShowErrorMessage(){
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }


}
