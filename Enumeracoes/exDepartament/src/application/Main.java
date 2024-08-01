package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import enumsEntities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the departament's name: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Levels: JUNIOR, MID_LEVEL, SENIOR");
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        Double workerBaseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),workerBaseSalary, new Departament(departamentName));

        System.out.println(worker);

        System.out.println("How many contracts to this worker?");
        int numContracts = sc.nextInt();

        for (int i=1;i<= numContracts;i++){
            System.out.println("Enter contract #"+ i);
            System.out.print("Date (dd/mm/yyyy):");
            Date contractDate = dateFormat.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();

        System.out.println("Enter the month and the year to calculate income (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+ worker.getName());
        System.out.println("Departament: "+ worker.getDepartament().getName());
        System.out.println("Income for "+monthAndYear + ":" + String.format("%.2f", worker.income(year, month)));


        sc.close();
    }
}