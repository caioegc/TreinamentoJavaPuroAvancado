package br.com.caio.meuprojeto2;

public abstract class Frete {
    private int codigo;
    private String descricao;
    private double distanciaKm;
    private double pesoKg;
    private double valor;


    public Frete(int codigo, String descricao, double distanciaKm, double pesoKg, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.distanciaKm = distanciaKm;
        this.pesoKg = pesoKg;
        this.valor = valor;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double calcularFrete();

}
