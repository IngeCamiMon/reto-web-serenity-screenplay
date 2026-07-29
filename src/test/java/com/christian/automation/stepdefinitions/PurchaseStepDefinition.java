package com.christian.automation.stepdefinitions;

import com.christian.automation.models.UserData;
import com.christian.automation.questions.PurchaseCompleted;
import com.christian.automation.tasks.AddProduct;
import com.christian.automation.tasks.Checkout;
import com.christian.automation.tasks.Login;
import com.christian.automation.tasks.OpenSauceDemo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.junit.Assert.assertTrue;

public class PurchaseStepDefinition {

    @When("realiza login y agrega un producto al carrito")
    public void agregarProducto() {

        UserData user =
                new UserData(
                        "standard_user",
                        "secret_sauce"
                );

        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        Login.conCredenciales(user),
                        AddProduct.alCarrito()
                );
    }

    @When("completa el proceso de compra")
    public void completarCompra() {

        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        Checkout.compra()
                );
    }

    @Then("debe visualizar mensaje de compra exitosa")
    public void validarCompra() {

        assertTrue(
                PurchaseCompleted.exitosa()
                        .answeredBy(OnStage.theActorInTheSpotlight())
        );
    }
}