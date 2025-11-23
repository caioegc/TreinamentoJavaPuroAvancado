package br.com.caio.meuprojeto2;

public class FreteAereo extends Frete{
    public FreteAereo(int codigo, String descricao, double distanciaKm, double pesoKg, double valor) {
        super(codigo, descricao, distanciaKm, pesoKg, valor);
        
    }

    @Override
    public double calcularFrete() {
       // valorFreteBasico + (distância × 10.0) + (peso × 8.0) + 1000 (taxa fixa de combustível);
        return getValor() + (getDistanciaKm() * 10.0) + (getPesoKg() * 8.0) + 1000;
    }
    
}
