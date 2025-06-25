---

marp: true
title: Sessão 05 - Estruturas de Controlo de Fluxo
--------------------------------------------------

# Sessão 05: Estruturas de Controlo de Fluxo

**Objetivos:**

* Compreender como controlar o fluxo de execução num programa
* Usar `if`, `else`, `else if`, `switch`
* Aplicar ciclos: `while`, `for`, `do-while`

---

# Por que o Controlo de Fluxo é Importante

Permite que o teu programa tome decisões e repita ações.

**Analogia do mundo real:**

* Se estiver a chover → levar um guarda-chuva
* Repetir 10 flexões → ciclo

---

# Instruções Condicionais

## `if`, `else if`, `else`

```java
int idade = 20;

if (idade >= 18) {
    System.out.println("Adulto");
} else {
    System.out.println("Menor");
}
```

📚 [Instruções de Controlo de Fluxo - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)

---

# Instrução `switch`

Usada para múltiplas condições fixas:

```java
int dia = 3;
switch (dia) {
    case 1: System.out.println("Segunda-feira"); break;
    case 2: System.out.println("Terça-feira"); break;
    case 3: System.out.println("Quarta-feira"); break;
    default: System.out.println("Outro dia");
}
```

📚 [switch - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)
📚 [switch Java 24 - Oracle Docs](https://docs.oracle.com/en/java/javase/24/language/switch-expressions-and-statements.html)

---

# Visão Geral dos Ciclos

Os ciclos permitem repetir um bloco de código.

Tipos:

* Ciclo `while`
* Ciclo `do-while`
* Ciclo `for`

---

# Ciclo `while`

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

Executa **enquanto** a condição for verdadeira.

---

# Ciclo `do-while`

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

Executa pelo menos uma vez antes de verificar a condição.

📚 [Instruções while e do-while - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)

---

# Ciclo `for`

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

* Inicialização: `int i = 0`
* Condição: `i < 5`
* Incremento: `i++`

📚 [Instrução for - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)
📚 [The for Statement Java 24 - Oracle Docs](https://docs.oracle.com/javase/specs/jls/se24/html/jls-14.html#jls-14.14)

---

# Instruções de Controlo de Ciclo

* `break`: sai do ciclo
* `continue`: salta para a próxima iteração

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;
    if (i % 2 == 0) continue;
    System.out.println(i);
}
```

---

# Resumo

✅ Aprendeste:

* Como usar `if`, `else if`, `else` e `switch`
* Quando e como usar ciclos `while`, `do-while` e `for`
* Como controlar a execução de ciclos com `break` e `continue`

🔗 [Repositório GitHub do Curso](https://github.com/NSCarvalho/java-training-course)
