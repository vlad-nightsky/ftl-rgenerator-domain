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
 * Сущность 
 */
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class {{meta.domainUp}}Entity extends BaseEntity {

    {{#fields}}
    /**
     * {{accessModifier}} 
     */
    {{accessModifier}} {{type}} {{name}};
    {{/fields}}

    /************************************ Methods ************************************/


}
