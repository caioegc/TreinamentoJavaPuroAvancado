package br.com.caio.collections.entity;

public class Smarthphone {
    private String nome;
    private int codigo;


    public Smarthphone(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smarthphone smarthphone = (Smarthphone) obj;
        return nome != null &&  nome.equals(smarthphone.nome);
    }

    @Override
    public int hashCode() {
        return nome == null ? 0 : this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "Smarthphone{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
