package br.com.caio.meuprojeto2;

public class FreteBasico extends Frete {

    public FreteBasico(int codigo, String descricao, double distanciaKm, double pesoKg, double valor) {
        super(codigo, descricao, distanciaKm, pesoKg, valor);
    }

    @Override
    public double calcularFrete() {
        return getValor();
    }
    
}
