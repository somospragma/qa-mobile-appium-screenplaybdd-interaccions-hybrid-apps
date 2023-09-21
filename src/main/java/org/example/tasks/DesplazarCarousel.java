package org.example.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.example.interactions.Drag;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.models.DragDirection.LEFT;
import static org.example.models.DragDirection.RIGHT;
import static org.example.userinterfaces.pragma.CarouselPage.IMG;
import static org.example.userinterfaces.pragma.CarouselPage.IMG_DOS;

public class DesplazarCarousel implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Drag.theElement(IMG).to(LEFT),
                Drag.theElement(IMG_DOS).to(LEFT),
                Drag.theElement(IMG_DOS).to(RIGHT)
        );
    }

    public static Performable dePageView() {
        return instrumented(DesplazarCarousel.class);
    }

}
