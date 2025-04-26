# 📦 Projeto CRUD - Persistência com MariaDB

Este projeto é uma aplicação Spring Boot desenvolvida para a avaliação prática de Persistência de Dados. O objetivo é demonstrar um relacionamento entre duas entidades utilizando Spring Data JPA, Lombok, MariaDB e RESTful APIs.

## 🛠 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Web
- Lombok
- DevTools
- MariaDB
- Postman ou Bruno (para testes de API)

## 📘 Cenário Escolhido

As entidades desenvolvidas foram:

- **Produto**
  - `id` (Long)
  - `nome` (String)
  - `descricao` (String)
  - `preco` (BigDecimal)
  - **Relacionamento**: Muitos produtos pertencem a uma categoria.

- **Categoria**
  - `id` (Long)
  - `nome` (String)
  - `descricao` (String)
  - **Relacionamento**: Uma categoria pode conter vários produtos.


## 🔧 Instalação e Configuração

### 2. Configurar o MariaDB com XAMPP

- Abra o **XAMPP** e inicie o serviço do **MySQL (MariaDB)**.
- Acesse: [http://localhost/phpmyadmin](http://localhost/phpmyadmin)
- Crie um banco de dados chamado **springdb**.



### 3. Configurar o `application.properties`

No arquivo `src/main/resources/application.properties`, adicione ou verifique se as seguintes configurações estão presentes:

```properties
spring.datasource.url=jdbc:mariadb://localhost:3306/springdb
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect

