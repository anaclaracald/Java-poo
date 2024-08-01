package basicoJavaSintaxe;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.printf("%d%n", numero);
        }

        sc.close();
    }
}
