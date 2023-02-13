package org.example.interactions.builders;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.example.interactions.Scroll;
import org.example.models.Direction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollBuilder {

    private Target target;
    private Direction direction;

    public ScrollBuilder untilVisibleTarget(Target target) {
        this.target=target;
        return this;
    }

    public ScrollBuilder direction(Direction direction){
        this.direction = direction;
        return this;
    }

    public Performable untilMaxAttempts(int attempts){
        return  instrumented (Scroll.class, target, direction, attempts);
    }

}
