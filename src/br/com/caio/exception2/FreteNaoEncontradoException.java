package src.br.com.caio.exception2;

public class FreteNaoEncontradoException extends RuntimeException{

    public FreteNaoEncontradoException(){

    }

    public FreteNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}
