package org.example.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.touch.offset.PointOption.point;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Swipe implements Interaction {
    private int initialX;
    private int finalX;
    private int initialY;
    private int finalY;
    private Target target;

    public Swipe(int initialX, int finalX, int initialY, int finalY) {
        this.initialX = initialX;
        this.finalX = finalX;
        this.initialY = initialY;
        this.finalY = finalY;
    }

    public Swipe(Target target) {
        this.target = target;
    }

    public static Swipe verticalTo(int x, int initialY, int finalY) {
        return Tasks.instrumented(Swipe.class, x, x, initialY, finalY);
    }

    public static Swipe verticalTo(Target target) {
        return Tasks.instrumented(Swipe.class, target);
    }

    public static Swipe horizontalTo(int initialX, int finalX, int y) {
        return Tasks.instrumented(Swipe.class, initialX, finalX, y, y);
    }

    public static Swipe horizontalTo(Target target) {
        return Tasks.instrumented(Swipe.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver<?> driver = getProxiedDriver();
        TouchAction<?> touchAction = new TouchAction<>(driver);
        if (target != null) {
            initialX = target.resolveFor(actor).getLocation().getX();
            initialY = target.resolveFor(actor).getLocation().getY();
            finalX = target.resolveFor(actor).getLocation().getX();
            finalY = target.resolveFor(actor).getLocation().getY();
        }
        touchAction.press(point(initialX, initialY))
                .moveTo(point(finalX, finalY))
                .release().perform();
    }
}
