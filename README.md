# GraphQL-Kanji

Esse projeto permite consultas em GraphQL de todos os Kanjis da prova [JLPT Nível 5](https://www.jlpt.jp)*.<br>

GraphQL é uma linguagem de consulta flexível e pode ser uma alternativa ao REST.

Para maiores detalhes:
https://graphql.org/learn/queries/

O framework escolhido para esse projeto foi o Quarkus, por ser leve, simples e com ótimo tempo de inicialização.<br>
Quarkus possibilita consultas por meio de uma GUI no endereço http://localhost:8080/graphql-ui/.

Uma possível consulta para testes:

```json
{
    allKanjis{
      ideograma
      significado
    }
}
```

Conheça mais em
https://quarkus.io/.

Os dados são enviados para uma base em memória (h2) durante a inicialização e para versionar e executar o script foi usado flyway.
https://flywaydb.org/

A interface para consulta da base dados se encontra em http://localhost:8080/h2.


## Como rodar a aplicação:

```shell script
./mvnw compile quarkus:dev
```

*Retirados de http://www.passjapanesetest.com
