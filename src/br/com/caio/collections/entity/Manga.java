package br.com.caio.collections.entity;

public class Manga implements Comparable<Manga> {
    private String nome;
    private Long id;
    private double preco;

    public Manga(double preco, String nome, Long id) {
        this.preco = preco;
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Manga manga = (Manga) obj;
        return nome != null && nome.equals(manga.nome);
    }

    @Override
    public int hashCode() {
        return nome == null ? 0 : nome.hashCode();
    }

    @Override
    public int compareTo(Manga o) {
//        if(this.id < o.getId()){
//            return -1;
//        } else if(this.id.equals(o.getId())){
//            return 0;
//        } else{
//            return 1;
//        }
      //  return this.nome.compareTo(o.getNome());
      // return Double.valueOf(preco).compareTo(o.getPreco());
      // return this.id.compareTo(o.getId());
        return Double.compare(preco, o.getPreco());

    }

    @Override
    public String toString() {
        return "Manga{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                '}';
    }
}
