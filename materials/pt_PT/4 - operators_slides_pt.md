---

marp: true
title: Sessão 04 - Operadores Aritméticos e Lógicos
---------------------------------------------------

# Sessão 04: Operadores Aritméticos e Lógicos

**Objetivos:**

* Compreender como utilizar operadores aritméticos
* Avaliar condições lógicas
* Combinar expressões com operadores lógicos
* Conhecer a precedência dos operadores em Java

---

# Operadores Aritméticos

Usados para realizar operações matemáticas básicas:

| Operador | Descrição      | Exemplo |
| -------- | -------------- | ------- |
| `+`      | Adição         | `a + b` |
| `-`      | Subtração      | `a - b` |
| `*`      | Multiplicação  | `a * b` |
| `/`      | Divisão        | `a / b` |
| `%`      | Módulo (resto) | `a % b` |

📚 [Operadores Aritméticos - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html)

---

# Operadores Lógicos

Usados para combinar ou inverter expressões booleanas:

| Operador | Nome | Descrição                             |    |                                            |
| -------- | ---- | ------------------------------------- | -- | ------------------------------------------ |
| `&&`     | AND  | verdadeiro se ambos forem verdadeiros |    |                                            |
| \`       |      | \`                                    | OR | verdadeiro se pelo menos um for verdadeiro |
| `!`      | NOT  | inverte o valor booleano              |    |                                            |

📚 [Operadores Lógicos - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)

---

# Tabela de Precedência dos Operadores

| Categoria           | Operadores                                        |                           |    |
| ------------------- | ------------------------------------------------- | ------------------------- | -- |
| **Pós-fixados**     | `expr++`, `expr--`                                |                           |    |
| **Unários**         | `++expr`, `--expr`, `+expr`, `-expr`, `~`, `!`    |                           |    |
| **Multiplicativos** | `*`, `/`, `%`                                     |                           |    |
| **Aditivos**        | `+`, `-`                                          |                           |    |
| **Deslocamento**    | `<<`, `>>`, `>>>`                                 |                           |    |
| **Relacionais**     | `<`, `>`, `<=`, `>=`, `instanceof`                |                           |    |
| **Igualdade**       | `==`, `!=`                                        |                           |    |
| **Bitwise AND**     | `&`                                               |                           |    |
| **Bitwise XOR**     | `^`                                               |                           |    |
| **Bitwise OR**      | \`                                                | \`                        |    |
| **Lógico AND**      | `&&`                                              |                           |    |
| **Lógico OR**       | \`                                                |                           | \` |
| **Ternário**        | `? :`                                             |                           |    |
| **Atribuição**      | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `^=`, \` | =`, `<<=`, `>>=`, `>>>=\` |    |

📚 [Operadores - Precedência](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

---

# Combinar Condições Lógicas

```java
boolean isAdmin = true;
boolean isActive = false;

if (isAdmin || isActive) {
    System.out.println("Bem-vindo");
}
```

💡 Usa parênteses para agrupar expressões complexas:

```java
if ((x > 5 && y < 10) || z == 3) { ... }
```

---

# Exemplo com o operador NOT

```java
boolean isLoggedIn = false;

if (!isLoggedIn) {
    System.out.println("Por favor, faz login.");
}
```

`!true` torna-se `false`, e vice-versa.

---

# Resumo

✅ Aprendeste:

* Operadores aritméticos e lógicos
* Precedência dos operadores em Java
* Como escrever e combinar expressões corretamente

🔗 [Repositório GitHub do Curso](https://github.com/NSCarvalho/java-training-course)
