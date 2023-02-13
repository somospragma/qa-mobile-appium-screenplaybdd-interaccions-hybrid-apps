package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.interactions.HideKeyboard;
import org.example.interactions.Scroll;
import org.example.interactions.TapOnCoordinates;
import org.example.models.Direction;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.hooks.Hooks.pragma;
import static org.example.userinterfaces.pragma.FormularioPage.*;
import static org.example.userinterfaces.pragma.FormularioPage.INPUT_ONE;
import static org.example.userinterfaces.pragma.principalPage.CARD_BUTTONS_DEMO;


public class FormInputsScreenStepDefinitions {

    @Given("^the user is in Inputs Screen$")
    public void the_user_is_in_Inputs_Screen() {
        pragma.attemptsTo(
                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.untilVisibleTarget(CARD_INPUT).direction(Direction.TO_BOTTOM).untilMaxAttempts(2),
                Click.on(CARD_INPUT)
        );
    }


    @When("fill out the name with the {word} suggest with {word}")
    public void fill_out_the_name_with_the_first_suggest_with_a(String option, String letter) {
        pragma.attemptsTo(
                Click.on(INPUT_ONE),
                Enter.theValue("a").into(INPUT_ONE),
                HideKeyboard.perform(),
                TapOnCoordinates.onPoint(THIRD_OPTION_AUTOCOMPLETE)
        );
    }

}
