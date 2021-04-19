package {{meta.package}}.domain.{{meta.domainLow}}.usecases;

import com.rcore.domain.commons.usecase.AbstractCreateUseCase;
import com.rcore.domain.commons.usecase.UseCase;
import com.rcore.domain.commons.usecase.model.SingletonEntityOutputValues;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import {{meta.package}}.domain.{{meta.domainLow}}.entity.*;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}}IdGenerator;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}}Repository;

/**
 * Создание сущности
 */
public class Create{{meta.domainUp}}UseCase extends AbstractCreateUseCase<{{meta.domainUp}}Entity, {{meta.domainUp}}IdGenerator<?>, {{meta.domainUp}}Repository, Create{{meta.domainUp}}UseCase.InputValues> {


    public Create{{meta.domainUp}}UseCase({{meta.domainUp}}Repository repository, {{meta.domainUp}}IdGenerator idGenerator) {
        super(repository, idGenerator);
    }

    @Override
    public SingletonEntityOutputValues<{{meta.domainUp}}Entity> execute(InputValues inputValues) {

        validate(inputValues);

        {{meta.domainUp}}Entity {{meta.domainLow}}Entity = new {{meta.domainUp}}Entity(idGenerator.generate());
       
        // Происходит заполнение всех полей 
        {{#entity.fields}}
        {{meta.domainLow}}Entity.set{{nameUperCase}}(inputValues.{{name}});
        {{/entity.fields}}

        {{meta.domainLow}}Entity = repository.save({{meta.domainLow}}Entity);

        return SingletonEntityOutputValues.of({{meta.domainLow}}Entity);
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    public static class InputValues implements UseCase.InputValues {
        // перечисление полей необходимых для создания сущности
        {{#entity.fields}}
        {{accessModifier}} {{type}} {{name}};
        {{/entity.fields}}

    }

    /**
     * Валидация входящий данных
     * @param inputValues входные данные
     */
    private void validate(InputValues inputValues) {

    }

}
