package com.christian.automation.questions;

import com.christian.automation.userinterfaces.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PurchaseCompleted implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return InventoryPage.LBL_CONFIRMATION
                .resolveFor(actor)
                .getText()
                .equals("Thank you for your order!");
    }

    public static PurchaseCompleted exitosa() {
        return new PurchaseCompleted();
    }
}