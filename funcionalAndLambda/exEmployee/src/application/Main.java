package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.compare;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter the minimum salary: ");
            double minSalary = sc.nextDouble();


            List<String> emails = list.stream()
                    .filter(emp -> emp.getSalary() > minSalary)
                    .map(Employee::getEmail)
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("\nEmployees whom salary is more than: "+ String.format("%.2f", minSalary));

            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(emp ->emp.getName().toUpperCase().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, (emp1, emp2) -> emp1 + emp2);

            System.out.println("\nSum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
