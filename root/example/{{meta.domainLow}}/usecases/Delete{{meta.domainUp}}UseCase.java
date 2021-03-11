package {{meta.package}}.domain.{{meta.domainLow}}.usecases;

import com.rcore.domain.commons.usecase.AbstractDeleteUseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}}Repository;

/**
 * Удаление сущности
 */
public class Delete{{meta.domainUp}}UseCase extends AbstractDeleteUseCase<String, {{meta.domainUp}}Repository> {

    public Delete{{meta.domainUp}}UseCase({{meta.domainUp}}Repository repository) {
        super(repository);
    }
}
