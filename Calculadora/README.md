# Calculadora em Java

Projeto de estudo desenvolvido em Java com o objetivo de praticar lógica de programação, estruturas de repetição, tratamento de exceções e organização de código em múltiplas classes.

Este projeto é uma recriação, em Java, de uma calculadora que eu já havia desenvolvido anteriormente em C#, como forma de comparar as duas linguagens e me familiarizar com a sintaxe e as particularidades do Java.

## 🎯 Objetivo do projeto

- Fixar os fundamentos de lógica de programação (condicionais, loops, switch-case) na sintaxe do Java.
- Praticar a separação de responsabilidades, mantendo as operações matemáticas em uma classe própria (`Operacoes`), separada da classe principal (`Calculadora`) que lida com a interação com o usuário.
- Tratar corretamente um erro comum (divisão por zero) usando exceções.
- Permitir que o usuário repita operações com os mesmos números ou insira novos números, sem precisar reiniciar o programa.

## ⚙️ Funcionalidades

- Quatro operações matemáticas básicas: soma, subtração, multiplicação e divisão.
- Tratamento de divisão por zero, sem quebrar a execução do programa.
- Após uma operação, o usuário pode:
    - Repetir outra operação com os **mesmos números**; ou
    - Informar **novos números** e continuar usando a calculadora.
- Encerramento controlado pelo próprio usuário.

## 🧠 Aprendizados durante o desenvolvimento

Durante a construção deste projeto, encontrei um trecho de código que eu não sabia explicar por completo:

```java
continuarOperacao = scanner.next().charAt(0);
```

Eu não conhecia a definição do método `charAt()` em Java. Em vez de simplesmente copiar a solução, fui pesquisar o conceito para entender de fato o que estava acontecendo ali. Hoje eu já sei explicar que:

- `scanner.next()` lê a entrada do usuário como uma `String` (mesmo que seja um único caractere, ele não é lido diretamente como `char`).
- `charAt(0)` é um método da classe `String` que retorna o caractere de uma posição específica — nesse caso, a posição `0`, ou seja, o primeiro caractere digitado.
- Isso garante que, independente do tamanho da resposta do usuário (`"S"`, `"Sim"`, `"sair"`), apenas o primeiro caractere é considerado na comparação.

Esse tipo de registro faz parte da minha forma de estudar: prefiro entender a fundo cada linha do meu código antes de seguir adiante, ao invés de apenas fazer o programa funcionar sem saber o porquê.

## 🗂️ Estrutura do projeto

```
Calculadora.java   → classe principal, com o main() e toda a interação com o usuário
Operacoes.java      → classe responsável pelas 4 operações matemáticas
```

## ▶️ Como executar

```bash
javac Calculadora.java Operacoes.java
java Calculadora
```

## 🚀 Próximos passos

- Refatorar o menu para permitir sair diretamente por uma opção do switch (ex: opção 5 - Sair), sem depender apenas do "N" no final do fluxo.
- Aplicar conceitos de Programação Orientada a Objetos assim que forem estudados, revisitando esta calculadora com uma abordagem mais próxima de POO.

## 🛠️ Tecnologias utilizadas

- Java (JDK)

---

Projeto feito para fins de estudo e prática pessoal, parte da minha jornada de aprendizado em programação.