# Backend EventosTec

## Objetivo:
Desenvolver o backend de uma aplicação para gerenciar eventos de tecnologia, permitindo
o cadastro, listagem, filtragem e detalhamento de eventos, bem como a associação de cupons de desconto.

## Detalhamento:

1. O sistema deve permitir que o usuário cadastre um evento com os seguintes campos:
   * Título (obrigatório)
   * Descrição (opcional)
   * Data (obrigatório)
   * Local (obrigatório se for presencial)
   * URL do evento (obrigatório se for online)
   * Imagem (opcional)

2. Eventos poder ser classificados como remotos ou presenciais.
3. O sistema deve permitir que o usuário associe um ou mais cupons de desconto a um evento.
Cada cupom deve possuir os seguintes campos:
    * Código do cupom (obrigatório)
    * Desconto percentual ou valor fixo (obrigatório)
    * Data de validade (opcional)]
4. O sistema deve listar os eventos cadastrados com paginação. A lista deve incluir:
   * Título
   * Data
   * Local
   * Tipo (presencial ou remoto)
   * Banner
   * Descrição
5. O sistema deve retornar somente eventos que ainda não aconteceram
6. O sistema deve permitir que o usuário filtre lista de eventos pelos seguintes critérios:
   * Título
   * Data
   * Local
7. O sistema deve permitir que o usuário consulte todos os detalhes de um evento específico, incluindo:
   * Título
   * Descrição
   * Data
   * Local
   * Imagem
   * URL do evento
   * Lista de cupons ativos com seus respectivos detalhes (código do cupom, desconto, data de validade)