#Author: milton.silva17@fatec.sp.gov.br
@zoom
Feature: Busca Zoom
  Template para scenario outline 

  @buscarProduto
  Scenario Outline: Buscar produto zoom
    Given eu acesso a pagina principal
    And preencho o campo de <busca>
    #And clico no icone de busca
    #Then valido se o <produtoRetornado> esta correto
    
    Examples:
    |busca			|produtoRetornado	|
    |computador	|celular					|


