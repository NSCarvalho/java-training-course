package flow;

import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira uma palavra: ");
        String palavra = scanner.next();
        char letra1 = 'A';
        char letra2 = 'a';
        int contador = 0;

        for (int index = 0; index < palavra.length(); index++) {
            if (palavra.charAt(index) == letra1 || palavra.charAt(index) == letra2) {
                contador = contador + 1;
            }
        }

        System.out.println("A palavra " + palavra + " contem a letra 'A' ou 'a' " + contador + " vezes.");
    }
}