package com.swag.pe.pages.productos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SelectProductPage extends PageObject {

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory ']")
    protected List<WebElementFacade> products;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    protected WebElementFacade shoppincartIcon;
}
