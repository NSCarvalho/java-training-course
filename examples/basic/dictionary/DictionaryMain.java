package dictionary;

import dictionary.exceptions.WordNotFoundException;

import java.util.Scanner;

public class DictionaryMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary<String, String> dictionary = new HashMapDictionary<>();
        dictionary.add("Maça", "Fruto da arvore macieira");


        boolean isWordFound = false;
        while (! isWordFound ){
            try {
                System.out.println("Check the meaning!!");
                String newWord = scanner.next();

                System.out.println("Meaning :" + dictionary.get(newWord));
                isWordFound = true;
            } catch (WordNotFoundException e) {
                isWordFound = false;
                System.out.println("Word not found");
            }
        }


    }
}
