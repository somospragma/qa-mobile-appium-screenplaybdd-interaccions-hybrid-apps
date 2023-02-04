package org.example.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/flutter_pragma.feature",
        glue = {"org.example.stepdefinitions"},
//        tags = "@Formulario",
        snippets = SnippetType.CAMELCASE
)
public class FlutterPragmaRunner {
}