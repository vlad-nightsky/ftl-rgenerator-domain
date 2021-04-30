package {{meta.package}}.domain.{{meta.domainLow}}.exceptions;

import java.util.List;

public class {{meta.domainUp}}ParamMissingException extends {{meta.domainUp}}DomainException {

    public {{meta.domainUp}}ParamMissingException() {
        super("It is not possible to create or update a {{meta.domainLow}}. Required parameters are missing");
    }

    public {{meta.domainUp}}ParamMissingException(List<String> badParams) {
        super("It is not possible to create or update a {{meta.domainLow}}. Required parameters are missing: " + badParams.toString());
    }
}
