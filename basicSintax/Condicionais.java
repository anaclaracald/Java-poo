package basicoJavaSintaxe;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade!");
        } else if (idade == 10){
            System.out.println("Você tem 10 anos!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        /*
        switch (idade){
            case 18:
                System.out.println("Você tem 18 anos");
        }*/


        sc.close();
    }
}
