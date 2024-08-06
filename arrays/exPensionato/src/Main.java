import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluguel[] totalQuartos= new Aluguel[10];

        System.out.println("Quantos quartos vão ser alugados? ");
        int num = sc.nextInt();

        for (int i=1;i<=num;i++){
            sc.nextLine();
            System.out.println("\nAluguel");
            System.out.println("Nome: ");
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            int room = sc.nextInt();

            totalQuartos[room] = new Aluguel(name, email, room);
        }

        for (int i=0;i<totalQuartos.length;i++){
            if (totalQuartos[i] != null){
                System.out.println(totalQuartos[i]);
            }
        }
        sc.close();
    }
}