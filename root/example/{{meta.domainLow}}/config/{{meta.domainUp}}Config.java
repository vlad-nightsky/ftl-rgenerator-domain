package {{meta.package}}.domain.{{meta.domainLow}}.config;

import lombok.AllArgsConstructor;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}IdGenerator;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}Repository;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.Create{{meta.domainUp}UseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.Delete{{meta.domainUp}UseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.Find{{meta.domainUp}ByIdUseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.Update{{meta.domainUp}UseCase;

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
