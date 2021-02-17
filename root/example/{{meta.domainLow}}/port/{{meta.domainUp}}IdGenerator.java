package {{meta.package}}.domain.{{meta.domainLow}}.port;

import com.rcore.domain.commons.port.BaseIdGenerator;

//В разных бд или системах могут быть принято разное отношение к формату ID. А бизнес правил это не должно интересовать 
public interface {{meta.domainUp}}Generator<T> extends BaseIdGenerator<T> {
}
