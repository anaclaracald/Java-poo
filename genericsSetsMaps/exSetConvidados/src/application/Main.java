package application;

import entities.Convidados;

public class Main {
    public static void main(String[] args){
        Convidados convidados = new Convidados();
        System.out.println("Numero de convidados no set é igual a " + convidados.numeroConvidados());

        convidados.adicionarConvidado("Alice", 1234);
        convidados.adicionarConvidado("Bob", 1235);
        convidados.adicionarConvidado("Charlie", 1235);
        convidados.adicionarConvidado("David", 1236);

        // Exibindo os convidados no conjunto
        System.out.println("Convidados no conjunto:");
        convidados.exibirConvidados();

        // Exibindo o número atualizado de convidados no conjunto
        System.out.println("Existem " + convidados.numeroConvidados() + " convidado(s) dentro do Set de Convidados");

        // Removendo um convidado do conjunto por código de convite
        convidados.removerConvidado(1236);
        System.out.println("Existem " + convidados.numeroConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto após a remoção:");
        convidados.exibirConvidados();
    }
}
