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
import static org.example.userinterfaces.pragma.FormularioPage.MENSAJE_FORMULARIO_VALIDO;
import static org.hamcrest.Matchers.equalTo;

public class FlutterPragma {
    @Given("^que (.*) quiere iniciar pruebas en flutter$")
    public void quiereIniciarPruebasEnFlutter(String actor) {
        theActorCalled(actor).entersTheScene();
    }

    @Cuando("^ingresa a la app$")
    public void ingresaaLaApp() {
        theActorInTheSpotlight().attemptsTo(InteractuarConElementos.deFlutter());
    }

    @Cuando("^interactua con el calendario$")
    public void interactuaConElCalendario() {
        theActorInTheSpotlight().attemptsTo(InteractuarConCalendario.deFlutter());
    }

    @Cuando("^interactua con el formulario$")
    public void interactuaConElFormulario() {
        theActorInTheSpotlight().attemptsTo(InteractuarConFormulario.deFlutter());
    }

    @Entonces("^el usuario debe ver el mensaje (.*)$")
    public void verificaElMensajeDeSaludo(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ObtenerTextoSegunCampoFlutter.presentaElMensaje(MENSAJE_FORMULARIO_VALIDO), equalTo(mensaje)));
    }

    @Entonces("^debe ver la imagen uno$")
    public void debeVerLaImagenUno() {
        theActorInTheSpotlight().should(seeThat(PresentarImagen.delCarousel()));

    }

    @Cuando("^interactua con el carousel$")
    public void interactuaConElCarousel() {
        theActorInTheSpotlight().attemptsTo(InteractuarConCarousel.deFlutter());
    }
}