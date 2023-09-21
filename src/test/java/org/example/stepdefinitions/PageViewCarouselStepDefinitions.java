package org.example.stepdefinitions;

import co.com.devco.automation.mobile.actions.Scroll;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.questions.ImagenCarousel;
import org.example.tasks.DesplazarCarousel;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.hooks.Hooks.pragma;
import static org.example.userinterfaces.pragma.CarouselPage.CARD_CAROUSEL;
import static org.example.userinterfaces.pragma.PrincipalPage.CARD_BUTTONS_DEMO;

public class PageViewCarouselStepDefinitions {

    @Dado("^el usuario esta en PageViewCarousel$")
    public void elUsuarioEstaEnPageViewCarousel() {
        pragma.wasAbleTo(
                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.untilVisibleTarget(CARD_CAROUSEL).toBottom().untilMaxAttempts(5),
                Click.on(CARD_CAROUSEL)
        );
    }

    @Cuando("^el usuario desplaza el carousel$")
    public void elUsuarioDesplazaElCarousel() {
        pragma.attemptsTo(
                DesplazarCarousel.dePageView()
        );
    }

    @Entonces("^el usuario deberia ver la imagen uno$")
    public void elUsuarioDeberiaVerLaImagenUno() {
        pragma.should(
                seeThat(ImagenCarousel.isPresent())
        );
    }
}
