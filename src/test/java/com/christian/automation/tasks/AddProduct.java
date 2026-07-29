package com.christian.automation.tasks;

import com.christian.automation.userinterfaces.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(InventoryPage.BTN_BACKPACK),

                Click.on(InventoryPage.BTN_CART)

        );
    }

    public static AddProduct alCarrito() {
        return Tasks.instrumented(AddProduct.class);
    }
}