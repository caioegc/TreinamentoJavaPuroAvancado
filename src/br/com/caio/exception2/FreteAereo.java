package src.br.com.caio.exception2;

public class FreteAereo extends Frete {
    public FreteAereo(int cod, String descricao, double distancia, double peso, double valor) {
        super(cod, descricao, distancia, peso, valor);
    }
    @Override
    public double calcularFrete(){
        return getValor() + (getDistancia() * 10) + (getPeso() * 8.0) + 1000;
    }
}
