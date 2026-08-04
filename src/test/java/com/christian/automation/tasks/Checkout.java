package com.christian.automation.tasks;

import com.christian.automation.userinterfaces.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Checkout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(InventoryPage.BTN_CHECKOUT),

                WaitUntil.the(
                        InventoryPage.TXT_FIRSTNAME,
                        WebElementStateMatchers.isVisible()
                ),

                Enter.theValue("Christian")
                        .into(InventoryPage.TXT_FIRSTNAME),

                Enter.theValue("Montano")
                        .into(InventoryPage.TXT_LASTNAME),

                Enter.theValue("050001")
                        .into(InventoryPage.TXT_POSTAL),

                Click.on(InventoryPage.BTN_CONTINUE),

                WaitUntil.the(
                        InventoryPage.BTN_FINISH,
                        WebElementStateMatchers.isVisible()
                ),

                Click.on(InventoryPage.BTN_FINISH)

        );
    }

    public static Checkout compra() {
        return Tasks.instrumented(Checkout.class);
    }
}