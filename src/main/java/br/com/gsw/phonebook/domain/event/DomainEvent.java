package br.com.gsw.phonebook.domain.event;

import java.util.EventObject;

/**
 * A classe {@link DomainEvent} representa eventos lancados por classes de
 * dominio, que desejam notificar classes interessadas sobre a mudanca em seu
 * estado. Um {@link DomainEvent} pode conter diversos eventos encadeados, caso
 * uma operacao resulte e mais de um evento lancado.
 *
 * @author Danilo Ambrosio
 * @version 1.0 31/08/2018
 */
public abstract class DomainEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	public abstract DomainEventType getType();

    public DomainEvent(final Object source) {
        super(source);
    }
}