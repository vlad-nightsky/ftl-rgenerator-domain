package ru.foodtechlab.es.{{meta.nameLowCase}}.service.domain.{{meta.nameLowCase}}.events.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.foodtechlab.es.{{meta.nameLowCase}}.service.domain.{{meta.nameLowCase}}.entity.{{meta.nameUpperCase}}Entity;
import ru.foodtechlab.fdelivery.core.domain.commons.events.AbstractEvent;

/**
 * Событие успешного создания заказа
 */
@AllArgsConstructor(staticName = "of")
@Getter
public class {{meta.nameUpperCase}}Event extends AbstractEvent {
    private {{meta.nameUpperCase}}Entity {{meta.nameLowCase}};
}
