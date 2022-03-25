# Projeto Final - School Java MJV :headphones:

Nesse projeto foi desenvolvida uma Api em Java com Spring Boot para criação de Playlists de Músicas.

Foram utilizados o Spring Framework que auxilia as configurações do sistema para um serviço web, Spring data jpa para a persistência de dados e Springdoc-openapi para gerar documentação com Swagger.
Para estabelecer a conexão com o banco de dados mysql utilizamos o Mysql connector Java, será necessesário adicionar as seguintes dependências ao maven para a utilização dessa API:  

/Spring Boot Starter
    
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
    
/MySql Connector

    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>

/Spring Boot Starter Web

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

/SpringDoc OpenApi Ui

    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-ui</artifactId>
       <version>1.6.4</version>
    </dependency>

/Spring Boot Data JPA

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

## :computer: Tecnologias usadas para a execução do projeto:

* Java 17
* Maven
* IntelliJ
* [Spring Boot](https://spring.io/) 
* [Astah](https://astah.net/) 
* [Swagger v3](https://swagger.io/tools/swagger-ui/) 
* [MySql](https://www.mysql.com/)


## UML - Diagrama de Classes


![Diagrama](https://user-images.githubusercontent.com/20348833/160012581-e405ea91-21ed-4608-8746-d9d188799de9.png)


## 📝 Projeto

O projeto está estruturado no padrão MVC com pacotes devidamente separados em Model e Controller juntamente com o pacote service com as regras de negócios para as requisições, 
além disso temos o pacote repository com as interfaces que possibilitam a manipulação de dados no banco.

Para acessar a API documentada no Swagger foi utilizada a url :

>http://localhost:8080/swagger-ui/index.html

Exemplos de JSON:

/Criando Artista

    {
        "id": 0,
        "nome": "Zeca Pagodinho"
    }

/Criando Músicas -> Os generos disponíveis inicialmente são PAGODE, RAP, INDIE, ELETRONICA, HIP_HOP, MPB, REGGIE, POP, SAMBA, OUTROS.

    {
        "id": 0,
        "nome": "Camarão Que Dorme A Onda Leva",
        "duracao": 2.48,
        "genero": "SAMBA",
        "artista": {
        "id": 18
        }
    }

    {
        "id": 0,
        "nome": "Vacilão",
        "duracao": 4.08,
        "genero": "SAMBA",
        "artista": {
        "id": 18
        }
    }

/Criando Usuário

    {
         "id": 0,
        "nome": "Leonardo",
        "email": "leo@gmail.com",
        "senha": "12345"
    }

/Criando Playlist para o usuário criado acima

    {
        "id": 0,
        "nome": "Playlist Projeto Final",
        "usuario": {
        "id": 13 
        }
    }

/Adicionando musica na Playlist do usuário criado

Parametros

    // id da playlist
    id: 9 

	key: melhor eu ir 

/Adicionando músicas do artista x na Playlist

    // id da playlist
     id: 9

	key: zeca pagodinho	

/Adicionando músicas do genero y na Playlist

    // id da playlist
         id 9
		genero MPB

