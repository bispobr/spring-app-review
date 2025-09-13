# App-revisão
Este repositório apresenta um projeto simples desenvolvido com Java Spring. O seu objetivo é revisar  alguns conceitos de uma aplicação Java utilizando Spring boot e testar o uso de alguns recursos.


## Requisitos

- Java 21+
- Maven

## Executando o Projeto

1. Clone o repositório:

```bash
git https://github.com/bispobr/spring-app-review.git
```


## Como usar

1. Inicie a aplicação com o Maven
2. API pode ser consumida através do endereço http://localhost:8080
3. A documentação da API está acessível através do Link http://localhost:8080/swagger-ui/index.html#/

## Como Rodar em um Container (Opcional)

1. Construa o projeto

```bash
mvn clean package 
```

2. Gere a Imagem Docker, com o Docker  instalado execute:


```bash
docker build -t revisao . 
```

3. Execute o Container

```bash
docker run -p 8080:8080 revisao
```

## API Endpoints

API contem os seguintes endpoints:

```http request
GET /hello-word - Retorna o nome do usuario.
```
```http request
POST /hello-word - Registra um novo usuario.
Content-Type: application/json

{
 	"nome": "String",
	"email" : "String"
}
```
| Parâmetro | Tipo     | Descrição                           |
|:----------|:---------| :---------------------------------- |
| `nome`    | `String` | **Obrigatório**. O nome do usuário 
| `email`   | `String` | **Obrigatório**. O email do usuário

