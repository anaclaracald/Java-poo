package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalPayment;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc =  new Scanner(System.in);

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter with contract data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Date (DD/MM/YYYY): ");
        LocalDate date = LocalDate.parse(sc.next(), sdf);

        System.out.print("Price of the contract: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Number of installments: ");
        int nInstallments = sc.nextInt();

        ContractService service = new ContractService(new PaypalPayment());
        service.processContract(obj, nInstallments);

        System.out.println("\nInstallments");
        for(Installment ins: obj.getInstallments()){
            System.out.println(ins);
        }
        sc.close();
    }
}