package com.christian.automation.questions;

import com.christian.automation.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginExitoso implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginPage.LBL_PRODUCTS.resolveFor(actor)
                .isVisible();
    }

    public static LoginExitoso fueCorrecto() {
        return new LoginExitoso();
    }
}