package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hooks {

    public static Actor pragma;
    @Managed(driver = "Appium")
    public WebDriver driver;

    @Before(order = 1)
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Before(order = 2)
    public void prepareActor() {
        pragma = Actor.named("pragma");
        pragma.can(BrowseTheWeb.with(driver).asActor(pragma));
        pragma.entersTheScene();
    }

    @After
    public void logOut() {
        try {
            driver.quit();
        } catch (Exception ex) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Could not close driver. AppiumDriver not found", ex);
        }
    }
}
