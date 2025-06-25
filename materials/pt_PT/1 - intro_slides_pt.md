---

marp: true
title: Sessão 01 - Introdução à Programação
-------------------------------------------

# Sessão 01: Introdução à Programação

**Objetivos:**

* Compreender os conceitos básicos de programação
* Instalar e configurar o ambiente de desenvolvimento Java
* Criar o teu primeiro programa Java

---

# O que é Programação?

Programação é escrever um conjunto de instruções para realizar uma tarefa específica.

**Ideia principal:**

* Entrada -> Processamento -> Saída

**Porquê é importante:**

* Automatiza tarefas
* Resolve problemas do mundo real
* Impulsiona a tecnologia moderna

---

# Conceitos Fundamentais de Programação

* **Variáveis**: Guardam dados
* **Tipos de dados**: Definem o tipo de dado (int, double, etc.)
* **Operadores**: Realizam operações (ex.: +, -, \*, /)
* **Fluxo de controlo**: Decisões e ciclos (if, while)
* **Métodos**: Blocos reutilizáveis de código

---

# Instalar o Java Development Kit (JDK)

Vamos usar o OpenJDK 24.

**Links:**

* [https://openjdk.org/](https://openjdk.org/)

**Nota:** As instruções de instalação dependem do teu sistema operativo.

---

# Instalar o IntelliJ IDEA (Edição Comunitária)

**Passos:**

1. Descarregar: [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
2. Instalar e abrir o IntelliJ
3. Configurar o JDK (apontar para a pasta onde instalaste o Java)

\[OK] O IntelliJ ajuda-te a escrever, testar e fazer debug de código.

---

# Criar o Teu Primeiro Programa Java

Passos:

1. Abrir IntelliJ -> Novo Projeto
2. Selecionar Java, escolher SDK (JDK 24)
3. Criar o ficheiro `HelloWorld.java`
4. Escrever o seguinte código:

---

## HelloWorld.java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Para compilar e correr este programa no terminal:

```bash
javac HelloWorld.java
java HelloWorld
```

---

# Resumo

✅ Conceitos introduzidos:

* O que é programação
* Instalar o Java e o IntelliJ
* Criar e executar o primeiro programa Java

🔗 [Repositório GitHub do Curso](https://github.com/NSCarvalho/java-training-course)
