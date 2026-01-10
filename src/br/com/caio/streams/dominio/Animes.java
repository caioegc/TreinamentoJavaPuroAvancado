package br.com.caio.streams.dominio;

public class Animes {
   private String titulo;
   private double preco;
   private Categoria categoria;

    public Animes(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public Animes(String titulo, double preco, Categoria categoria) {
        this.titulo = titulo;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Animes{" +
                "titulo='" + titulo + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }
}
