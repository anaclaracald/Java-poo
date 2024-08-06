import java.util.Scanner;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public final double TAXA = 5.0;

    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo= depositoInicial;
    }


    public static ContaBancaria criarContaBancaria(Scanner sc){
        System.out.println("Número da conta: ");
        int numeroConta = sc.nextInt();

        sc.nextLine();
        System.out.println("Nome completo do titular da conta: ");
        String nomeTitular = sc.nextLine();

        System.out.println("Quer depositar um valor inicial na conta? (s/n)");
        String respostaDI = sc.next();

        double depositoInicial = 0;
        if (respostaDI.equalsIgnoreCase("s")){
            System.out.println("Qual o valor do depósito inicial? ");
            depositoInicial = sc.nextDouble();
        }

        return new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
    }

    public String toString() {
        return "\nConta Bancária\n" +
                "Número da Conta: " + numeroConta + "\n"+
                "Titular: " + nomeTitular + "\n" +
                "Saldo: R$" + saldo + "\n";
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(Scanner sc){
        System.out.println("\nDepósito");
        System.out.println("Qual valor você deseja depositar? ");
        double valor = sc.nextDouble();

        if(valor > 0){
            this.saldo += valor;
            System.out.printf("Você acabou de depositar R$%.2f.", valor);
        }else {
            System.out.println("Valor inválido!");
        }
        return this.saldo;
    }

    public double sacar(Scanner sc){
        System.out.println("\nSaque");
        System.out.println("Taxa de saque -> R$5,00.\nQual valor você deseja depositar? ");
        double valor = sc.nextDouble();

        valor += TAXA;
        this.saldo -= valor;
        System.out.printf("Você acabou de sacar R$%.2f.", valor - TAXA);

        return this.saldo;
    }
}
