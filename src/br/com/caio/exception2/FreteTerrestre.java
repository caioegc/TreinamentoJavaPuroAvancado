package src.br.com.caio.exception2;

public class FreteTerrestre extends Frete{
    public FreteTerrestre(int cod, String descricao, double distancia, double peso, double valor) {
        super(cod, descricao, distancia, peso, valor);
    }

    public double calcularFrete(){

        return getValor() + (getDistancia() * 3.5) + (getPeso() * 2.0);
    }
}
