package br.com.caio.meuprojeto2;

public class FreteMaritimo extends Frete {

    public FreteMaritimo(int codigo, String descricao, double distanciaKm, double pesoKg, double valor) {
        super(codigo, descricao, distanciaKm, pesoKg, valor);
       
    }

    @Override
    public double calcularFrete() {
        //valorFreteBasico + (distância × 5.0) + (peso × 1.5) + 300 (taxa portuária fixa);
        return getValor() + (getDistanciaKm() * 5.0) + (getPesoKg() * 1.5) + 300;     
    }
    
}
