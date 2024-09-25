package entities;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, Integer numero){
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirAgenda(){
        System.out.println(agendaContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c: agendaContatos){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumero(String nome, Integer novoNumero) {
        Contato contatoAtualizado = null;
        if(!agendaContatos.isEmpty()){
            for (Contato c : agendaContatos) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        }else{
            throw new RuntimeException("O conjunto está vazio.");
        }
    }
}
