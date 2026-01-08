package src.br.com.caio.exception;

public class ValorInvalidoException extends IllegalArgumentException{
    public ValorInvalidoException(){
    }

    public ValorInvalidoException(String mensagem){
        super(mensagem);
    }
}
