import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos você quer cadastrar?");
        int n = sc.nextInt();

        Aluno[] vetor = new Aluno[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        double soma = 0;

        for (int i=0;i<vetor.length;i++){
            sc.nextLine();
            vetor[i] = Aluno.novoAluno(sc);
            notas1[i] = vetor[i].getGrade1();
            notas2[i] = vetor[i].getGrade2();
        }

        System.out.println("\nAprovados");
        for (int i=0;i<vetor.length;i++){
            double media = (notas1[i] + notas2[i]) / 2;
            if (media >= 6){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}