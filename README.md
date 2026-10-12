# Projeto Java Iniciante

Este repositório é um projeto de estudo em Java focado em conceitos básicos de programação orientada a objetos (POO), organização de pacotes e estrutura de projetos simples.

## Objetivo

O projeto ajuda a praticar:

- criação de classes e objetos
- uso de atributos e métodos
- encapsulamento
- validação de dados simples
- organização por pacotes
- execução de um programa Java em VS Code

## Estrutura do projeto

```text
testejava/
├── bin/                  # arquivos compilados (.class)
├── lib/                  # bibliotecas externas (se houver)
├── src/                  # código-fonte Java
│   ├── App.java          # classe principal / ponto de entrada
│   ├── banco/
│   │   └── Contabancaria.java
│   ├── poo/
│   │   └── Pessoa.java
│   └── produtos/
│       └── Produtos.java
├── .gitignore
├── README.md
└── .vscode/
```

## Classes principais

### 1. App.java
A classe `App` é a responsável por iniciar o programa. Ela instancia a classe `Contabancaria`, define valores iniciais e chama os métodos para mostrar o funcionamento do sistema.

### 2. poo/Pessoa.java
Representa uma pessoa com atributos como:

- nome
- idade

Além disso, possui métodos para:

- apresentar a pessoa
- obter e alterar o nome
- obter e alterar a idade

### 3. produtos/Produtos.java
Representa um produto com:

- nome
- preço
- quantidade em estoque

Inclui validações simples para impedir valores negativos em preço e quantidade.

### 4. banco/Contabancaria.java
Representa uma conta bancária com:

- titular
- saldo
- valor depositado

Também inclui validação do depósito para não aceitar valores menores ou iguais a zero.

## Como executar

No terminal, dentro da pasta do projeto, rode os comandos abaixo:

```bash
javac -d bin src\App.java src\poo\Pessoa.java src\produtos\Produtos.java src\banco\Contabancaria.java
java -cp bin App
```

Se estiver usando o ambiente do VS Code com suporte Java, também é possível rodar pela opção "Run Java" ou pelo botão de execução da classe principal.

## Como esse projeto foi pensado

Esse projeto é um exemplo inicial de como Java é usado em aplicações simples e didáticas. Ele mostra um jeito prático de aprender:

- Classes representam modelos de objetos
- Objetos são criados a partir dessas classes
- Métodos executam ações e comportamentos
- Atributos guardam dados
- Pacotes ajudam a organizar o código

## Aprendizados praticados

Durante o desenvolvimento desse projeto, é possível praticar:

- sintaxe básica de Java
- declaração de variáveis e métodos
- importação de classes
- uso de pacotes
- criação de objetos
- lógica de validação
- saída em console com `System.out.println()`

## Próximos passos

Para evoluir este projeto, você pode explorar:

- criar uma classe `Cliente` separada da conta bancária
- adicionar métodos de saque e depósito com controle de saldo
- criar uma loja com produtos e carrinho de compras
- usar `Scanner` para entrada de dados do usuário
- aplicar conceitos de herança e encapsulamento
- criar listas com `ArrayList`

## Observação

Este é um projeto de nível iniciante, perfeito para aprender estrutura básica em Java e começar a entender a lógica da programação orientada a objetos.
