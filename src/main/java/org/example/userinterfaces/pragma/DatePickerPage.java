package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class DatePickerPage {
    public static final Locator SELECCIONAR_ANIO_LOCATOR = locator().withAndroidAccesibilityId("Select year").withIosAccesibilityId("1");
    public static final Locator BUSCAR_ANIO_LOCATOR = locator().withAndroidAccesibilityId("2000").withIosAccesibilityId("1");
    public static final Locator BUSCAR_MES_LOCATOR = locator().withAndroidAccesibilityId("Select year").withIosAccesibilityId("1");
  //  public static final Locator SELECCIONAR_DIA_LOCATOR = locator().withAndroidAccesibilityId("10, Saturday, October 10, 1992").withIosAccesibilityId("1");
    public static final Locator SELECCIONAR_DIA_LOCATOR = locator().withAndroidAccesibilityId("Start date 17, Tuesday, January 17, 2023").withIosAccesibilityId("1");
    public static final Locator SCROLL_LOCATOR = locator().withAndroidXpathStatic("//android.widget.Button[@content-desc='CANCEL']/preceding::android.view.View[1]").withIosAccesibilityId("1");
    public static final Locator ANIO_ACTUAL_LOCATOR = locator().withAndroidAccesibilityId("2022").withIosAccesibilityId("1");
    public static final Target SELECCIONAR_ANIO = Target.the("Seleccionar año").located(theElementBy(SELECCIONAR_ANIO_LOCATOR));
    public static final Target BUSCAR_ANIO = Target.the("Seleccionar año 1992").located(theElementBy(BUSCAR_ANIO_LOCATOR));
    public static final Target BUSCAR_MES = Target.the("Buscar mes de Octubre").located(theElementBy(BUSCAR_MES_LOCATOR));
    public static final Target SELECCIONAR_DIA = Target.the("Buscar 10 de octubre").located(theElementBy(SELECCIONAR_DIA_LOCATOR));
    public static final Target SCROLL = Target.the("Buscar 10 de octubre").located(theElementBy(SCROLL_LOCATOR));
    public static final Target ANIO_ACTUAL = Target.the("aÑO 2022").located(theElementBy(ANIO_ACTUAL_LOCATOR));


    private DatePickerPage() {
        throw new IllegalStateException("user interface class");
    }
}
