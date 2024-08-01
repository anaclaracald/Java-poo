import javax.xml.namespace.QName;
import java.util.Scanner;

public class Produto {
    private String name;
    private double price;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static Produto novoProduto(Scanner sc){
        System.out.println("Nome: ");
        String name = sc.nextLine();

        System.out.println("Preço: R$");
        double price = sc.nextDouble();
        return new Produto(name, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
