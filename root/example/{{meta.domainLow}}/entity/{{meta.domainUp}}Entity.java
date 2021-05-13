package {{meta.package}}.domain.{{meta.domainLow}}.entity;

import com.rcore.domain.commons.entity.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * {{entity.description}}
 */
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class {{meta.domainUp}}Entity extends BaseEntity<String> {


    {{#entity.fields}}
    /**
     * {{description}} 
     */
    {{accessModifier}} {{type}} {{name}};
    {{/entity.fields}}


    public {{meta.domainUp}}Entity(String id) {
        this.id = id;
    }

    {{#entity.innerClases}}
    @Builder
    @Getter
    @Setter
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
