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
- [Cadastrar Categoria](#cadastrar-categoria)
- [Detalhes da Categoria](#detalhes-da-categoria)
- [Apagar Categoria](#apagar-categoria)
- [Atualizar Categoria](#atualizar-categoria)



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
        "preco": "50.99"
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
