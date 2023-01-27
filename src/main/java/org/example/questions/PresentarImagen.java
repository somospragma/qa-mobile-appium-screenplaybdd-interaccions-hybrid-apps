package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.example.userinterfaces.pragma.CarouselPage.IMG;

public class PresentarImagen implements Question<Boolean> {
    public static PresentarImagen delCarousel() {
        return new PresentarImagen();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return IMG.resolveFor(actor).isPresent();
    }
}

