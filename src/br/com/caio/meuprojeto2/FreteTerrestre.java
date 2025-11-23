package br.com.caio.meuprojeto2;

public class FreteTerrestre extends Frete {
    
public FreteTerrestre(int codigo, String descricao, double distanciaKM, double pesoKg, double valor){
    super(codigo, descricao, distanciaKM, pesoKg, valor);
}

@Override
public double calcularFrete(){
    //valorFreteBasico + (distância × 3.5) + (peso × 2.0);
    return getValor() + (getDistanciaKm() * 3.5) + (getPesoKg() * 2.0);
    
}

}
