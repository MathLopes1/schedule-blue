# CHALLENGE BLUE SCHEDULE[<img align="right" src="https://img.shields.io/badge/release-v1.0.0-green">]()


<h1 align="center">
  <a align="center" href="https://spring.io/projects/spring-boot"><img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"></a>
  <a href="https://www.java.com/pt-BR/"><img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white" /></a>
  <a href="https://www.mongodb.com/pt-br"><img src="https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white" /></a>
  <a href="https://www.docker.com/"><img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" /></a>
  <a href="https://code.visualstudio.com/"><img src="https://img.shields.io/badge/Vscode-2496ED?style=for-the-badge&logo=visualstudio&logoColor=blue&color=white"></a>
</h1>

## Descrição do Projeto
API Rest Agenda Blue

### 🌐 Deploy
 > O deploy foi feito utilizando o heroku para a hospedagem da aplicação.
 - [Link - Schedule Blue](https://schedule-blue-backend.herokuapp.com/api/v1/schedule)

### Links úteis.
[Documentação da API - Schedule Blue](https://documenter.getpostman.com/view/18168778/UzXPwwBB) <br>

## Como usar a API

### Pré-requisitos 
> Para usar esta API é preciso instalar as seguintes ferramentas:
- [MongoDB](https://www.mongodb.com/pt-br)
> Para editar o código eu recomendo: 
- [VSCode](https://code.visualstudio.com/)
> Para testar as rotas você pode usar:
- [Postman](https://www.postman.com)


### Rodando o Back End (servidor)

```bash
# Clone este repositório
git clone https://github.com/MathLopes1/schedule-blue.git

# Acesse a pasta do projeto 
cd schedule-blue

# Instale as dependências
mvn install
            
# O servidor iniciará na porta: 8080 
```
### REQUEST - (POST)
> Para cadastrar uma pessoa na agenda.

> POST - `http://localhost:8080/api/v1/schedule`

Exemplo de body:
```json
{
    "name": "Matheus Lopes da Silva",
    "emailAddress": "matheus@gmail.com",
    "phoneNumber": "(81) 98822-3366"
}
```

### REQUEST - (GET) 
> Para listar todos.

> GET - `http://localhost:8080/api/v1/schedule`

### REQUEST - (GET) 
> Para listar uma pessoa por id

> GET - `http://localhost:8080/api/v1/person/:personId`


### REQUEST - (PUT)
> Para atualizar uma pessoa

> PUT - `http://localhost:8080/api/v1/person/:personId`

Exemplo de body:
```json
{
    "name": "Atualizado",
}
```


### REQUEST - (DELETE)

> Para deletar uma pessoa

> DELETE - `http://localhost:8080/api/v1/person/:personId`

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Postman](https://pt-br.reactjs.org/)
- [MongoDB](https://www.mongodb.com/pt-br)
- [SpringBoot](https://spring.io/projects/spring-boot)

## 👨‍💻 Autor

<div align=left>

 <table>
  <tr align=center>
    <th><strong> 💻Matheus Lopes </strong></th>
  </tr>
   <td>
      <a href="https://github.com/MathLopes1">
        <img width="168" height="140" src="https://avatars.githubusercontent.com/u/70352508?v=4" > <p align="left">
</p></a>
    <p align="center">Developer</p>
    </td>
  </tr>
</table>
</div>

<div align=left>
 
<br>
                 
---
 
## 📝 LICENÇA

Esse repositório está licenciado pela **MIT LICENSE**. Para mais informações detalhadas, leia o arquivo [LICENSE](./LICENSE) contido nesse repositório.
