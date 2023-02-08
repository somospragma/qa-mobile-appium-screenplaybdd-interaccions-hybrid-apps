package org.example.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Hooks {

    @Managed(driver = "Appium")
    public static WebDriver driver;
    private static boolean beforeAll = true;
    public static Actor pragma;

    @Before(order = 1)
    public void setUp() {
        if (beforeAll) {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    driver.quit();
                    driver = null;
                }
            });
            beforeAll = false;
        }
    }

    @Before(order = 2)
    public void prepareStage() {
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(getProxiedDriver())));
    }

    @Before(order = 3)
    public void prepareActor() {
        pragma = Actor.named("pragma");
        pragma.can(BrowseTheWeb.with(driver));
    }

    @After
    public void logOut() {
        try {
            AppiumDriver<?> facade = getProxiedDriver();
            facade.closeApp();
            facade.launchApp();
        } catch (Exception ex) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Could not close driver. AppiumDriver not found", ex);
        }
    }
}
