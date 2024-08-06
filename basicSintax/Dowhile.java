package basicoJavaSintaxe;

import java.util.Scanner;

public class Dowhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char usuario;

        do {
            System.out.println("Digite s ou n");
            usuario = sc.next().charAt(0);
        }while(usuario != 'n');

        sc.close();
    }
}
