package src.br.com.caio.exception2;

public class FreteMaritmo extends Frete{
    public FreteMaritmo(int cod, String descricao, double distancia, double peso, double valor) {
        super(cod, descricao, distancia, peso, valor);
    }

    public double calcularFrete(){

        return getValor() + (getDistancia() * 5) + (getPeso() * 1.5) + 300;
    }
}
