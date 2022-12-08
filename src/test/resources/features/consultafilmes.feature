# encoding: utf-8
# language: pt
Funcionalidade: Consultar filmes

  Esquema do Cenário: Consulta por ID
    Dado uma requisicao para consulta de filmes
    Quando for informado o ID <imdbID>
    Então sera retornado os dados do filme <titulo>

    Exemplos: 
      | imdbID      | titulo          |
      | "tt0372784" | "Batman Begins" |
      | "tt0499549" | "Avatar"        |
