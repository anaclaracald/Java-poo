import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = ContaBancaria.criarContaBancaria(sc);

        System.out.println(conta1);
        conta1.depositar(sc);
        System.out.println(conta1);
        conta1.sacar(sc);
        System.out.println(conta1);
        sc.close();
    }
}