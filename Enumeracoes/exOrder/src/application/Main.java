package application;

import entities.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

import static java.text.DateFormat.*;

public class Main {
    public static void main(String args[]) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirth = sdf.parse(sc.next());
        Client client = new Client(clientName, clientEmail, clientBirth);


        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), orderStatus, client);

        System.out.print("How many items to this order? ");
        int numItems = sc.nextInt();

        for (int i = 1; i<=numItems;i++){
            System.out.println("Enter #"+ i+ " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(productQuantity, productPrice, product);

            order.addItem(item);
        }

        System.out.println(order);

        sc.close();
    }
}