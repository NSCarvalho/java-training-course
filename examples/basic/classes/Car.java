package classes;

import java.util.Scanner;

public class Car {
    private String brand;
    // private - so posso utilizar dentro da classe
    // public - Eu posso aceder a esta variavel em todos os locais em que eu consiga aceder a classe Car
    // protected - ??
    // private (default) - public para as classes dentro do mesmo package e private para as restantes
    private String colour;
    private int age;
    private int year;
    private final Scanner scanner;

    // Constructor
    public Car() {
        scanner = init();
    }

    public Car(String brand, String colour, int year) {
        scanner = init();
        this.brand = brand;
        this.colour = colour;
        this.year = year;
        this.age = calculateAge();
    }

    private Scanner init() {
        final Scanner scanner;
        // mandatory field
        scanner = new Scanner(System.in);
        // default
        this.age = 0;
        return scanner;
    }

    public void readBrand() {
        System.out.println("Car brand?");
        this.brand = scanner.next();
    }

    public void readColour() {
        System.out.println("Car colour?");
        this.colour = scanner.next();
    }

    public void readYear() {

        System.out.println("Car year?");
        this.year = scanner.nextInt();
        this.age = calculateAge();
    }

    public int getAge(){
        return this.age;
    }

    private int calculateAge() {
        // calculate year
        return 2025 - this.year;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "; colour: " + this.colour + "; age: " + this.age;
    }
}
