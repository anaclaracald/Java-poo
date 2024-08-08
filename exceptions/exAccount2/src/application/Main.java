package application;

import model.entities.Account;
import model.exceptions.DomainExceptions;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DomainExceptions {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, initialBalance, withdrawLimit);
        System.out.println(acc);

        System.out.println();
        System.out.print("Quanto você deseja sacar: $");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.println("New balance: " + acc.getBalance());
        } catch (DomainExceptions e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}