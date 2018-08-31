package br.com.gsw.phonebook.domain.event;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A classe <code>DomainEventsNotifier</code> contem os tipo de eventos de
 * dominio e seus respectivos <i>ouvintes</i>, e e responsavel por notifica-los
 * quando um evento de dominio acontece.
 *
 * @author Danilo Ambrosio
 * @version 1.0 31/08/2018
 */
@Component
public class DomainEventsNotifier {

    /**
     * O mapa que contem os tipos de eventos de dominio e seus respectivos
     * ouvintes
     */
    private final Map<DomainEventType, List<DomainEventListener>> listeners;

    public DomainEventsNotifier(final Map<DomainEventType, List<DomainEventListener>> listeners) {
        super();
        this.listeners = new HashMap<>(listeners.size());
        this.listeners.putAll(listeners);
    }
    
    public void notifyListeners(final DomainEvent... events) {

        if (events == null) {
            return;
        }

        for(final DomainEvent event : events) {

            final List<DomainEventListener> domainEventListeners = listeners.get(event.getType());

            if (!CollectionUtils.isEmpty(domainEventListeners)) {
                for (final DomainEventListener listener : domainEventListeners) {
                    listener.notify(event);
                }
            }
        }
    }
}