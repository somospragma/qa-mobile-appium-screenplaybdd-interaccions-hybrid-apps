package org.example.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.example.questions.ObtenerTextoSegunCampoFlutter;
import org.example.questions.PresentarImagen;
import org.example.tasks.InteractuarConCalendario;
import org.example.tasks.InteractuarConCarousel;
import org.example.tasks.InteractuarConElementos;
import org.example.tasks.InteractuarConFormulario;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.example.hooks.Hooks.pragma;
import static org.example.userinterfaces.pragma.FormularioPage.MENSAJE_FORMULARIO_VALIDO;
import static org.hamcrest.Matchers.equalTo;

public class FlutterPragma {
    @Given("^que (.*) quiere iniciar pruebas en flutter$")
    public void quiereIniciarPruebasEnFlutter(String actor) {
        pragma.assignName(actor);
    }

    @Cuando("^ingresa a la app$")
    public void ingresaaLaApp() {
        pragma.attemptsTo(InteractuarConElementos.deFlutter());
    }

    @Cuando("^interactua con el calendario$")
    public void interactuaConElCalendario() {
        pragma.attemptsTo(InteractuarConCalendario.deFlutter());
    }

    @Cuando("^interactua con el formulario$")
    public void interactuaConElFormulario() {
        pragma.attemptsTo(InteractuarConFormulario.deFlutter());
    }

    @Entonces("^el usuario debe ver el mensaje (.*)$")
    public void verificaElMensajeDeSaludo(String mensaje) {
        pragma.should(seeThat(ObtenerTextoSegunCampoFlutter.presentaElMensaje(MENSAJE_FORMULARIO_VALIDO), equalTo(mensaje)));
    }

    @Entonces("^debe ver la imagen uno$")
    public void debeVerLaImagenUno() {
        pragma.should(seeThat(PresentarImagen.delCarousel()));

    }

    @Cuando("^interactua con el carousel$")
    public void interactuaConElCarousel() {
        pragma.attemptsTo(InteractuarConCarousel.deFlutter());
    }
}