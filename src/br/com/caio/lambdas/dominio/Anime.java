package br.com.caio.lambdas.dominio;

public class Anime {
   private String nome;
   private int episodios;

    public Anime(String nome, int episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", episodios=" + episodios +
                '}';
    }
}
