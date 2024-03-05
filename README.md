# Projeto-TheRisingSun

API do projeto TheRisingSun - E-commerce Papelaria

## Tarefas

- [ ] CRUD de Papelaria
- [ ] CRUD de Materiais de Escritório
- [ ] CRUD de Informática
- [ ] CRUD de Carrinho de Compras
- [ ] CRUD de Cadastro de Cliente

## Documentação da API

### ENDPOINT
- [Listar Todas as Categorias](#listar-todas-as-categorias)
- [Listar Todos os Produtos](#listar-todos-os-produtos)
- [Adicionar um Produto](#adicionar-um-produto)
- [Detalhes do Produto](#detalhes-do-produto)
- [Apagar Produto](#apagar-produto)
- [Atualizar Produto](#atualizar-produto)



### Listar Todas as Categorias

`GET` /categoria

Retorna um array com todas as categorias cadastradas.

#### Exemplo de Resposta

```js
[
    {
        "id": 1,
        "nome": "Papelaria",
        
    }
]
```

#### Códigos de Status

|código|descrição|
|------|---------|
|200|Os dados das categorias foram retornados com sucesso
|401|Acesso negado. Você deve se autenticar

---
### Listar Todos os Produtos

`GET` /produtos

Retorna um array com todos os produtos cadastrados.

#### Exemplo de Resposta

```js
[
    {
        "id": 1,
        "nome": "Caderno",
        "descricao: "Caderno capa dura espiral - 150 folhas Disney Stitch",
        "preco": "50.99",
        "id_categoria:"1"
        
    }
]
```

#### Códigos de Status

|código|descrição|
|------|---------|
|200|Os dados das categorias foram retornados com sucesso
|401|Acesso negado. Você deve se autenticar

---

### Adicionar um Produto

`POST` /produtos

Adicionar um novo produto com os dados enviados no corpo da requisição.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição|
|-----|----|:-----------:|---------|
|nome|string|✅|Um nome curto para a categoria.
|icone|string|❌|O nome do ícone de acordo com a biblioteca Material Icons

```js
{
    "nome": "Caderno",
    "descricao: "Caderno capa dura espiral - 150 folhas Disney Stitch",
    "preco": "50.99",
    "id_categoria:"1"
}
```

#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Caderno",
    "descricao: "Caderno capa dura espiral - 150 folhas Disney Stitch",
    "preco": "50.99",
    "id_categoria:"1"
}
```

#### Códigos de Status

|código|descrição|
|------|---------|
|201|Produto adicionado com sucesso
|400|Dados enviados são inválidos. Verifique o corpo da requisição
|401|Acesso negado. Você deve se autenticar

### Detalhes do Produto

`GET` /categoria/´{id}´/produtos/`{id}`

Retornar os detalhes do produto com o `id` informado como parâmetro de path.

#### Exemplo de Resposta

```js
// requisição para /categoria/1/produtos/1
{
    "id": 1,
    "nome": "Caderno",
    "descricao: "Caderno capa dura espiral - 150 folhas Disney Stitch",
    "preco": "50.99",
    "id_categoria:"1"
}
```

#### Códigos de Status

|código|descrição|
|------|---------|
|200|Os dados da categoria foram retornados com sucesso
|401|Acesso negado. Você deve se autenticar
|404|Não existe categoria com o `id` informado

___

### Apagar Produto

`DELETE` /produtos/`{id}`

Apaga o produto com o `id` especificado no parâmetro de path.

#### Códigos de Status

|código|descrição|
|------|---------|
|204|Produto foi apagada com sucesso
|401|Acesso negado. Você deve se autenticar
|404|Não existe categoria com o `id` informado

___

### Atualizar Produto

`PUT` /produtos/`{id}`

Altera dos dados do produto especificada no `id`, utilizando as informações enviadas no corpo da requisição.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição|
|-----|----|:-----------:|---------|
|nome|string|✅|Um nome curto para a categoria.
|icone|string|✅|O nome do ícone de acordo com a biblioteca Material Icons

```js
{
    "nome": "Caderno",
    "descricao: "Caderno capa dura espiral - 150 folhas Disney Stitch",
    "preco": "50.99",
    "id_categoria:"1"
}
```
#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Caderno",
    "descricao: "Caderno capa dura espiral - 150 folhas Disney Stitch",
    "preco": "50.99",
    "id_categoria:"1"
}
```

#### Códigos de Status

|código|descrição|
|------|---------|
|200|Produto alterado com sucesso
|400|Dados enviados são inválidos. Verifique o corpo da requisição
|401|Acesso negado. Você deve se autenticar
|404|Não existe categoria com o `id` informado

---


