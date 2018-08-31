package br.com.gsw.phonebook.config;

import br.com.gsw.phonebook.domain.event.DomainEventListener;
import br.com.gsw.phonebook.domain.event.DomainEventType;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Classe responsavel por configurar os listeners com os eventos escutados.
 *
 * @author Danilo Ambrosio
 * @version 1.0 31/08/2018
 */
@Component
public class DomainEventConfig {

    @Bean
    public Map<DomainEventType, List<DomainEventListener>> listeners() {
        final Map<DomainEventType, List<DomainEventListener>> map = new EnumMap<>(DomainEventType.class);

        //TODO: Here you need to relate Domain Events to its Listeners.

        return map;
    }
}
