      # encoding: utf-8
      # language: pt
      Funcionalidade: Consultar filmes

      @Positivo
      Esquema do Cenário: Consulta por ID (consulta valida)
      Dado uma requisicao para consulta de filmes
      Quando for informado o ID <imdbID>
      Então sera retornado os dados do filme <titulo>

      Exemplos:
      | imdbID      | titulo          |
      | "tt0372784" | "Batman Begins" |
      | "tt0499549" | "Avatar"        |


      @Negativo
      Esquema do Cenário: Consulta por ID (consulta inválida)
      Dado uma requisicao para consulta de filmes
      Quando for informado um ID invalido <imdbID>
      Então sera retornado o erro <errorMessage>

      Exemplos:
      | imdbID      | errorMessage          |
      | "tt9999999" | "Error getting data." |
