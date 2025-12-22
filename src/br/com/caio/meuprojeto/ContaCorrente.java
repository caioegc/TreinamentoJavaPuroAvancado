package br.com.caio.meuprojeto;

public class ContaCorrente extends Conta{
public ContaCorrente(String nome, int numeroConta) {
    super(nome, numeroConta);  
}

@Override
public void atualizar(){
        double novoSaldo = getSaldo() - (getSaldo()*getTaxaOperacao());
        setSaldo(novoSaldo);
 }

}