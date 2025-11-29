package src.br.com.caio.exception2;

public abstract class Frete {
//    código da entrega, descrição, distância (em quilômetros), peso da
//    carga (em quilogramas) e valor do frete básico.
 private int cod;
 private String descricao;
 private double distancia;
 private double peso;
 private double valor;

    public Frete(int cod, String descricao, double distancia, double peso, double valor) {
        this.cod = cod;
        this.descricao = descricao;
        this.distancia = distancia;
        this.peso = peso;
        this.valor = valor;
    }

    public abstract double calcularFrete();

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

