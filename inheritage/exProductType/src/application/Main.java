package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("How many products do you want to register? ");
        int numProducts = sc.nextInt();

        for (int i=1;i<=numProducts;i++){
            System.out.println("Product #"+ i);
            System.out.print("Common, used or imported (c/u/i)?");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (type == 'i'){
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, manufactureDate));
            }else {
                list.add(new Product(name, price));
            }
        }

        for (Product pro: list){
            System.out.println(pro.priceTag());
        }

        sc.close();
    }
}