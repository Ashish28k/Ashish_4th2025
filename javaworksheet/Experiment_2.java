package Ashish_4th2025;

import java.util.Scanner;

public class Experiment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter second number: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b != 0 ? (double) a / b : "Cannot divide by zero"));

        scanner.close();
    }
}
