package entities;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite() && Objects.equals(getNome(), convidado.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCodigoConvite());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Convidado{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", codigoConvite=").append(codigoConvite);
        sb.append('}');
        return sb.toString();
    }
}
