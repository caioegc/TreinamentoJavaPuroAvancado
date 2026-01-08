package src.br.com.caio.exception;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String nome, int num) {
        super(nome, num);
    }

    @Override
    public double atualizar(){
        double taxaSaldo = getSaldo() + (getTaxa() * getSaldo());
        setSaldo(taxaSaldo);
        return getSaldo();
    }
}
