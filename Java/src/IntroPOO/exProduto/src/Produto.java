import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public static Produto novoProduto(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Preço: R$");
        double preco = sc.nextDouble();

        System.out.println("Quantidade em estoque: ");
        int estoque = sc.nextInt();

        sc.close();
        return new Produto(nome, preco, estoque);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void addProduct(int quantity){
        this.estoque += quantity;
    }

    public void removeProduct(int quantity){
        this.estoque -= quantity;
    }

    public int getEstoque(){
        return estoque;
    }

    public String toString() {
        return "Nome: " + nome
                + "\nPreço: R$"
                +  String.format("%.2f", preco)
                + "\n"+ "Quantidade no estoque: "
                + estoque;
    }
}
