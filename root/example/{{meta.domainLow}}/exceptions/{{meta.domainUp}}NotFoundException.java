package {{meta.package}}.domain.{{meta.domainLow}}.exceptions;

import com.rcore.domain.commons.exception.NotFoundDomainException;

public class {{meta.domainUp}}NotFoundException extends NotFoundDomainException {

    public {{meta.domainUp}}NotFoundException() {
        super(
                Domain.{{meta.domainCaps}.name(),
                {{meta.domainUp}ErrorReason.NOT_FOUND.name(),
                "{{meta.domainUp}} not found"
        );
    }

    public {{meta.domainUp}}NotFoundException(String id) {
        super(
                Domain.{{meta.domainCaps}.name(),
                {{meta.domainUp}ErrorReason.NOT_FOUND.name(),
                "{{meta.domainUp}} not found by ID: " + id
        );
    }
}
