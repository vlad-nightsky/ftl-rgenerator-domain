package {{meta.package}}.domain.{{meta.domainLow}}.port.filters;

import com.rcore.domain.commons.port.dto.SearchFilters;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class {{meta.domainUp}}Filters extends SearchFilters {
   
}
