package ru.foodtechlab.es.{{meta.nameLowCase}}.service.core.domain.{{meta.nameLowCase}}.entity;

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
public class {{meta.nameLowCase}}Entity extends BaseEntity {

    /**
     * Идентификатор 
     */
    protected String id;

    /************************************ Methods ************************************/


}
