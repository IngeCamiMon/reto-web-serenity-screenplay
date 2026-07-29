package com.christian.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenSauceDemo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    public static OpenSauceDemo pagina() {
        return Tasks.instrumented(OpenSauceDemo.class);
    }
}