package src.br.com.caio.exception;

public class SaldoInsuficienteException extends IllegalArgumentException{
    public SaldoInsuficienteException(){
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
