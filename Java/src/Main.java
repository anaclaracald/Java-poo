import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma= 0;

        System.out.print("Digite quantos elementos você quer ter no seu vetor: ");
        int n = sc.nextInt();
        double [] vetor = new double[n];

        for(int i = 0; i<n;i++){
            System.out.printf("Altura %d: ", i+1);
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma/n;

        System.out.printf("A media das alturas é %.2f", media);

        sc.close();
    }
}