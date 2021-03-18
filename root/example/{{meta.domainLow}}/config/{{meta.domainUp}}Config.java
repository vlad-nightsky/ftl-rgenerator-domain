package {{meta.package}}.domain.{{meta.domainLow}}.config;

import lombok.Getter;
import lombok.experimental.Accessors;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}}IdGenerator;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}}Repository;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.Create{{meta.domainUp}}UseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.Delete{{meta.domainUp}}UseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.Find{{meta.domainUp}}ByIdUseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.usecases.Update{{meta.domainUp}}UseCase;

@Accessors(fluent = true)
@Getter
public class {{meta.domainUp}}Config {
    private final Create{{meta.domainUp}}UseCase create{{meta.domainUp}}UseCase;
    private final Delete{{meta.domainUp}}UseCase delete{{meta.domainUp}}UseCase;
    private final Find{{meta.domainUp}}ByIdUseCase find{{meta.domainUp}}ByIdUseCase;
    private final Update{{meta.domainUp}}UseCase update{{meta.domainUp}}UseCase;

    public {{meta.domainUp}}Config({{meta.domainUp}}Repository {{meta.domainLow}}Repository, {{meta.domainUp}}IdGenerator<?> {{meta.domainLow}}IdGenerator) {
        this.create{{meta.domainUp}}UseCase = new Create{{meta.domainUp}}UseCase({{meta.domainLow}}Repository, {{meta.domainLow}}IdGenerator);
        this.delete{{meta.domainUp}}UseCase = new Delete{{meta.domainUp}}UseCase({{meta.domainLow}}Repository);
        this.find{{meta.domainUp}}ByIdUseCase = new Find{{meta.domainUp}}ByIdUseCase({{meta.domainLow}}Repository);
        this.update{{meta.domainUp}}UseCase = new Update{{meta.domainUp}}UseCase({{meta.domainLow}}Repository);
    }
}
