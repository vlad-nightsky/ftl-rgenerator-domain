package {{meta.package}}.domain.{{meta.domainLow}}.port;

import com.rcore.domain.commons.port.CRUDRepository;
import {{meta.package}}.domain.{{meta.domainLow}}.entity.{{meta.domainUp}}Entity;
import {{meta.package}}.domain.{{meta.domainLow}}.port.filters.{{meta.domainUp}}Filters;

public interface {{meta.domainUp}}Repository extends CRUDRepository<String, {{meta.domainUp}}Entity, {{meta.domainUp}}Filters> {
}
