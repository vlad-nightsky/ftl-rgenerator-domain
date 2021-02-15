package {{meta.project}}.domain.{{meta.domain}}.usecases;

import com.rcore.domain.commons.usecase.UseCase;
import com.rcore.domain.commons.usecase.model.SingletonEntityOutputValues;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import {{meta.project}}.domain.{{meta.domain}}.entity.{{values.output}};

/**
 * Завершение доставки заказа
 */
@RequiredArgsConstructor
public class {{values.useCaseTitle}} extends UseCase<{{values.useCaseTitle}}.InputValues, SingletonEntityOutputValues<{{values.output}}>> {

    @Override
    public SingletonEntityOutputValues<{{values.output}}> execute(InputValues inputValues) {
        {{values.output}} {{values.outputVar}};

        return SingletonEntityOutputValues.of({{values.outputVar}});
    }

    @AllArgsConstructor(staticName = "of")
    @Getter
    public static class InputValues implements UseCase.InputValues {
    }

}
