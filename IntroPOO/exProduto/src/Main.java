public class Main {
    public static void main(String[] args){
        Produto produto1 = Produto.novoProduto();

        System.out.println(produto1);
        produto1.atualizarPreco(10);
        System.out.println(produto1);

    }
}
