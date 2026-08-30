# Spring App Review

API REST desenvolvida com Java e Spring Boot para revisão e prática de conceitos fundamentais do desenvolvimento de aplicações web com Spring.

O projeto utiliza validação de dados, documentação OpenAPI e Spring Boot Actuator, além de disponibilizar endpoints simples para cadastro e consulta de usuários.

## Funcionalidades

- Cadastro de usuário
- Consulta de usuário
- Validação dos dados de entrada
- Documentação da API com Swagger/OpenAPI
- Monitoramento da aplicação com Spring Boot Actuator

## Tecnologias

- Java 17+
- Spring Boot 3.4.2
- Spring Web
- Spring Validation
- Spring Boot Actuator
- Springdoc OpenAPI
- Lombok
- Maven

## Requisitos

- Java 17+
- Maven
- Docker (opcional)

## Executando o projeto

Clone o repositório:

```bash
git clone https://github.com/bispobr/spring-app-review.git
cd spring-app-review
```

Execute a aplicação com Maven:

```bash
mvn spring-boot:run
```

A API estará disponível em:

```text
http://localhost:8080
```

## Swagger / OpenAPI

Com a aplicação em execução, a documentação interativa da API pode ser acessada em:

```text
http://localhost:8080/swagger-ui/index.html
```

## Actuator

Endpoint de saúde da aplicação:

```text
http://localhost:8080/actuator/health
```

## API Endpoints

### Consultar usuário

```http
GET /hello-word
```

Retorna as informações do usuário conforme a implementação da aplicação.

### Cadastrar usuário

```http
POST /hello-word
Content-Type: application/json
```

Exemplo de requisição:

```json
{
  "nome": "Nome do usuário",
  "email": "usuario@example.com"
}
```

| Campo | Tipo | Descrição |
|---|---|---|
| `nome` | `String` | Nome do usuário. |
| `email` | `String` | E-mail do usuário. |

Os campos estão sujeitos às regras de validação definidas pela aplicação.

## Docker

Gere o pacote da aplicação:

```bash
mvn clean package
```

Gere a imagem Docker:

```bash
docker build -t revisao .
```

Execute o container:

```bash
docker run -p 8080:8080 revisao
```

## Testes

Execute os testes automatizados com:

```bash
mvn test
```

## Fluxo simplificado

```text
Cliente
   │
   ▼
API REST
   │
   ├── POST /hello-word ──► Cadastro
   │
   └── GET /hello-word ───► Consulta
```

## Status

Projeto de estudo desenvolvido para revisar conceitos fundamentais de desenvolvimento de APIs REST com Spring Boot, incluindo validação, documentação OpenAPI e monitoramento com Actuator.
