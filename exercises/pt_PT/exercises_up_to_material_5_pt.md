---

marp: true
title: Exercício – Perfil Completo de Pessoa (Scanner, Tipos, Arrays, Operadores)
---------------------------------------------------------------------------------

# Série de Exercícios: Análise de Perfil de Pessoa

Todos os exercícios desta série são encadeados. Começa por recolher informação básica sobre uma pessoa e vai progressivamente melhorando o programa para processar e validar os dados do utilizador, usando arrays, operadores e condições lógicas.

---

## 🧪 Exercício 1 – Ler Dados da Pessoa (Tipos Primitivos & Scanner)

Cria um programa Java que leia informações pessoais utilizando **todos os tipos de dados primitivos de Java**:

| Campo                         | Exemplo de Entrada |
| ----------------------------- | ------------------ |
| Número de filhos (`byte`)     | `2`                |
| Anos de experiência (`short`) | `12`               |
| Idade (`int`)                 | `30`               |
| NIF (`long`)                  | `123456789`        |
| Altura em metros (`float`)    | `1.75`             |
| Peso em quilos (`float`)      | `70`               |
| Salário mensal (`double`)     | `1500.50`          |
| Empregado? (`boolean`)        | `true`             |
| Letra favorita (`char`)       | `A`                |

Após recolher os dados, imprime um resumo estruturado.

---

## 🧩 Exercício 2 – Expandir com Informação sobre Filhos (Arrays + Ciclos)

Melhora o programa para:

* Perguntar o nome da pessoa (já recolhido no Exercício 1)
* Perguntar o número de filhos
* Para cada filho, perguntar:

    * Nome
    * Idade
    * Altura
    * Peso

Guardar:

* Os nomes num array
* As idades num array
* ...

Imprimir uma lista de filhos como:

```
Filhos:
1. Ana (5 anos, ...)
2. João (7 anos, ...)
```

---

## 🧮 Exercício 3 – Analisar Dados da Família (Operadores Aritméticos)

Usando os dados dos filhos:

* Calcular e imprimir:

    * Idade média dos filhos
    * Idade máxima e mínima dos filhos
    * Altura/peso médios dos filhos
    * Altura/peso máximos e mínimos
    * Número de filhos com menos de 6 anos

Exemplo de lógica:

```java
int count = 0;
for (int idade : idadesFilhos) {
    if (idade < 6) count++;
}
```

Após os cálculos, imprime um resumo estruturado.

---

## 🔐 Exercício 4 – Validar Entradas (Condições Lógicas)

Melhora o programa para incluir validações para todos os campos:

## ✅ Regras de Validação de Dados

| Campo            | Validação                                            |
| ---------------- | ---------------------------------------------------- |
| Número de filhos | ≥ 0; deve coincidir com o número de filhos recolhido |
| Idade            | Entre 0 e 120                                        |
| NIF              | Exatamente 9 dígitos; deve começar por 1, 2 ou 3     |
| Altura (m)       | Entre 0.5 e 2.5                                      |
| Peso (kg)        | Entre 2 e 500                                        |
| Salário mensal   | ≥ 0                                                  |
| Empregado?       | Se `false`, o salário deve ser 0                     |
| Letra favorita   | Deve ser uma única letra (A-Z ou a-z)                |

### ✅ Validação para cada filho

| Campo do filho | Validação                                                  |
| -------------- | ---------------------------------------------------------- |
| Nome           | Não vazio; apenas letras (pode incluir espaços ou hífenes) |
| Idade          | Entre 0 e a idade do pai/mãe                               |
| Altura (m)     | Entre 0.4 e 2.2                                            |
| Peso (kg)      | Entre 2 e 200                                              |

### 🔁 Validações Cruzadas

| Validação                                                           |
| ------------------------------------------------------------------- |
| Se o número de filhos for 0, não devem ser pedidos dados dos filhos |
| Idade média dos filhos deve ser inferior à idade do pai/mãe         |
| Se `empregado == false` e salário > 0, deve apresentar um aviso     |

Se algum dado for inválido, mostrar uma mensagem clara de erro e pedir novamente.

---

## 💡 Extensão Opcional

* Contar quantos filhos têm nomes que começam por vogal
* Ordenar os filhos por idade
* Verificar se a letra favorita está no nome da pessoa

---

## 📚 Documentação

* [Java Scanner (Java 24 API)](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Scanner.html)
* [Arrays (Java 24 API)](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Arrays.html)
* [Operadores - Tutorial Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
* [Instruções de Controlo de Fluxo - Tutorial Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
