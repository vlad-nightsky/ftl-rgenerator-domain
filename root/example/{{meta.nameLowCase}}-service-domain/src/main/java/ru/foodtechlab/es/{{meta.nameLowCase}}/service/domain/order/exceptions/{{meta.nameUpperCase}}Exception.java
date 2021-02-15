package ru.foodtechlab.es.order.service.core.domain.order.exceptions;

import com.rcore.domain.commons.exception.DomainException;

public class {{meta.nameUpperCase}}Exception extends DomainException {

    public {{meta.nameUpperCase}}Exception() {
        super("Exception");
    }

    public {{meta.nameUpperCase}}Exception(String id) {
        super("Exception by ID: " + id);
    }
}
