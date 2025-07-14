package classes;

import java.util.Scanner;

public class CarExample {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[2];
        int index = 0;

        while (index < 2) {
            System.out.println("Car brand?");
            var brand = scanner.next();

            System.out.println("Car colour?");
            var colour = scanner.next();

            System.out.println("Car year?");
            var year = scanner.nextInt();

            Car car = new Car(brand, colour, year);
            cars[index] = car;

            ++index;
        }

        for (var car :
                cars) {
            System.out.println(car.toString());
        }

    }

    private static void readCarArray() {
        Car[] cars = new Car[2];

        int index = 0;

        while (index < 2) {
            //
            Car car = new Car(); // Instancia 1
            //Car car1 = new Car(); // Instancia 2

            car.readBrand();
            car.readColour();
            car.readYear();

            cars[index] = car;

            ++index;
        }

        for (var car :
                cars) {
            System.out.println(car.toString());
        }
    }

    private static void old(Scanner scanner) {
        String[] carBrands = new String[3];
        String[] carColour = new String[3];

        int index = 2;

        while (index > 0) {

            // Read Brand
            System.out.println("Car brand?");
            carBrands[index] = scanner.next();

            // Read colour
            System.out.println("Car colour?");
            carColour[index] = scanner.next();

            --index;
        }
    }

}
