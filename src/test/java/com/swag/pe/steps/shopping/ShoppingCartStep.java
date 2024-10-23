package com.swag.pe.steps.shopping;

import com.swag.pe.definitions.shopping.ShoppingCartPage;
import net.thucydides.core.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {

    @Step("Click en checkout")
    public void clickcheckoutButton(){
        checkoutButton.click();
    }
    @Step("Ingresar nombre")
    public void typeFirstName(String firtsname){
        txt_firstname.sendKeys(firtsname);
    }
    @Step("Ingresar apellido")
    public void typeLastName(String lastname){
        txt_lastname.sendKeys(lastname);
    }
    @Step("Ingresar postal")
    public void typePostal(String postal){
        txt_postal.sendKeys(postal);
    }
    @Step("Click en continuar")
    public void clickContinue(){
        continuebutton.click();
    }
    @Step("Click en finalizar")
    public void clickFinish(){
        finishbutton.click();
    }
}
