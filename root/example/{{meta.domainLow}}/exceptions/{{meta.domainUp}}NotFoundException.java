package {{meta.package}}.domain.{{meta.domainLow}}.exceptions;

import com.rcore.domain.commons.exception.DomainException;

public class {{meta.domainUp}}NotFoundException extends DomainException {

    public {{meta.domainUp}}NotFoundException() {
        super("{{meta.domainUp}} not found");
    }

    public {{meta.domainUp}}NotFoundException(String id) {
        super("{{meta.domainUp}} not found by ID: " + id);
    }
}
