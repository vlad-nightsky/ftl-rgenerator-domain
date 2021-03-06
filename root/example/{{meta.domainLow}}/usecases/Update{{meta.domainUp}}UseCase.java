package {{meta.package}}.domain.{{meta.domainLow}}.usecases;

import com.rcore.domain.commons.usecase.UseCase;
import com.rcore.domain.commons.usecase.model.SingletonEntityOutputValues;
import lombok.*;
import {{meta.package}}.domain.{{meta.domainLow}}.entity.{{meta.domainUp}}Entity;
import {{meta.package}}.domain.{{meta.domainLow}}.exceptions.{{meta.domainUp}}NotFoundException;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}}Repository;

import javax.validation.constraints.NotBlank;

/**
 * Обновление сущности
 */
@RequiredArgsConstructor
public class Update{{meta.domainUp}}UseCase extends UseCase<Update{{meta.domainUp}}UseCase.InputValues, SingletonEntityOutputValues<{{meta.domainUp}}Entity>> {

    private final {{meta.domainUp}}Repository {{meta.domainLow}}Repository;

    @Override
    public SingletonEntityOutputValues<{{meta.domainUp}}Entity> execute(InputValues inputValues) {
        {{meta.domainUp}}Entity {{meta.domainLow}}Entity = {{meta.domainLow}}Repository.findById(inputValues.getId())
                .orElseThrow({{meta.domainUp}}NotFoundException::new);

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
        
        {{meta.domainLow}}Entity = {{meta.domainLow}}Repository.save({{meta.domainLow}}Entity);

        return SingletonEntityOutputValues.of({{meta.domainLow}}Entity);
    }

    @AllArgsConstructor(staticName = "of")
    @NoArgsConstructor(staticName = "empty")
    @Getter
    @Builder
    public static class InputValues implements UseCase.InputValues {
        @NotBlank
        protected String id;
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
