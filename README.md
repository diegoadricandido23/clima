### Aplicação de exemplo de consumo de uma Api

## Tecnologias utilizadas

  .Spring Boot - framework
  . RestTemplate - realização das consultas
  . API Consumida - Clima Tempo da HG Brasil 'www.hgbrasil.com'


## End Points

  . Consultar todos: localhost:8080/clima
  . Consultar todos Por Código da Cidade: localhost:8080/clima/codigoCidade/{codigoCidade}
  . Consultar todos Por Nome da Cidade: localhost:8080/clima/nomeCidade/{nomeCidade}

Obs: Para realizar a consulta por 'Nome da Cidade' é necessário adicionar uma 'CHAVE - KEY' no arquivo application.properties
     Para conseguir a chave é necessário realizar um cadastro na hgbrasil.
