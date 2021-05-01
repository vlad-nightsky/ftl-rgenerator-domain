package {{meta.package}}.domain.{{meta.domainLow}}.usecases;

import com.rcore.domain.commons.usecase.AbstractFindWithFiltersUseCase;
import {{meta.package}}.domain.{{meta.domainLow}}.entity.{{meta.domainUp}}Entity;
import {{meta.package}}.domain.{{meta.domainLow}}.port.{{meta.domainUp}}Repository;
import {{meta.package}}.domain.{{meta.domainLow}}.port.filters.{{meta.domainUp}}Filters;


/**
 * Поиск по коллекции
 */
public class Find{{meta.domainUp}}sUseCase extends AbstractFindWithFiltersUseCase<{{meta.domainUp}}Entity, {{meta.domainUp}}Filters, {{meta.domainUp}}Repository> {
    public Find{{meta.domainUp}}sUseCase({{meta.domainUp}}Repository repository) {
        super(repository);
    }
}
