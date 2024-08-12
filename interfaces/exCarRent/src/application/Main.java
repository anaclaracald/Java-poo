package application;

import model.entities.CarRental;
import model.entities.Invoice;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Rent data");
        System.out.print("Car model: ");
        String model = sc.nextLine();
        System.out.print("Pick up (dd/mm/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), sdf);
        System.out.print("Return (dd/mm/yyyy hh:mm): ");
        LocalDateTime end = LocalDateTime.parse(sc.nextLine(), sdf);

        CarRental cr = new CarRental(start, end, new Vehicle(model));

        System.out.print("Price per hour: R$");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Price per day: R$");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("Invoice");
        System.out.println("Basic payment: "+cr.getInvoice().getBasicPayment());
        System.out.println("Tax: "+cr.getInvoice().getTax());
        System.out.println("Total payment: "+cr.getInvoice().getTotalPayment());

        sc.close();
    }
}