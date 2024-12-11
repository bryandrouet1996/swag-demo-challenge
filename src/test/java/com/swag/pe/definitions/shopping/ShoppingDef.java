package com.swag.pe.definitions.shopping;

import com.swag.pe.steps.products.SelectProductStep;
import com.swag.pe.steps.shopping.ShoppingCartStep;
import com.swag.pe.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {

    @Steps(shared = true)
    SelectProductStep selectProduct;

    @Steps(shared = true)
    ValidationStep validate;
    @Steps(shared = true)
    ShoppingCartStep shoppingCart;

    @And("agrega productos al carrito de compras")
    public void userAddProduct(){
       selectProduct.addProducts(2);
    }
    @And("dar click en el icono del carrito")
    public void userClickShoppingCartIcon(){
        selectProduct.clickShoppingCartIcon();
    }
    @Then("el sistema deberia listar los productos agregados en el carrito de compras")
    public void systemListProducts(){
        Assert.assertTrue(validate.productsAreDisplayed());

    }

    @Then("el sistema deberia mostrar la cesta sin productos")
    public void systemShowEmptyShoppingCart(){
        Assert.assertTrue(validate.shoppingCartIsEmpty());
    }

    @When("completa todo el registro de orden datos como {string} {string} {string}")
    public void userCompleteOrder(String firstname, String lastname, String postal){
        shoppingCart.clickcheckoutButton();
        shoppingCart.typeFirstName(firstname);
        shoppingCart.typeLastName(lastname);
        shoppingCart.typePostal(postal);
        shoppingCart.clickContinue();
        shoppingCart.clickFinish();
    }

    @Then("el sistema deberia completar la compra")
    public void systemProcessShoppingCart(){
        Assert.assertTrue(validate.orderTextIsDisplayed());
    }



}
