package org.example.tasks;

import co.com.devco.automation.mobile.abilities.Hide;
import co.com.devco.automation.mobile.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
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
import static org.example.userinterfaces.pragma.principalPage.CARD_DIALOGS_DEMO;

public class InteractuarConFormulario implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.untilVisibleTarget(CARD_INPUT).toBottom().untilMaxAttempts(5),
                Click.on(CARD_INPUT),
                Click.on(INPUT_ONE),
                Enter.theValue("a").into(INPUT_ONE),
                Click.on(AUTOCOMPLETAR_NOMBRE),
                Click.on(BOTON_VALIDAR),
                WaitUntil.the(VALIDACION_CAMPO, isVisible()).forNoMoreThan(5).seconds());

        actor.attemptsTo(Ensure.that(VALIDACION_CAMPO.resolveFor(actor).getAttribute("content-desc")).contains("field is empty"));

        actor.attemptsTo(Click.on(INPUT_TWO),
                Enter.theValue("in flutter").into(INPUT_TWO),
                Click.on(BOTON_VALIDAR));

        actor.attemptsTo(
                Hide.theKeyboard(),
                Click.on(CAMPO_NOMBRE),
                Enter.theValue("Kedyn").into(CAMPO_NOMBRE),
                Hide.theKeyboard(),
                //Scroll.untilVisibleTarget(CAMPO_CELULAR).toBottom().untilMaxAttempts(5),
                Click.on(CAMPO_CELULAR),
                Enter.theValue("3004440000").into(CAMPO_CELULAR),
                Hide.theKeyboard(),
                Click.on(CAMPO_CLAVE),
                Hide.theKeyboard(),
                Enter.theValue("1245").into(CAMPO_CLAVE),
                Hide.theKeyboard(),
//                Scroll.untilVisibleTarget(BOTON_VALIDAR_DOS).toBottom().untilMaxAttempts(5),
                Click.on(VER_OCULTAR_CLAVE),
                Click.on(BOTON_VALIDAR_DOS),
                Hide.theKeyboard(),
                WaitUntil.the(MENSAJE_FORMULARIO_VALIDO, isVisible()).forNoMoreThan(3).seconds());

        actor.attemptsTo(Ensure.that(MENSAJE_FORMULARIO_VALIDO.resolveFor(actor).getAttribute("content-desc")).contains("Form is valid"));
    }

    public static Performable deFlutter() {
        return instrumented(InteractuarConFormulario.class);
    }

}
