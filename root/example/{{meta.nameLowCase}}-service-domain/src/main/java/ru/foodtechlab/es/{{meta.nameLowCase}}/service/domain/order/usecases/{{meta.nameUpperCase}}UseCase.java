package ru.foodtechlab.es.{{meta.nameLowCase}}.service.domain.{{meta.nameLowCase}}.usecases;

import com.rcore.domain.commons.usecase.UseCase;
import com.rcore.domain.commons.usecase.model.SingletonEntityOutputValues;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.foodtechlab.es.{{meta.nameLowCase}}.service.domain.{{meta.nameLowCase}}.entity.{{meta.nameUpperCase}}Entity;
import ru.foodtechlab.es.{{meta.nameLowCase}}.service.domain.{{meta.nameLowCase}}.port.{{meta.nameUpperCase}}Repository;

/**
 * Осание работы курьера
 */
@RequiredArgsConstructor
public class {{meta.nameUpperCase}}UseCase extends UseCase<{{meta.nameUpperCase}}UseCase.InputValues, SingletonEntityOutputValues<{{meta.nameUpperCase}}Entity>> {

    private final {{meta.nameUpperCase}}Repository {{meta.nameLowCase}}Repository;

    @Override
    public SingletonEntityOutputValues<{{meta.nameUpperCase}}Entity> execute(InputValues inputValues) {

        {{meta.nameUpperCase}}Entity {{meta.nameLowCase}}Entity;

        return SingletonEntityOutputValues.of({{meta.nameLowCase}}Entity);
    }

    @AllArgsConstructor(staticName = "of")
    @Getter
    public static class InputValues implements UseCase.InputValues {
    }

}
