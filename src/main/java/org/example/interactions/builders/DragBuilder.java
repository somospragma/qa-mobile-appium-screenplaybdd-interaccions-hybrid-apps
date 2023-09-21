package org.example.interactions.builders;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.example.interactions.Drag;
import org.example.models.DragDirection;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DragBuilder {
    private Target target;

    public DragBuilder theElement(Target target){
        this.target=target;
        return this;
    }

    public Performable to(DragDirection direction) {
        return instrumented(Drag.class, target, direction);
    }

}
