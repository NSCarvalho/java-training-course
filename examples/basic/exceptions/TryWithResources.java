package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) throws IOException {
        // Checked Exception (FileNotFoundException) -> Exception
        // Unchecked Exception (java.lang.NullPointerException) -> RuntimeException

    /*    BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("file.txt"));
            System.out.println(br.readLine());

        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (IOException e) {
            System.out.println("Error reading the file");
        }finally {
            if(br != null){
                br.close();
            }
        }*/

        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println(br.readLine());

            // Implementation
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (IOException e) {
            System.out.println("Error reading the file");
        }

        //System.out.println("Operation finished.");
    }
}
