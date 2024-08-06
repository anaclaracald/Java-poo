import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario1 = Funcionario.novoFuncionario(sc);
        System.out.println("Funcionário:\n"+ funcionario1);

        funcionario1.increaseSalary(sc);

        System.out.println("Funcionario updated\n "+ funcionario1);
        sc.close();
    }
}