package com.christian.automation.stepdefinitions;

import com.christian.automation.models.UserData;
import com.christian.automation.questions.LoginExitoso;
import com.christian.automation.tasks.Login;
import com.christian.automation.tasks.OpenSauceDemo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.junit.Assert.assertTrue;

public class LoginStepDefinition {

    @Before
    public void configurarActor() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario abre Saucedemo")
    public void abrirAplicacion() {

        OnStage.theActorCalled("Christian")
                .attemptsTo(
                        OpenSauceDemo.pagina()
                );
    }

    @When("ingresa sus credenciales validas")
    public void realizarLogin() {

        UserData user =
                new UserData(
                        "standard_user",
                        "secret_sauce"
                );

        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        Login.conCredenciales(user)
                );
    }

    @Then("debe visualizar el catalogo de productos")
    public void validarLogin() {

        assertTrue(
                LoginExitoso.fueCorrecto()
                        .answeredBy(OnStage.theActorInTheSpotlight())
        );
    }
}