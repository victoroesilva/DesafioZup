# language: pt
@adccarrinho
Funcionalidade: Desafio Zup - Automacao Web
  entre em um grande portal de comercio online (exe: Americanas, Submarino, Magazine Luiza)
  faca uma busca por um produto
  valide o retorno da busca
  escolha um produto na lista
  Adicione o carrinho
  Valide o produto no carrinho


  
  Esquema do Cenario: Inserir e validar itens no carrinho
    Dado que estou no <site> de comercio online
    Quando pesquiso por <produto>
    Entao consisto o retorno da busca de modo a idenficiar o meu <produto>
    Quando escolho um item da lista
    E adiciono o produto no carrinho
    Entao o carrinho devera conter o <produto> selecionado

    Exemplos:
      | site                       			 | produto         |
      | "https://www.americanas.com.br/" | "Playstation 4" |
