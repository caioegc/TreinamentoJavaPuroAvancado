package br.com.caio.collections.entity;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private Integer idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return nome != null && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return nome == null ? 0 : this.nome.hashCode();
    }

    @Override
    public int compareTo(Pessoa o) {
//        if(this.idade < o.getIdade()){
//            return -1;
//        } else if(this.idade.equals(o.getIdade())){
//            return 0;
//        } else{
//            return 1;
//        }
//    }
        return this.idade.compareTo(o.getIdade());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
