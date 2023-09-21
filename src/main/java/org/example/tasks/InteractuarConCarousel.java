package org.example.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.interactions.Drag;
import org.example.interactions.Scroll;
import org.example.models.ScrollDirection;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.models.DragDirection.LEFT;
import static org.example.models.DragDirection.RIGHT;
import static org.example.userinterfaces.pragma.CarouselPage.CARD_CAROUSEL;
import static org.example.userinterfaces.pragma.CarouselPage.IMG;

import static org.example.userinterfaces.pragma.CarouselPage.IMG_DOS;

import static org.example.userinterfaces.pragma.PrincipalPage.CARD_BUTTONS_DEMO;

public class InteractuarConCarousel implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.untilVisibleTarget(CARD_CAROUSEL).direction(ScrollDirection.TO_BOTTOM).untilMaxAttempts(5),
                Click.on(CARD_CAROUSEL),
                Drag.theElement(IMG).to(LEFT),
                Drag.theElement(IMG_DOS).to(LEFT),
                Drag.theElement(IMG_DOS).to(RIGHT)
        );
    }

    public static Performable deFlutter() {
        return instrumented(InteractuarConCarousel.class);
    }

}
