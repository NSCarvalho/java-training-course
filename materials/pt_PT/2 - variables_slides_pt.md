---

marp: true
title: Sessão 02 - Variáveis e Tipos de Dados
---------------------------------------------

# Sessão 02: Variáveis e Tipos de Dados

**Objetivos:**

* Compreender o que são variáveis e porque as usamos
* Aprender os tipos de dados básicos em Java
* Compreender os tipos de variáveis e como usar arrays

---

# O que é uma Variável?

Uma **variável** é um contentor usado para guardar dados durante a execução de um programa.

**Pensa nela como uma caixa com etiqueta:**

* Podes colocar algo lá dentro
* Podes lê-la mais tarde
* Podes substituir o conteúdo

```java
int idade = 30;
```

📚 [Variáveis em Java - Documentação Oficial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

---

# Declarar uma Variável em Java

**Sintaxe:**

```java
<tipo> <nome> = <valor>;
```

**Exemplos:**

```java
int contador = 10;
double preco = 5.99;
char nota = 'A';
boolean ativo = true;
```

📚 [Declaração de Variáveis - Java Language Specification](https://docs.oracle.com/javase/specs/jls/se17/html/jls-14.html#jls-14.4)

---

# Java é uma Linguagem Estaticamente Tipada

* Toda a variável deve ser declarada com um **tipo**
* O tipo não pode mudar depois de definido
* Verificação em tempo de compilação evita muitos erros

```java
String nome = "Alice";
// nome = 5; // ❌ Erro: tipos incompatíveis
```

---

# Tipos de Dados Primitivos em Java

| Tipo      | Descrição           | Exemplo              |
| --------- | ------------------- | -------------------- |
| `int`     | Números inteiros    | `int x = 10;`        |
| `double`  | Números decimais    | `double pi = 3.14;`  |
| `char`    | Um único caractere  | `char nota = 'B';`   |
| `boolean` | Verdadeiro ou falso | `boolean ok = true;` |

📚 [Tipos Primitivos - Documentação Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

---

# Arrays em Java

Arrays guardam vários valores do mesmo tipo.

```java
int[] numeros = {1, 2, 3, 4};
String[] nomes = new String[3];
nomes[0] = "Alice";
```

📚 [Arrays em Java - Documentação Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

---

# Tipos de Variáveis em Java

### 1. Variáveis de Instância (Campos não estáticos)

* Declaradas dentro da classe mas fora de qualquer método
* Cada objeto tem a sua própria cópia

### 2. Variáveis de Classe (Campos estáticos)

* Declaradas com a palavra-chave `static`
* Partilhadas por todas as instâncias da classe

### 3. Variáveis Locais

* Declaradas dentro de métodos ou blocos
* Existem apenas durante a execução do método

```java
public class Exemplo {
    int varInstancia = 5;        // variável de instância
    static int varClasse = 10;   // variável de classe

    public void metodo() {
        int varLocal = 2;        // variável local
    }
}
```

📚 [Tipos de Variáveis - Documentação Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

---

# Inferência de Tipo com `var` (Java 10+)

Podes deixar o Java inferir o tipo com base no valor:

```java
var contador = 10;        // int
var preco = 2.99;         // double
var mensagem = "Olá";     // String
```

**Nota:** O tipo continua fixo após a inferência.

📚 [Inferência de Variável Local (JEP 286)](https://openjdk.org/jeps/286)

---

# Constantes com `final`

Usa-se `final` para tornar uma variável imutável (constante):

```java
final double PI = 3.14159;
```

Tentar alterar o valor resulta em erro de compilação.

📚 [Variáveis Final - Documentação Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/final.html)

---

# Nomear Variáveis

✅ Boas práticas:

* Usar nomes significativos (`idade`, `preco`, `nomeUtilizador`)
* camelCase para variáveis e métodos

❌ Evitar:

* Letras isoladas como `x` ou `y` (exceto em ciclos curtos)
* Nomes que não descrevam o conteúdo

📚 [Convenções de Nomenclatura em Java (Oracle)](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html)

---

# Resumo

✅ Aprendeste:

* Como declarar variáveis
* Diferentes tipos de dados primitivos
* Utilização de arrays
* Tipos de variáveis em Java
* Uso de `var` e `final`
* Boas práticas de nomeação

🔗 [Repositório GitHub do Curso](https://github.com/NSCarvalho/java-training-course)
