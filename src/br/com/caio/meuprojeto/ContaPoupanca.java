package br.com.caio.meuprojeto;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String nome, int numeroConta){
        super(nome, numeroConta);
    }

@Override
public void atualizar(){
        double novoSaldo = getSaldo() + (getSaldo()*getTaxaOperacao());
        setSaldo(novoSaldo);
 }
}
 

