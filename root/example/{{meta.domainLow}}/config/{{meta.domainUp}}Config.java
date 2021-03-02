package {{meta.package}}.domain.{{meta.domainLow}}.config;

import lombok.AllArgsConstructor;
import {{meta.package}}.domain.{{meta.domainLow}}.port.CustomerIdGenerator;
import {{meta.package}}.domain.{{meta.domainLow}}.port.CustomerRepository;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.CreateCustomerUseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.DeleteCustomerUseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.FindCustomerByIdUseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.UpdateCustomerUseCase;

@AllArgsConstructor
public class {{meta.domainUp}}Config {
    private final {{meta.domainUp}}Repository {{meta.domainLow}}Repository;
    private final {{meta.domainUp}}IdGenerator {{meta.domainLow}}IdGenerator;

    public Create{{meta.domainUp}}UseCase create{{meta.domainUp}}UseCase() {
        return new Create{{meta.domainUp}}UseCase({{meta.domainLow}}Repository, {{meta.domainLow}}IdGenerator);
    }

    public Find{{meta.domainUp}}ByIdUseCase find{{meta.domainUp}}ByIdUseCase() {
        return new Find{{meta.domainUp}}ByIdUseCase({{meta.domainLow}}Repository);
    }

    public Delete{{meta.domainUp}}UseCase find{{meta.domainUp}}UseCase() {
        return new Delete{{meta.domainUp}}UseCase({{meta.domainLow}}Repository);
    }

    public Update{{meta.domainUp}}UseCase update{{meta.domainUp}}UseCase() {
        return new Update{{meta.domainUp}}UseCase({{meta.domainLow}}Repository);
    }

    public {{meta.domainUp}}UseCase {{meta.domainLow}}UseCase() {
        return new {{meta.domainUp}}UseCase({{meta.domainLow}}Repository);
    }
}
