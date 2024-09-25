package entities;

import java.util.HashSet;
import java.util.Set;

public class Convidados {
    private Set<Convidado> setConvidado;

    public Convidados() {
        this.setConvidado = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        setConvidado.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        for(Convidado c: setConvidado) {
            if (c.getCodigoConvite() == codigoConvite) {
                setConvidado.remove(c);
                break;
            } else {
                System.out.println("Nao existe um convidado com esse codigo de convite");
            }
        }
    }

    public int numeroConvidados(){
        return setConvidado.size();
    }

    public void exibirConvidados(){
        System.out.println(setConvidado);
    }
}
