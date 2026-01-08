package br.com.caio.comportamento.dominio;

public class Car {
    private String nome = "Audi";
    private String cor;
    private int ano;

    public Car(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
