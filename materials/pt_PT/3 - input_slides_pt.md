---

marp: true
title: Sessão 03 - Entrada de Dados em Java
-------------------------------------------

# Sessão 03: Entrada de Dados em Java

**Objetivos:**

* Aprender a receber dados do utilizador
* Utilizar a classe Scanner para ler diferentes tipos de dados
* Lidar com problemas comuns de entrada
* Ler valores para arrays e processá-los

---

# Por que é Importante a Entrada de Dados

A entrada permite interação com o utilizador:

* Introduzir nome, idade, opções, valores, etc.
* Torna o programa dinâmico e últil

---

# A Classe `Scanner`

Usada para ler entrada do teclado (System.in).

**Importar Scanner:**

```java
import java.util.Scanner;
```

**Criar objeto Scanner:**

```java
Scanner input = new Scanner(System.in);
```

📚 [Documentação da Classe Scanner - Oracle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Scanner.html)

---

# Ler Strings e Inteiros

```java
System.out.print("Introduz o teu nome: ");
String nome = input.nextLine();

System.out.print("Introduz a tua idade: ");
int idade = input.nextInt();
```

📝 Usa `nextLine()` para texto completo, `nextInt()` para inteiros.

---

# Ler Outros Tipos de Dados

```java
double preco = input.nextDouble();
boolean valido = input.nextBoolean();
char letraInicial = input.next().charAt(0);
```

📚 [Métodos do Scanner - Oracle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Scanner.html)

---

# Problema Comum com Scanner

Misturar `nextInt()` ou `nextDouble()` com `nextLine()` pode causar problemas devido ao caractere de nova linha.

**Solução:**
Chamar `input.nextLine()` após ler números, antes de ler Strings.

```java
int idade = input.nextInt();
input.nextLine(); // consumir a quebra de linha pendente
String nome = input.nextLine();
```

---

# Programa de Exemplo: Entrada Básica

```java
import java.util.Scanner;

public class ExemploEntrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Idade: ");
        int idade = input.nextInt();

        System.out.println("Olá " + nome + ", tens " + idade + " anos.");
    }
}
```

---

# Ler Vários Valores para um Array

```java
int[] numeros = new int[5];
Scanner input = new Scanner(System.in);

System.out.println("Introduz 5 números:");
for (int i = 0; i < numeros.length; i++) {
    numeros[i] = input.nextInt();
}
```

---

# Processar Entrada em Array: Calcular Média

```java
int soma = 0;
for (int i = 0; i < numeros.length; i++) {
    soma += numeros[i];
}

double media = (double) soma / numeros.length;
System.out.println("Média: " + media);
```

🎯 Isto demonstra como ler, guardar e processar dados de entrada.

---

# Formas de Ler Dados da Linha de Comandos

Em Java, podes receber entrada por várias abordagens:

### ✅ `Scanner` (Recomendado para iniciantes)

* Simples e flexível
* Suporta vários tipos (int, double, String, etc.)

### ✅ `args[]` (Argumentos da linha de comandos)

* Usados ao iniciar o programa
* Valores passados como argumentos:

```bash
java MeuPrograma arg1 arg2
```

```java
public class MeuPrograma {
    public static void main(String[] args) {
        System.out.println("Primeiro argumento: " + args[0]);
    }
}
```

### ⚠️ `BufferedReader` (Avançado)

* Útil para aplicações com foco em desempenho
* Requer tratamento de exceções

```java
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String entrada = reader.readLine();
```

📚 [Argumentos da Linha de Comando - Oracle](https://docs.oracle.com/en/java/javase/24/docs/specs/man/java.html#description-of-command-line-arguments)
📚 [BufferedReader - Oracle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/BufferedReader.html)

### ✅ `Console` (para entrada segura)

* Útil para ler texto sem eco (ex.: passwords)
* Apenas funciona em consolas reais (não em IDEs)

```java
Console console = System.console();
if (console != null) {
    String utilizador = console.readLine("Utilizador: ");
    char[] password = console.readPassword("Palavra-passe: ");
}
```

📚 [System.console() - Oracle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Console.html)

💡 Para maioria dos casos em contexto de aprendizagem, usar `Scanner` é suficiente.

---

# Resumo

✅ Aprendeste:

* Porque é importante a entrada de dados
* Como usar `Scanner` para ler dados do utilizador
* Como resolver problemas comuns de entrada
* Como guardar valores em arrays e calcular resultados

🔗 [Repositório GitHub do Curso](https://github.com/NSCarvalho/java-training-course)
