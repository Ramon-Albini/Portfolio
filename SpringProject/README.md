# 🌀 Projeto: API Ninja - Spring Boot

Este projeto é uma API RESTful desenvolvida em **Java Spring Boot**, com objetivo de gerenciar ninjas, suas vilas, missões e jutsus.

Trabalho prático da disciplina, com foco em:

- Modelagem de entidades
- Relacionamentos (1:N, N:N)
- DTOs (Data Transfer Objects)
- CRUD completo
- Tratamento de exceções
- Services e Controllers bem organizados

---

## 🔧 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Lombok
- H2 Database (ou outro de sua escolha)
- Jakarta Persistence
- Maven

---

## 📦 Modelagem

### Entidades

- **Ninja**
  - id
  - nome
  - idade
  - clã
  - vila (Vila)
  - missão (Missao)
  - jutsus (lista de Jutsu)

- **Vila**
  - id
  - nome
  - quantidade de habitantes
  - ninjas (lista de Ninja)

- **Missao**
  - id
  - nome
  - rank
  - descrição

- **Jutsu**
  - id
  - nome
  - descrição
  - dificuldade
  - ninjas (lista de Ninja)

---

## 🔗 Relacionamentos

| Entidade | Tipo | Descrição |
| -------- | ---- | --------- |
| Ninja ↔ Vila | Many-to-One | Cada Ninja pertence a uma Vila |
| Ninja ↔ Missao | Many-to-One | Cada Ninja pode estar em uma Missão |
| Ninja ↔ Jutsu | Many-to-Many | Cada Ninja pode saber vários Jutsus |

---

## 🗃️ Endpoints

### 🔥 NinjaController

| Método | Rota | Descrição |
| ------ | ---- | --------- |
| GET | `/ninjas` | Lista todos os ninjas |
| GET | `/ninjas/{id}` | Busca ninja por id |
| POST | `/ninjas` | Cria um ninja |
| PUT | `/ninjas/{id}` | Atualiza um ninja |
| DELETE | `/ninjas/{id}` | Deleta um ninja |

---

### 🔥 VilaController

| Método | Rota | Descrição |
| ------ | ---- | --------- |
| GET | `/vilas` | Lista todas as vilas |
| GET | `/vilas/{id}` | Busca vila por id |
| POST | `/vilas` | Cria uma vila |
| PUT | `/vilas/{id}` | Atualiza uma vila |
| DELETE | `/vilas/{id}` | Deleta uma vila |

---

### 🔥 MissaoController

| Método | Rota | Descrição |
| ------ | ---- | --------- |
| GET | `/missoes` | Lista todas as missões |
| GET | `/missoes/{id}` | Busca missão por id |
| POST | `/missoes` | Cria uma missão |
| PUT | `/missoes/{id}` | Atualiza uma missão |
| DELETE | `/missoes/{id}` | Deleta uma missão |

---

### 🔥 JutsuController

| Método | Rota | Descrição |
| ------ | ---- | --------- |
| GET | `/jutsus` | Lista todos os jutsus |
| GET | `/jutsus/{id}` | Busca jutsu por id |
| POST | `/jutsus` | Cria um jutsu |
| PUT | `/jutsus/{id}` | Atualiza um jutsu |
| DELETE | `/jutsus/{id}` | Deleta um jutsu |
| PUT | `/jutsus/{jutsuId}/adicionar-ninja/{ninjaId}` | Associa um ninja a um jutsu |
| PUT | `/jutsus/{jutsuId}/remover-ninja/{ninjaId}` | Remove a associação de um ninja de um jutsu |

---

## 🧪 Como executar o projeto

1️⃣ Clone o projeto:

```bash
git clone https://github.com/seu-usuario/seu-repo.git
```

---

2️⃣ Navegue até a pasta:

```bash
cd teste_spring
```

--- 

3️⃣ Rode o projeto (pode ser via IDE, Spring Boot Dashboard, ou terminal):

```bash
./mvnw spring-boot:run
Obs: o projeto irá rodar na porta padrão 8080.
```

--- 

## 🚀 Sobre o autor
Trabalho feito por Nani (Ramon Albini Vieira) com apoio e consultoria ninja do ChatGPT-senpai 🍥
Disciplina: Programação Avançada 🖥️