package {{meta.package}}.domain.{{meta.domainLow}}.entity;

import com.rcore.domain.commons.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * {{entity.description}}
 */
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class {{meta.domainUp}}Entity extends BaseEntity {

    /************************************ Fields ************************************/

    {{#entity.fields}}
    /**
     * {{description}} 
     */
    {{accessModifier}} {{type}} {{name}};
    {{/entity.fields}}

    /************************************ Constructors ************************************/

    public {{meta.domainUp}}Entity(String id) {

        this.id = id;

    }

    /************************************ Methods ************************************/


}
