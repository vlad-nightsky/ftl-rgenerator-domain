package {{meta.package}}.domain.{{meta.domainLow}}.entity;

import com.rcore.domain.commons.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * {{entity.description}}
 */
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class {{meta.domainUp}}Entity extends BaseEntity {

    /**
     * Идентификатор сущности
     */
    protected String id;
    
    {{#entity.fields}}
    /**
     * {{accessModifier}} 
     */
    {{accessModifier}} {{type}} {{name}};
    {{/entity.fields}}

    /************************************ Methods ************************************/


}
