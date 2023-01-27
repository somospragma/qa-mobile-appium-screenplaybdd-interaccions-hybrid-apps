package org.example.tasks;

import co.com.devco.automation.mobile.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.pragma.principalPage.BOTON_ATRAS;
import static org.example.userinterfaces.pragma.principalPage.BOTON_CONTADOR;
import static org.example.userinterfaces.pragma.principalPage.BOTON_OK;
import static org.example.userinterfaces.pragma.principalPage.BOTON_SHOW_ALERT;
import static org.example.userinterfaces.pragma.principalPage.BTN_EDITAR_FECHA;
import static org.example.userinterfaces.pragma.principalPage.BTN_OK_FECHA;
import static org.example.userinterfaces.pragma.principalPage.CARD_BUTTONS_DEMO;
import static org.example.userinterfaces.pragma.principalPage.CARD_CONTADOR;
import static org.example.userinterfaces.pragma.principalPage.CARD_DATEPICKER;
import static org.example.userinterfaces.pragma.principalPage.CARD_DIALOGS_DEMO;
import static org.example.userinterfaces.pragma.principalPage.CARD_DROPDOWN;
import static org.example.userinterfaces.pragma.principalPage.CARD_NAVIGATION_BAR;
import static org.example.userinterfaces.pragma.principalPage.CARD_SWITCH;
import static org.example.userinterfaces.pragma.principalPage.ELEMENT_ONE_LIST;
import static org.example.userinterfaces.pragma.principalPage.ELEMENT_THREE_LIST;
import static org.example.userinterfaces.pragma.principalPage.INPUT_EDITAR_FECHA;
import static org.example.userinterfaces.pragma.principalPage.INPUT_FECHA;
import static org.example.userinterfaces.pragma.principalPage.SWITCH;
import static org.example.userinterfaces.pragma.principalPage.SWITCH_TILE;
import static org.example.userinterfaces.pragma.principalPage.TAB_BUSINESS;
import static org.example.userinterfaces.pragma.principalPage.TAB_SCHOOL;
import static org.example.userinterfaces.pragma.principalPage.TITULO_BUTTONS_DEMO;
import static org.example.userinterfaces.pragma.principalPage.TXT_ALERT;
import static org.example.userinterfaces.pragma.principalPage.TXT_SCHOOL;
import static org.example.userinterfaces.pragma.principalPage.TXT_SWITCH_TILE;
import static org.example.userinterfaces.pragma.principalPage.VALOR_CONTADOR;

public class InteractuarConElementos implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
//        //Buttons
        actor.attemptsTo(WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CARD_BUTTONS_DEMO));
        actor.attemptsTo(WaitUntil.the(TITULO_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Ensure.that(TITULO_BUTTONS_DEMO.resolveFor(actor).getAttribute("content-desc")).isEqualTo("Show Case Material "));
//
//        //Contador
        actor.attemptsTo(Click.on(BOTON_ATRAS));
        actor.attemptsTo(
                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.untilVisibleTarget(CARD_CONTADOR).toBottom().untilMaxAttempts(5),
                Click.on(CARD_CONTADOR));
        actor.attemptsTo(WaitUntil.the(BOTON_CONTADOR, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BOTON_CONTADOR));
        actor.attemptsTo(Ensure.that(VALOR_CONTADOR.resolveFor(actor).getAttribute("content-desc")).isEqualTo("1"));

//        //Alerta
        actor.attemptsTo(Click.on(BOTON_ATRAS));
        actor.attemptsTo(
                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.untilVisibleTarget(CARD_DIALOGS_DEMO).toBottom().untilMaxAttempts(5),
                Click.on(CARD_DIALOGS_DEMO));
        actor.attemptsTo(WaitUntil.the(BOTON_SHOW_ALERT, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BOTON_SHOW_ALERT));
        actor.attemptsTo(Ensure.that(TXT_ALERT.resolveFor(actor).getAttribute("content-desc")).isEqualTo("This is a short description for the popup alert"));
        actor.attemptsTo(Click.on(BOTON_OK));

        //cards demo
//        actor.attemptsTo(Click.on(BOTON_ATRAS));
//        actor.attemptsTo(
//                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
//                Click.on(BOTON_CARDS_DEMO));

        //#################################################Date Picker
         actor.attemptsTo(Click.on(BOTON_ATRAS));
                actor.attemptsTo(
                        WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                        Click.on(CARD_DATEPICKER),
                       // Click.on(BTN_VERSION),

                        Click.on(INPUT_FECHA),
                        WaitUntil.the(BTN_EDITAR_FECHA, isVisible()).forNoMoreThan(5).seconds(),
                        Click.on(BTN_EDITAR_FECHA),
                        Clear.field(INPUT_EDITAR_FECHA),
                        Enter.theValue("12/24/2022").into(INPUT_EDITAR_FECHA),
                        Click.on(BTN_OK_FECHA)
                        );
        actor.attemptsTo(Ensure.that(INPUT_FECHA.resolveFor(actor).getText()).isEqualTo("2022-12-24"));

//        //########################################## Dropdown list
        actor.attemptsTo(Click.on(BOTON_ATRAS));

        actor.attemptsTo(
               // WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.untilVisibleTarget(CARD_DROPDOWN).toTop().untilMaxAttempts(5),
                Click.on(CARD_DROPDOWN),
                Click.on(ELEMENT_ONE_LIST),
                Click.on(ELEMENT_THREE_LIST)

                );
        actor.attemptsTo(Ensure.that(ELEMENT_THREE_LIST.resolveFor(actor).getAttribute("content-desc")).isEqualTo("Element Three"));

        //###################Input Screen


        //################### Navigation bar
        actor.attemptsTo(Click.on(BOTON_ATRAS));
        actor.attemptsTo(
                //WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.untilVisibleTarget(CARD_NAVIGATION_BAR).toBottom().untilMaxAttempts(5),
                Click.on(CARD_NAVIGATION_BAR),
                WaitUntil.the(TAB_BUSINESS, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(TAB_BUSINESS),
                WaitUntil.the(TAB_SCHOOL, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(TAB_SCHOOL));
               actor.attemptsTo(Ensure.that(TXT_SCHOOL.resolveFor(actor).getAttribute("content-desc")).isEqualTo(" School"));

        //        //#################################
        actor.attemptsTo(Click.on(BOTON_ATRAS));
        actor.attemptsTo(
               // WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.untilVisibleTarget(CARD_SWITCH).toBottom().untilMaxAttempts(5),
                Click.on(CARD_SWITCH),
                WaitUntil.the(SWITCH, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SWITCH),
                Click.on(SWITCH_TILE));
                actor.attemptsTo(Ensure.that(TXT_SWITCH_TILE.resolveFor(actor).getAttribute("content-desc")).isEqualTo("The value is true"));




    }

    public static Performable deFlutter() {
        return instrumented(InteractuarConElementos.class);
    }

}
