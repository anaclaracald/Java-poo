import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double circumference = Calculator.circumference(radius);
        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("PI value: %.2f\n", Calculator.PI);

        sc.close();
    }
}