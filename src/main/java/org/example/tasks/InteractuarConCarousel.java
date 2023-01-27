package org.example.tasks;

import co.com.devco.automation.mobile.abilities.Hide;
import co.com.devco.automation.mobile.actions.Drag;
import co.com.devco.automation.mobile.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.automation.mobile.actions.DragDirection.LEFT;
import static co.com.devco.automation.mobile.actions.DragDirection.RIGHT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.pragma.CarouselPage.CARD_CAROUSEL;
import static org.example.userinterfaces.pragma.CarouselPage.IMG;
import static org.example.userinterfaces.pragma.CarouselPage.IMG_CAROUSEL_DOS;
import static org.example.userinterfaces.pragma.CarouselPage.IMG_CAROUSEL_TRES;
import static org.example.userinterfaces.pragma.CarouselPage.IMG_DOS;
import static org.example.userinterfaces.pragma.FormularioPage.AUTOCOMPLETAR_NOMBRE;
import static org.example.userinterfaces.pragma.FormularioPage.BOTON_VALIDAR;
import static org.example.userinterfaces.pragma.FormularioPage.BOTON_VALIDAR_DOS;
import static org.example.userinterfaces.pragma.FormularioPage.CAMPO_CELULAR;
import static org.example.userinterfaces.pragma.FormularioPage.CAMPO_CLAVE;
import static org.example.userinterfaces.pragma.FormularioPage.CAMPO_NOMBRE;
import static org.example.userinterfaces.pragma.FormularioPage.CARD_INPUT;
import static org.example.userinterfaces.pragma.FormularioPage.INPUT_ONE;
import static org.example.userinterfaces.pragma.FormularioPage.INPUT_TWO;
import static org.example.userinterfaces.pragma.FormularioPage.MENSAJE_FORMULARIO_VALIDO;
import static org.example.userinterfaces.pragma.FormularioPage.VALIDACION_CAMPO;
import static org.example.userinterfaces.pragma.FormularioPage.VER_OCULTAR_CLAVE;
import static org.example.userinterfaces.pragma.principalPage.BOTON_ATRAS;
import static org.example.userinterfaces.pragma.principalPage.CARD_BUTTONS_DEMO;

public class InteractuarConCarousel implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.untilVisibleTarget(CARD_CAROUSEL).toBottom().untilMaxAttempts(5),
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
