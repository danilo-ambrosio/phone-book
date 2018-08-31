# phone-book

VISÃO GERAL

O domínio dessa aplicação, que simula basicamente um cadastro de contatos de telefone, possui apenas 2 aggregates (Contact e Country) e deve suportar as seguintes operações: criação de contatos, edição de contatos, consulta de contatos e consulta de países;

DESCRIÇÃO DE FUNCIONALIDADES

Ao cadastrar um contato, o usuário deve informar nome e telefone do contato, contendo o código que identifica o país como prefixo do número telefonico. Uma vez cadastrado, um evento de domínio deve ser propagado para que o contato seja associado ao país (Country) relacionado ao código que consta no número telefonico.

Quando o usuário for editado, se o código de país do telefone for alterado, outro evento de domínio deve ser propagado para que seja associado ao país relacionado o número de telefone alterado.

A consulta de contatos deve apresentar o nome do contato e seu número de telefone.

A consulta de países deve apresentar o nome do país e os contatos relacionados.

Somente os países Brasil, Inglaterra e EUA estão sendo considerados nessa aplicação;

ESPECIFICAÇÕES TÉCNICAS

Todas as operações serão providas através de uma REST API. Portanto, os end-points deve seguir os padrões desse estilo arquitetural, referenciando o recurso que está sendo acessado e designando os métodos HTTP adequados para operações.

Utilizar também a "Layered Architecture", ou seja, implementar as classes responsáveis pela camada de serviços, domínio e infraestrutura.

Os eventos de domínio devem estender DomainEvent e devem ser propagadas através do DomainEventNotifier. Os tipos de evento devem ser incluídos no enum DomainEventType.

O mapeamento dos listeners com os eventos de domínio deve ser feito na classe de configuração DomainEventConfig.

Os listeners de evento de domínio devem implementer a interface DomainEventListener.

O banco Postgres deve ser inicializado através do Docker e Liquibase com o comando: docker-compose -d up && mvn liquibase:update. Assim, todas as tabelas serão criadas bem como a carga de países (Brasil, Inglaterra e EUA).

O relacionamento de Country para Contato é "One-to-Many" e unidirecional. 

Essa aplicação utiliza Spring Boot. Para execução, usar os comandos: mvn clean package && mvn spring-boot:run 

OBSERVAÇÕES

DomainEvent, DomainEventConfig, DomainEventNotifier, DomainEventListener, DomainEventType já foram implementados.

O código deve seguir os príncipios SOLID e boas práticas como "Tell don't ask" e "Law of Demeter".