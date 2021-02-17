package {{meta.package}}.domain.{{meta.domainLow}}.usecases;

import com.rcore.domain.commons.usecase.AbstractFindByIdUseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.entity.{{meta.domainUp}}Entity;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}}Repository;

/**
 * Поиск сущности
 */
public class Find{{meta.domainUp}}ByIdUseCase extends AbstractFindByIdUseCase<String, {{meta.domainUp}}Entity, {{meta.domainUp}}Repository> {

    public Find{{meta.domainUp}}ByIdUseCase({{meta.domainUp}}Repository repository) {
        super(repository);
    }
}