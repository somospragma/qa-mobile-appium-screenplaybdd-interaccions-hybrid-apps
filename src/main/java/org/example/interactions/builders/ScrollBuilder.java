package org.example.interactions.builders;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.example.interactions.Scroll;
import org.example.models.ScrollDirection;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollBuilder {

    private Target target;
    private ScrollDirection direction;

    public ScrollBuilder untilVisibleTarget(Target target) {
        this.target=target;
        return this;
    }

    public ScrollBuilder direction(ScrollDirection direction){
        this.direction = direction;
        return this;
    }

    public Performable untilMaxAttempts(int attempts){
        return  instrumented (Scroll.class, target, direction, attempts);
    }

}
