package basicoJavaSintaxe;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        while(idade != 18){
            System.out.printf("%d%n", idade);
            idade++;
        }
 
        sc.close();
    }
}
