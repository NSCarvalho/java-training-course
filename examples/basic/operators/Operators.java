package operators;

public class Operators {
    public static void main(String[] args) {
        int number2 = 2;
        int number4 = 4;
        int numberAfterOperation;

        System.out.println("=== Operadores Aritméticos ===");
        numberAfterOperation = number2 + number4;
        System.out.println("number2 + number4 = " + numberAfterOperation); // 6

        numberAfterOperation = number2 - number4;
        System.out.println("number2 - number4 = " + numberAfterOperation); // -2

        numberAfterOperation = number2 * number4;
        System.out.println("number2 * number4 = " + numberAfterOperation); // 8

        numberAfterOperation = number2 / number4;
        System.out.println("number2 / number4 (int) = " + numberAfterOperation); // 0 (int truncates decimal)

        double resultDouble = (double) number2 / number4;
        System.out.println("number2 / number4 (double) = " + resultDouble); // 0.5

        numberAfterOperation = number2 % number4;
        System.out.println("number2 % number4 = " + numberAfterOperation); // 2

        System.out.println("\n=== Operadores de Incremento e Decremento ===");
        System.out.println("++number2 = " + (++number2)); // 3
        System.out.println("number4++ = " + (number4++)); // 4 (depois vale 5)
        System.out.println("number4 após pós-incremento = " + number4); // 5

        System.out.println("--number2 = " + (--number2)); // 2
        System.out.println("number2-- = " + (number2--)); // 2 (depois vale 1)
        System.out.println("number2 após pós-decremento = " + number2); // 1

        System.out.println("\n=== Operadores Lógicos ===");
        boolean isToClose = false;
        System.out.println("isToClose = " + isToClose); // false
        System.out.println("!isToClose = " + !isToClose); // true

        System.out.println("\n=== Operadores Unários ===");
        System.out.println("+number2 = " + (+number2)); // 1
        System.out.println("-number2 = " + (-number2)); // -1

        System.out.println("\n=== Operadores de Comparação ===");
        number2 = 2;
        System.out.println("number2 == 2: " + (number2 == 2)); // true
        System.out.println("number2 == 4: " + (number2 == 4)); // false
        System.out.println("number2 != 2: " + (number2 != 2)); // false
        System.out.println("number2 != 4: " + (number2 != 4)); // true
        System.out.println("number2 >= 4: " + (number2 >= 4)); // false
        System.out.println("number2 > 2: " + (number2 > 2)); // false
        System.out.println("number2 <= 4: " + (number2 <= 4)); // true
        System.out.println("number2 < 2: " + (number2 < 2)); // false
    }
}
