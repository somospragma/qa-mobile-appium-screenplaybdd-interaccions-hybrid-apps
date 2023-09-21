package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.example.userinterfaces.pragma.CarouselPage.IMG;

public class ImagenCarousel implements Question<Boolean> {
    public static ImagenCarousel isPresent() {
        return new ImagenCarousel();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return IMG.resolveFor(actor).isPresent();
    }
}

