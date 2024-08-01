import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dollarDesire = sc.nextDouble();
        double result = CurrencyConverter.dollarTotal(dollarPrice,dollarDesire);

        System.out.printf("Amount to be paid in reais = R$%.2f\n", result);

        sc.close();
    }
}