-- English version below
## 💻 Sobre o projeto

ForumHUB é uma aplicação backend construída como challenge no curso de Spring Boot da [Alura](https://www.alura.com.br) em parceria com a [ONE](https://www.oracle.com/br/education/oracle-next-education/).
Os requisitos seriam uma api para um fórum de tecnologia, onde os usuários poderiam se cadastrar, criar tópicos e responder tópicos, além de encerrar os tópicos quando já satisfeitos com as respostas.
---

## ⚙️ Funcionalidades

- [x] CRUD de tópicos;
- [x] CRUD de respostas;
- Ambos com autenticação JWT e autorização por perfil de usuário.

---

## 📄 Documentação

A documentação das funcionalidades da aplicação pode ser acessada neste link: <a href="https://trello.com/b/OKIUKgxe/alura-f%C3%B3rum-challenge-one-sprint-01">Trello</a>
Você pode seguir esse arquivo readme e rodar a aplicação para ver a documentação criada pela OpenApi.
---

## 🚀 Como executar o projeto
Faça o build do projeto usando maven na sua IDE ou pelo terminal:
cmd:
```bash
mvn clean package

```
Para executar o projeto, execute o comando abaixo:
A database em questão deve estar rodando com o nome indicado na variável de ambiente DATASOURCE_URL.

```bash
java -Dspring.profiles.active=prod -DDATASOURCE_URL=jdbc:mysql://localhost/FORUMHUB -jar caminho_do_jar.jar
```
Pode ainda adicionar as seguintes variáveis de ambiente:
mysqlUSER: adicionando o comando -DmysqlUSER=usuario (escolhendo um valor que faça sentido para a database configurada no computador);
mysqlPASSWORD: adicionando o comando -DmysqlPASSWORD=senha (escolhendo um valor que faça sentido para a database configurada no computador);
JWT_SECRET: adicionando o comando -JWT_SECRET=segredo (escolhendo um valor que faça sentido para a aplicação);

Há também a possibilidade de rodar o projeto com o GraalVM para criar uma imagem nativa, mas isso requer certo conhecimento fora do escopo deste Readme.
___
## 🛠 Tecnologias

As seguintes tecnologias foram utilizadas no desenvolvimento da API Rest do projeto:

- **[Java 17](https://www.oracle.com/java)**
- **[Spring Boot 3](https://spring.io/projects/spring-boot)**
- **[Maven](https://maven.apache.org)**
- **[MySQL](https://www.mysql.com)**
- **[Hibernate](https://hibernate.org)**
- **[GraalVM](https://www.graalvm.org)**
- **[Lombok](https://projectlombok.org)**
- **[OpenAPI](https://swagger.io)**
- **[JWT](https://jwt.io)**
- **[Spring Security](https://spring.io/projects/spring-security)**

---

## 📝 Licença

Projeto desenvolvido por [Gustavo](https://allogica.com/).


---

## 💻 About the Project

ForumHUB is a backend application built as a challenge in the Spring Boot course from Alura in partnership with ONE.
The requirements were to create an API for a technology forum where users could register, create topics, respond to topics, and close topics when they are satisfied with the answers.
---

## ⚙️ Features

- [x] CRUD operations for topics;
- [x] CRUD operations for answers;
- Both with JWT authentication and user role-based authorization

---

## 📄 Documentation

Portuguese documentation:
The documentation for the application's features can be accessed at this link: <a href="https://trello.com/b/OKIUKgxe/alura-f%C3%B3rum-challenge-one-sprint-01">Trello</a>
You can follow this readme file and run the application to see the OpenAPI documentation.
---

## 🚀 How to run

Build the project using maven on your IDE our by command line:
```bash
mvn clean package

```
To execute the project follow the command below:
The database in question must be running with the name indicated in the DATASOURCE_URL environment variable.

```bash
java -Dspring.profiles.active=prod -DDATASOURCE_URL=jdbc:mysql://localhost/FORUMHUB -jar caminho_do_jar.jar
```

You can also add the following environment variables:
mysqlUSER: adding the command -DmysqlUSER=user (choosing a value that makes sense for the database configured on the computer);
mysqlPASSWORD: adding the command -DmysqlPASSWORD=password (choosing a value that makes sense for the database configured on the computer);
JWT_SECRET: adding the command -JWT_SECRET=secret (choosing a value that makes sense for the application);

There is also the possibility of running the project with GraalVM to create a native image, but this requires some knowledge outside the scope of this Readme.
___
## 🛠 Technologies

The following technologies were used in the development of the project's Rest API:

- **[Java 17](https://www.oracle.com/java)**
- **[Spring Boot 3](https://spring.io/projects/spring-boot)**
- **[Maven](https://maven.apache.org)**
- **[MySQL](https://www.mysql.com)**
- **[Hibernate](https://hibernate.org)**
- **[GraalVM](https://www.graalvm.org)**
- **[Lombok](https://projectlombok.org)**
- **[OpenAPI](https://swagger.io)**
- **[JWT](https://jwt.io)**
- **[Spring Security](https://spring.io/projects/spring-security)**

---

## 📝 License

Project developed by [Gustavo](https://allogica.com/).
