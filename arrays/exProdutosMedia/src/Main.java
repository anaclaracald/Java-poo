import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos você deseja cadastrar no momento?");
        int n = sc.nextInt();
        double soma = 0;
        Produto[] vetor = new Produto[n];

        for (int i=0;i<vetor.length;i++){
            sc.nextLine();
            vetor[i] = Produto.novoProduto(sc);
            soma+= vetor[i].getPrice();
        }

        for (int i=0;i< vetor.length;i++){
            System.out.println(vetor[i]);
        }

        double media = soma/ vetor.length;

        System.out.printf("Preço médio: R$%.2f\n", media);
        sc.close();
    }
}