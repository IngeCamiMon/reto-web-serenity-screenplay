package com.christian.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/purchase.feature",
        glue = "com.christian.automation.stepdefinitions"
)
public class PurchaseTest {
}
