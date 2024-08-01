import java.util.Scanner;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public Funcionario(String name, double grossSalary, double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public static Funcionario novoFuncionario(Scanner sc){
        System.out.println("Nome: ");
        String name = sc.nextLine();

        System.out.println("Salário Bruto: R$");
        double grossSalary = sc.nextDouble();

        System.out.println("Taxa(em reais): R$");
        double tax = sc.nextDouble();
        sc.nextLine();

        return new Funcionario(name, grossSalary, tax);
    }

    public double netSalary(){
        return grossSalary - tax;
    }

    public String toString() {
        return "Nome: " + name +
                "\nSalário bruto: R$" + String.format("%.2f", netSalary()) +
                "\nTaxa: " + String.format("%.2f",tax);
    }

    public double increaseSalary(Scanner sc){
        System.out.println("Qual a porcentagem de aumento do salário bruto? ");
        double percentage = sc.nextDouble();
        return grossSalary += grossSalary * percentage / 100.0;
    }

}
