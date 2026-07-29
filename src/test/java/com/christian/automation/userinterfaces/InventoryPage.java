package com.christian.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {

    public static final Target BTN_BACKPACK =
            Target.the("boton agregar mochila")
                    .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target BTN_CART =
            Target.the("carrito")
                    .located(By.className("shopping_cart_link"));

    public static final Target BTN_CHECKOUT =
            Target.the("checkout")
                    .located(By.id("checkout"));

    public static final Target TXT_FIRSTNAME =
            Target.the("nombre")
                    .located(By.id("first-name"));

    public static final Target TXT_LASTNAME =
            Target.the("apellido")
                    .located(By.id("last-name"));

    public static final Target TXT_POSTAL =
            Target.the("codigo postal")
                    .located(By.id("postal-code"));

    public static final Target BTN_CONTINUE =
            Target.the("continue")
                    .located(By.id("continue"));

    public static final Target BTN_FINISH =
            Target.the("finish")
                    .located(By.id("finish"));

    public static final Target LBL_CONFIRMATION =
            Target.the("mensaje compra exitosa")
                    .located(By.className("complete-header"));
}