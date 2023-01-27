package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class principalPage {

    public static final Locator CARD_BUTTONS_DEMO_LOCATOR = locator().withAndroidAccesibilityId("Buttons Demo").withIosAccesibilityId("1");
    public static final Target CARD_BUTTONS_DEMO = Target.the("Seleccionar demo botones").located(theElementBy(CARD_BUTTONS_DEMO_LOCATOR));

    public static final Locator TITULO_BUTTONS_DEMO_LOCATOR = locator().withAndroidAccesibilityId("Show Case Material ").withIosAccesibilityId("1");
    public static final Target TITULO_BUTTONS_DEMO = Target.the("Titulo demo botones").located(theElementBy(TITULO_BUTTONS_DEMO_LOCATOR));
    public static final Locator TITULO_2_BUTTONS_DEMO_LOCATOR = locator().withAndroidAccesibilityId("Show Case Material ").withIosAccesibilityId("1");
    public static final Target TITULO_2_BUTTONS_DEMO = Target.the("Titulo demo botones").located(theElementBy(TITULO_2_BUTTONS_DEMO_LOCATOR));

    //contador
    public static final Locator CARD_CONTADOR_LOCATOR = locator().withAndroidAccesibilityId("App Contador").withIosAccesibilityId("1");
    public static final Target CARD_CONTADOR = Target.the("contador").located(theElementBy(CARD_CONTADOR_LOCATOR));
    public static final Locator BOTON_CONTADOR_LOCATOR = locator().withAndroidXpathStatic("//*[@class='android.widget.Button'][2]").withIosAccesibilityId("1");
    public static final Target BOTON_CONTADOR = Target.the("contador").located(theElementBy(BOTON_CONTADOR_LOCATOR));

    public static final Locator VALOR_CONTADOR_LOCATOR = locator().withAndroidXpathStatic("//android.view.View[@content-desc='1']").withIosAccesibilityId("1");
    public static final Target VALOR_CONTADOR = Target.the("valor en pantalla").located(theElementBy(VALOR_CONTADOR_LOCATOR));

    public static final Locator BOTON_ATRAS_LOCATOR = locator().withAndroidXpathStatic("//*[@class='android.view.View'][1]/android.widget.Button").withIosAccesibilityId("1");
    public static final Target BOTON_ATRAS = Target.the("contador").located(theElementBy(BOTON_ATRAS_LOCATOR));

    // ALERTAS
    public static final Locator CARD_DIALOGS_DEMO_LOCATOR = locator().withAndroidAccesibilityId("Dialogs Demo").withIosAccesibilityId("1");
    public static final Target CARD_DIALOGS_DEMO = Target.the("Seleccionar  dialogs demo botones").located(theElementBy(CARD_DIALOGS_DEMO_LOCATOR));

    public static final Locator BOTON_SHOW_ALERT_LOCATOR = locator().withAndroidAccesibilityId("Show AlertDialog Widget").withIosAccesibilityId("1");
    public static final Target BOTON_SHOW_ALERT = Target.the("Abrir alerta").located(theElementBy(BOTON_SHOW_ALERT_LOCATOR));

    public static final Locator TXT_ALERT_LOCATOR = locator().withAndroidAccesibilityId("This is a short description for the popup alert").withIosAccesibilityId("1");
    public static final Target TXT_ALERT = Target.the("Mensaje en la alerta").located(theElementBy(TXT_ALERT_LOCATOR));

    public static final Locator BOTON_OK_LOCATOR = locator().withAndroidAccesibilityId("OK").withIosAccesibilityId("1");
    public static final Target BOTON_OK = Target.the("Cierra alerta con ok").located(theElementBy(BOTON_OK_LOCATOR));

    //cards
    public static final Locator BOTON_CARDS_DEMO_LOCATOR = locator().withAndroidAccesibilityId("Cards Demo").withIosAccesibilityId("1");
    public static final Target BOTON_CARDS_DEMO = Target.the("Abrir card demo").located(theElementBy(BOTON_CARDS_DEMO_LOCATOR));


    //datePicker
    public static final Locator CARD_DATEPICKER_LOCATOR = locator().withAndroidAccesibilityId("DatePicker screeen").withIosAccesibilityId("1");
    public static final Target CARD_DATEPICKER = Target.the("Seleccionar  dialogs demo botones").located(theElementBy(CARD_DATEPICKER_LOCATOR));


    public static final Locator INPUT_FECHA_LOCATOR = locator().withAndroidXpathStatic("//android.view.View[@content-desc='Date Picker']/following::android.view.View[1]").withIosAccesibilityId("1");
    public static final Target INPUT_FECHA = Target.the("Selector de fecha").located(theElementBy(INPUT_FECHA_LOCATOR));

    public static final Locator BTN_EDITAR_FECHA_LOCATOR = locator().withAndroidXpathStatic("//android.widget.Button[@content-desc='Select year']/preceding::android.widget.Button").withIosAccesibilityId("1");
    public static final Target BTN_EDITAR_FECHA = Target.the("Editar de fecha").located(theElementBy(BTN_EDITAR_FECHA_LOCATOR));

    public static final Locator INPUT_EDITAR_FECHA_LOCATOR = locator().withAndroidXpathStatic("//android.widget.Button[@content-desc='CANCEL']/preceding::android.widget.EditText").withIosAccesibilityId("1");
    public static final Target INPUT_EDITAR_FECHA = Target.the("Selector de fecha").located(theElementBy(INPUT_EDITAR_FECHA_LOCATOR));


    public static final Locator BTN_OK_FECHA_LOCATOR = locator().withAndroidAccesibilityId("OK").withIosAccesibilityId("1");
    public static final Target BTN_OK_FECHA = Target.the("ok de fecha").located(theElementBy(BTN_OK_FECHA_LOCATOR));

    public static final Locator BTN_VERSION_LOCATOR = locator().withAndroidAccesibilityId("v2").withIosAccesibilityId("1");
    public static final Target BTN_VERSION = Target.the("Cambiar version de la vista").located(theElementBy(BTN_VERSION_LOCATOR));

    //#################
    public static final Locator CARD_SWITCH_LOCATOR = locator().withAndroidAccesibilityId("Switch screeen").withIosAccesibilityId("1");
    public static final Target CARD_SWITCH = Target.the("Seleccionar demo botones").located(theElementBy(CARD_SWITCH_LOCATOR));



    public static final Locator SWITCH_LOCATOR = locator().withAndroidXpathStatic("//android.view.View[@content-desc='Switch'][2]/following::android.widget.Switch[1]").withIosAccesibilityId("1");
    public static final Target SWITCH = Target.the("presionar switch").located(theElementBy(SWITCH_LOCATOR));

    public static final Locator SWITCH_TILE_LOCATOR = locator().withAndroidXpathStatic("//android.view.View[@content-desc='Switch'][2]/following::android.widget.Switch[2]").withIosAccesibilityId("1");
    public static final Target SWITCH_TILE = Target.the("presionar switch tile").located(theElementBy(SWITCH_TILE_LOCATOR));

    public static final Locator TXT_SWITCH_TILE_LOCATOR = locator().withAndroidXpathStatic("//android.widget.Switch[@content-desc='Habilitar Switch']/following::android.view.View").withIosAccesibilityId("1");
    public static final Target TXT_SWITCH_TILE = Target.the("Texto al activar switch").located(theElementBy(TXT_SWITCH_TILE_LOCATOR));

    //################drop down list
    public static final Locator CARD_DROPDOWN_LOCATOR = locator().withAndroidAccesibilityId("Dropdown Button").withIosAccesibilityId("1");
    public static final Target CARD_DROPDOWN = Target.the("Card dropDown list").located(theElementBy(CARD_DROPDOWN_LOCATOR));

    public static final Locator ELEMENT_ONE_LIST_LOCATOR = locator().withAndroidAccesibilityId("Element One").withIosAccesibilityId("1");
    public static final Target ELEMENT_ONE_LIST = Target.the("Desplegar lista").located(theElementBy(ELEMENT_ONE_LIST_LOCATOR));
    public static final Locator ELEMENT_THREE_LIST_LOCATOR = locator().withAndroidAccesibilityId("Element Three").withIosAccesibilityId("1");
    public static final Target ELEMENT_THREE_LIST = Target.the("Seleccionar elemento tres de la lista").located(theElementBy(ELEMENT_THREE_LIST_LOCATOR));
    //################# inputs


    //################NAvigation bar
    public static final Locator CARD_NAVIGATION_BAR_LOCATOR = locator().withAndroidAccesibilityId("Navigation Bar Screen").withIosAccesibilityId("1");
    public static final Target CARD_NAVIGATION_BAR = Target.the("Seleccionar demo botones").located(theElementBy(CARD_NAVIGATION_BAR_LOCATOR));
    public static final Locator TAB_BUSINESS_LOCATOR = locator().withAndroidAccesibilityId("Business\n" +
            "Tab 2 of 3").withIosAccesibilityId("1");
    public static final Target TAB_BUSINESS = Target.the("Seleccionar tab business").located(theElementBy(TAB_BUSINESS_LOCATOR));
    public static final Locator TAB_SCHOOL_LOCATOR = locator().withAndroidAccesibilityId("School\n" +
           "Tab 3 of 3").withIosAccesibilityId("1");
    public static final Target TAB_SCHOOL = Target.the("Seleccionar tab School").located(theElementBy(TAB_SCHOOL_LOCATOR));
    public static final Locator TXT_SCHOOL_LOCATOR = locator().withAndroidAccesibilityId(" School").withIosAccesibilityId("1");
    public static final Target TXT_SCHOOL = Target.the("Seleccionar tab School").located(theElementBy(TXT_SCHOOL_LOCATOR));

    //#############################CArousel



    private principalPage() {
        throw new IllegalStateException("user interface class");
    }
}
