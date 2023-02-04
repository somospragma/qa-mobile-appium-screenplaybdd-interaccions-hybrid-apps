package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class CarouselPage {

    public static final Locator CARD_CAROUSEL_LOCATOR = locator().withAndroidAccesibilityId("PageView Carousel").withIosAccesibilityId("1");
    public static final Target CARD_CAROUSEL = Target.the("Seleccionar card carousel").located(theElementBy(CARD_CAROUSEL_LOCATOR));
    public static final Locator IMG_CAROUSEL_DOS_LOCATOR = locator().withAndroidXpathStatic("//android.widget.Button[@content-desc='v3']/preceding-sibling::android.view.View[4]").withIosAccesibilityId("1");
    public static final Target IMG_CAROUSEL_DOS = Target.the("Seleccionar card dos carousel").located(theElementBy(IMG_CAROUSEL_DOS_LOCATOR));
    public static final Locator IMG_CAROUSEL_TRES_LOCATOR = locator().withAndroidXpathStatic("//android.widget.Button[@content-desc='v3']/preceding-sibling::android.view.View[3]").withIosAccesibilityId("1");
    public static final Target IMG_CAROUSEL_TRES = Target.the("Seleccionar card tres carousel").located(theElementBy(IMG_CAROUSEL_TRES_LOCATOR));
      public static final Locator IMG_LOCATOR = locator().withAndroidXpathStatic("//*[@class='android.widget.ImageView'][1]").withIosAccesibilityId("1");
    public static final Target IMG = Target.the("Seleccionar card carousel").located(theElementBy(IMG_LOCATOR));

   public static final Locator IMG_DOS_LOCATOR = locator().withAndroidXpathStatic("//*[@class='android.widget.ImageView'][2]").withIosAccesibilityId("1");
    public static final Target IMG_DOS = Target.the("Seleccionar card carousel").located(theElementBy(IMG_DOS_LOCATOR));


    private CarouselPage() {
        throw new IllegalStateException("user interface class");
    }
}
