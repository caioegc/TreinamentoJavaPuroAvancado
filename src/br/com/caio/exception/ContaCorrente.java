package src.br.com.caio.exception;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String nome, int num){
        super(nome, num);
    }

    @Override
    public double atualizar(){
        double transacao = getSaldo() - (getSaldo() * getTaxa());
        setSaldo(transacao);
        return getSaldo();
    }
}
