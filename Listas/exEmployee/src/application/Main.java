package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registred?");
        int n = sc.nextInt();

        for (int i=0;i<n; i++){
            System.out.println("\n\nEmployee " +(i+1)+"\n" );
            System.out.println("Id: ");
            Integer id = sc.nextInt();

            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Salary: R$");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.println("Enter the employee ID that will have salary increase: ");
        int idRequested = sc.nextInt();

        Integer position = positionId(list, idRequested);
        if(position == null){
            System.out.println("This is doesn't exist!");
        }
        else{
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(position).increaseSalary(percent);
        }

        for (Employee emp: list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer positionId(List<Employee> list, int id){
        for (int i = 0; i< list.size(); i++){
            if(list.get(i).getId() == id){ // se o elemento index i for igual ao id que eu estou pedindo retorna posição do id
                return i;
            }
            return null; // se nao achar retorna nulo e assim vou saber se existe ou nao
        }
    }
}