package src.br.com.caio.exception2;

public class ListaFretesVaziaException extends RuntimeException {
    public ListaFretesVaziaException(){

    }
    public ListaFretesVaziaException(String mensagem){
        super(mensagem);
    }
}
