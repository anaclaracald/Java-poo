package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("How many payers do you want to register? ");
        int numPayers = sc.nextInt();

        for (int i=1;i<=numPayers;i++){
            System.out.println("Tax payer #"+i);
            System.out.print("Individual or company? (i/c)");
            char payerType = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if(payerType == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditures));
            } else if (payerType == 'c'){
                System.out.print("Number of employees: ");
                int numEmployees = sc.nextInt();
                list.add(new Company(name, annualIncome, numEmployees));
            }
        }

        System.out.println();
        double sumTax = 0;
        for(TaxPayer payer: list){
            double Tax = payer.tax();
            System.out.println(payer.getName()+ " - $"+payer.tax());
            sumTax += Tax;
        }
        
        System.out.println();
        System.out.println("Total of taxes: $"+ String.format("%.2f", sumTax));

        sc.close();
    }
}