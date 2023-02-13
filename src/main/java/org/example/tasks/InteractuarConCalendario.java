package org.example.tasks;

import co.com.devco.automation.mobile.actions.Drag;
import co.com.devco.automation.mobile.actions.Scroll;
import io.appium.java_client.PerformsTouchActions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.devco.automation.mobile.actions.DragDirection.DOWN;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static org.example.userinterfaces.pragma.DatePickerPage.ANIO_ACTUAL;

import static org.example.userinterfaces.pragma.DatePickerPage.SELECCIONAR_ANIO;

import static org.example.userinterfaces.pragma.principalPage.CARD_DATEPICKER;
import static org.example.userinterfaces.pragma.principalPage.INPUT_FECHA;

public class InteractuarConCalendario implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CARD_DATEPICKER, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CARD_DATEPICKER),
                Click.on(INPUT_FECHA),

                Click.on(SELECCIONAR_ANIO),
                Drag.theElement(ANIO_ACTUAL).to(DOWN)


              //  Click.on(BUSCAR_ANIO)



                //WaitUntil.the(SCROLL, isVisible()).forNoMoreThan(5).seconds(),

               // WebElement


                // WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
//                Scroll.untilVisibleTarget(SCROLL).toTop().untilMaxAttempts(5),
               // Scroll.untilVisibleTarget(BUSCAR_ANIO).toTop().untilMaxAttempts(5),

                //FUNCIONA
                //Scroll.untilVisibleTarget(SELECCIONAR_DIA).toBottom().untilMaxAttempts(5),


                // Drag.theElement(SCROLL).to(DragDirection.UP),
           // Click.on(BUSCAR_ANIO)


//                Click.on(BUSCAR_MES),
//                Click.on(BUSCAR_MES),
//
//                Click.on(SELECCIONAR_DIA),
//                Click.on(BTN_OK_FECHA)


//                Click.on(INPUT_FECHA),
//                WaitUntil.the(BTN_EDITAR_FECHA, isVisible()).forNoMoreThan(5).seconds(),
//                Click.on(BTN_EDITAR_FECHA),
//                Clear.field(INPUT_EDITAR_FECHA),
//                Enter.theValue("12/24/2022").into(INPUT_EDITAR_FECHA),
//                Click.on(BTN_OK_FECHA)
        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // WebDriver driver = ThucydidesWebDriverSupport.getProxiedDriver();



//        TouchActions action = new TouchActions(driver);
//        action.
//        action.perform();


//        actor.attemptsTo(Ensure.that(INPUT_FECHA.resolveFor(actor).getText()).isEqualTo("1992-10-10"));

    }

    public static Performable deFlutter() {
        return instrumented(InteractuarConCalendario.class);
    }

}
