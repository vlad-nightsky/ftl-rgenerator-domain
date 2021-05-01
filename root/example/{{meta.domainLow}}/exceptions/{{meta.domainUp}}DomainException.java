package {{meta.package}}.domain.{{meta.domainLow}}.exceptions;

import com.rcore.domain.commons.exception.DomainException;

public class {{meta.domainUp}}DomainException extends DomainException {

    public {{meta.domainUp}}DomainException(String message) {
        super(message, "{{meta.error}}");
    }
}
