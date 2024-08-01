package basicoJavaSintaxe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Print
        System.out.println("Hello and welcome!");

        // Variavel <tipo> <nome> = <valor inicial>
        int idade = 25;
        double altura = 1.57;
        char sexo = 'F';
        int numero1 = 9;
        int numero2 = 5;

        double resultado = (double) numero2/numero1;

        System.out.println(idade);
        System.out.println(altura);
        System.out.println(sexo);
        System.out.println(resultado);

        // Entrada de dados
        Scanner sc = new Scanner(System.in);

        // recebendo string
        String a;
        System.out.println("String: ");
        a = sc.next();
        System.out.println("Voce digitou: "+ a);

        //recebendo int
        int b;
        System.out.println("Integer: ");
        b = sc.nextInt();
        System.out.println("Voce digitou: "+ b);

        //recebendo double
        double c;
        System.out.println("Double: ");
        c = sc.nextDouble();
        System.out.println("Voce digitou: "+ c);

        // Seleciona qual posição será mostrada
        char d;
        System.out.println("Char: ");
        d = sc.next().charAt(0);
        System.out.println("Voce digitou: "+ d);

        // Recebe a linha completa
        String nome;
        System.out.println("Nome completo: ");
        sc.nextLine();
        nome = sc.nextLine();
        System.out.println("Voce digitou: " + nome);

        sc.close();
    }
}