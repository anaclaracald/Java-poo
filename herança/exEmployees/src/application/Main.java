package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();


        for (int i=1;i<=numEmployees;i++){
            System.out.println("Employee #"+i);
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String Name = sc.nextLine();

            System.out.print("Hours: ");
            int Hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double ValuePerHour = sc.nextDouble();

            if(outsourced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                list.add(new OutsourcedEmployee(Name, Hours, ValuePerHour, additionalCharge));

            } else {
                list.add(new Employee(Name, Hours, ValuePerHour));
            }
        }
        System.out.println();

        for (Employee emp : list){
            System.out.println(emp.getName() + " - $"+ emp.payment());
        }

        sc.close();
    }
}