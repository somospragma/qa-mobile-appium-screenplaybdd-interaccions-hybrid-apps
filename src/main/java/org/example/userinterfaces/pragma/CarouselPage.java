package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class CarouselPage {

    public static final Target CARD_CAROUSEL = Target.the("Seleccionar card carousel").located(AppiumBy.accessibilityId("PageView Carousel"));

    public static final Target IMG_CAROUSEL_DOS = Target.the("Seleccionar card dos carousel").located(AppiumBy.xpath("//android.widget.Button[@content-desc='v3']/preceding-sibling::android.view.View[4]"));

    public static final Target IMG_CAROUSEL_TRES = Target.the("Seleccionar card tres carousel").located(AppiumBy.xpath("//android.widget.Button[@content-desc='v3']/preceding-sibling::android.view.View[3]"));

    public static final Target IMG = Target.the("Seleccionar imagen carousel").located(AppiumBy.xpath("//*[@class='android.widget.ImageView'][1]"));

    public static final Target IMG_DOS = Target.the("Seleccionar imagen 2 carousel").located(AppiumBy.xpath("//*[@class='android.widget.ImageView'][2]"));


    private CarouselPage() {
        throw new IllegalStateException("user interface class");
    }
}
