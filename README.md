# app-revisão
Este repositório contém um projeto simples construído usando Java Spring. O objetivo deste repositório é realizar uma pequena revisão acerca dos fundamentos iniciais de uma aplicação Java Spring.


## Instalação

1. Clone o repositório:

```bash
git https://github.com/bispobr/spring-app-review.git
```

2. Instale as dependências com Maven

## Como usar

1. Inicie a aplicação com o Maven
2. API está acessivem atraves do Link http://localhost:8080


## API Endpoints

API contem os seguintes endpoints:

```http request
GET / - Retorna o nome do usuario.
```
```http request
POST / - Registra um novo usuario.
Content-Type: application/json

{
 	"nome": "xxxxx",
	"email" : "xxxxx@xxxxx.xxx.xx"
}
```

