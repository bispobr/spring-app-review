# App-revisão
Este repositório apresenta um projeto simples desenvolvido com Java Spring. Seu objetivo é revisar os fundamentos básicos de uma aplicação Java Spring e testar o uso de alguns recursos do Spring Boot.

## Instalação

1. Clone o repositório:

```bash
git https://github.com/bispobr/spring-app-review.git
```

2. Instale as dependências com Maven

## Como usar

1. Inicie a aplicação com o Maven
2. API pode ser consumida através do endereço http://localhost:8080
3. A documentação da API está acessível através do Link http://localhost:8080/swagger-ui/index.html#/


## API Endpoints

API contem os seguintes endpoints:

```http request
GET / - Retorna o nome do usuario.
```
```http request
POST / - Registra um novo usuario.
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

