package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.example.userinterfaces.pragma.CarouselPage.IMG;

public class ImagenIsPresent implements Question<Boolean> {
    public static ImagenIsPresent delCarousel() {
        return new ImagenIsPresent();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return IMG.resolveFor(actor).isPresent();
    }
}

