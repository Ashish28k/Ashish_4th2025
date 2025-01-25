package Ashish_4th2025;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalBalance = 0;
        int numberOfAccountHolders = 0;
        int[] transactionIDs = {101, 102, 103, 104};

        try {
            System.out.print("Enter total balance: ");
            totalBalance = scanner.nextDouble();

            System.out.print("Enter number of account holders: ");
            numberOfAccountHolders = scanner.nextInt();

            double averageBalance = totalBalance / numberOfAccountHolders;
            System.out.println("Average Account Balance: " + averageBalance);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero. No account holders available.");
        }

        try {
            System.out.print("Enter index to access transaction ID: ");
            int index = scanner.nextInt();

            System.out.println("Transaction ID: " + transactionIDs[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid transaction ID index.");
        } finally {
            scanner.close();
        }
    }
}

