package br.com.gsw.phonebook.domain.event;


/**
 * A interface <code>DomainEventListener</code> define o metodo de notificacao
 * de eventos de dominio. Pode haver uma ou mais implementacoes dessa interface
 * para tratar um determinado evento de dominio.
 *
 * @author Danilo Ambrosio
 * @version 1.0 31/08/2018
 */
public interface DomainEventListener {

	/**
	 * Notifica a implementacao interessada no evento de dominio sendo
	 * notificado.
	 *
	 * @param event O evento de dominio a ser tratado.
	 */
	void notify(final DomainEvent event);

}
