package {{meta.package}}.domain.{{meta.domainLow}}.usecases;

import com.rcore.domain.commons.usecase.UseCase;
import com.rcore.domain.commons.usecase.model.SingletonEntityOutputValues;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import {{meta.package}}.domain.{{meta.domainLow}}.entity.{{meta.domainUp}}Entity;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}}Repository;

/**
 * Описание работы юзкейса
 */
@RequiredArgsConstructor
public class {{meta.domainUp}}UseCase extends UseCase<{{meta.domainUp}}UseCase.InputValues, SingletonEntityOutputValues<{{meta.domainUp}}Entity>> {

    private final {{meta.domainUp}}Repository {{meta.domainLow}}Repository;

    @Override
    public SingletonEntityOutputValues<{{meta.domainUp}}Entity> execute(InputValues inputValues) {

        {{meta.domainUp}}Entity {{meta.domainLow}}Entity;

        return SingletonEntityOutputValues.of({{meta.domainLow}}Entity);
    }

    @AllArgsConstructor(staticName = "of")
    @Getter
    public static class InputValues implements UseCase.InputValues {
    }

}
