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

        {{meta.domainUp}}Entity {{meta.domainLow}}Entity = new {{meta.domainUp}}Entity(idGenerator.generate());
       
        {{#entity.fields}}
        {{^innerClass}}
        {{meta.domainLow}}Entity.set{{nameUperCase}}(inputValues.{{name}});
        {{/innerClass}}
        {{/entity.fields}}
        {{#entity.innerClases}}

        {{meta.domainLow}}Entity.set{{name}}({{meta.domainUp}}Entity.{{name}}
                .builder()
                {{#fields}}
                .{{name}}(inputValues.{{var}}.{{name}})
                {{/fields}}
                .build()
        );
        {{/entity.innerClases}}

        {{meta.domainLow}}Entity = repository.save({{meta.domainLow}}Entity);

        return SingletonEntityOutputValues.of({{meta.domainLow}}Entity);
    }

    @AllArgsConstructor(staticName = "of")
    @NoArgsConstructor(staticName = "empty")
    @Builder
    @Data
    public static class InputValues implements UseCase.InputValues {
        {{#entity.fields}}
        /**
        * {{description}} 
        */
        {{accessModifier}} {{type}} {{name}};
        {{/entity.fields}}

        {{#entity.innerClases}}
        
        @AllArgsConstructor(staticName = "of")
        @NoArgsConstructor(staticName = "empty")
        @Builder
        @Data
        public static class {{name}}{
            {{#fields}}
            /**
            * {{description}} 
            */
            {{accessModifier}} {{type}} {{name}};
            {{/fields}}
        }
        {{/entity.innerClases}}
    }
}
