package com.christian.automation.tasks;

import com.christian.automation.models.UserData;
import com.christian.automation.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private UserData userData;

    public Login(UserData userData) {
        this.userData = userData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(userData.getUsername())
                        .into(LoginPage.TXT_USERNAME),

                Enter.theValue(userData.getPassword())
                        .into(LoginPage.TXT_PASSWORD),

                Click.on(LoginPage.BTN_LOGIN)
        );
    }

    public static Login conCredenciales(UserData userData) {
        return Tasks.instrumented(Login.class, userData);
    }
}