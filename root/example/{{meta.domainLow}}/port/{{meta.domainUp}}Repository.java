package {{meta.package}}.domain.{{meta.domainLow}}.port;

import com.rcore.domain.commons.port.CRUDRepository;
import {{meta.package}}.domain.{{meta.domainLow}}.entity.OrderEntity;
import {{meta.package}}.domain.{{meta.domainLow}}.port.filters.OrderFilters;

public interface {{meta.domainUp}}Repository extends CRUDRepository<String, {{meta.domainUp}}Entity, {{meta.domainUp}}Filters> {
}
