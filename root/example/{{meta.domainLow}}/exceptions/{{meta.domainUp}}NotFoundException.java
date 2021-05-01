package {{meta.package}}.domain.{{meta.domainLow}}.exceptions;

public class {{meta.domainUp}}NotFoundException extends {{meta.domainUp}}DomainException {

    public {{meta.domainUp}}NotFoundException() {
        super("{{meta.domainUp}} not found");
    }

    public {{meta.domainUp}}NotFoundException(String id) {
        super("{{meta.domainUp}} not found by ID: " + id);
    }
}
