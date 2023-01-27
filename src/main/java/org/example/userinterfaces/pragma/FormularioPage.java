package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class FormularioPage {

    public static final Locator CARD_INPUT_LOCATOR = locator().withAndroidAccesibilityId("Inputs Screen ").withIosAccesibilityId("1");
    public static final Target CARD_INPUT = Target.the("Diligenciar campo").located(theElementBy(CARD_INPUT_LOCATOR));

    public static final Locator INPUT_ONE_LOCATOR = locator().withAndroidXpathStatic("//*[@class='android.widget.EditText'][1]").withIosAccesibilityId("1");
    public static final Target INPUT_ONE = Target.the("Escribir en input uno").located(theElementBy(INPUT_ONE_LOCATOR));
    public static final Locator INPUT_TWO_LOCATOR = locator().withAndroidXpathStatic("//*[@class='android.widget.EditText'][2]").withIosAccesibilityId("1");
    public static final Target INPUT_TWO = Target.the("Escribir en input dos").located(theElementBy(INPUT_TWO_LOCATOR));

    public static final Locator AUTOCOMPLETAR_NOMBRE_LOCATOR = locator().withAndroidXpathStatic("//android.view.View[@content-desc='Amaru']").withIosAccesibilityId("1");
    public static final Target AUTOCOMPLETAR_NOMBRE = Target.the("Seleccionar Amaru").located(theElementBy(AUTOCOMPLETAR_NOMBRE_LOCATOR));

    public static final Locator VALIDACION_CAMPO_LOCATOR = locator().withAndroidAccesibilityId("field is empty (Validator)").withIosAccesibilityId("1");
    public static final Target VALIDACION_CAMPO = Target.the("Validación de campo").located(theElementBy(VALIDACION_CAMPO_LOCATOR));

    public static final Locator BOTON_VALIDAR_LOCATOR = locator().withAndroidAccesibilityId("validar").withIosAccesibilityId("1");
    public static final Target BOTON_VALIDAR = Target.the("Botón validar").located(theElementBy(BOTON_VALIDAR_LOCATOR));
    public static final Locator BOTON_VALIDAR_DOS_LOCATOR = locator().withAndroidXpathStatic("(//android.widget.Button[@content-desc='validar'])[2]").withIosAccesibilityId("1");
    public static final Target BOTON_VALIDAR_DOS = Target.the("Botón validar").located(theElementBy(BOTON_VALIDAR_DOS_LOCATOR));

    public static final Locator CAMPO_NOMBRE_LOCATOR = locator().withAndroidXpathStatic("//*[@class='android.widget.EditText'][3]").withIosAccesibilityId("1");
    public static final Target CAMPO_NOMBRE = Target.the("Escribir nombre").located(theElementBy(CAMPO_NOMBRE_LOCATOR));
    public static final Locator CAMPO_CELULAR_LOCATOR = locator().withAndroidXpathStatic("//*[@class='android.widget.EditText'][4]").withIosAccesibilityId("1");
    public static final Target CAMPO_CELULAR = Target.the("Escribir celular").located(theElementBy(CAMPO_CELULAR_LOCATOR));
    public static final Locator CAMPO_CLAVE_LOCATOR = locator().withAndroidXpathStatic("(//android.widget.Button[@content-desc='validar'])[2]/preceding::android.widget.EditText[1]").withIosAccesibilityId("1");
    public static final Target CAMPO_CLAVE = Target.the("Escribir contraseña").located(theElementBy(CAMPO_CLAVE_LOCATOR));
    public static final Locator VER_OCULTAR_CLAVE_LOCATOR = locator().withAndroidXpathStatic("(//android.widget.Button[@content-desc='validar'])[2]/preceding::android.widget.Button[1]").withIosAccesibilityId("1");
    public static final Target VER_OCULTAR_CLAVE = Target.the("ocultar o mostrar contraseña").located(theElementBy(VER_OCULTAR_CLAVE_LOCATOR));

 public static final Locator MENSAJE_FORMULARIO_VALIDO_LOCATOR = locator().withAndroidAccesibilityId("Form is valid").withIosAccesibilityId("1");
    public static final Target MENSAJE_FORMULARIO_VALIDO = Target.the("ocultar o mostrar contraseña").located(theElementBy(MENSAJE_FORMULARIO_VALIDO_LOCATOR));



    private FormularioPage() {
        throw new IllegalStateException("user interface class");
    }

}
