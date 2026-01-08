package src.br.com.caio.InterfacePoo;

public class Pato extends Animal{
    public Pato(String nome, int idade, double peso, double tamanho) {
        super(nome, idade, peso, tamanho);
    }

    @Override
    public void andar() {
        super.andar();
    }

    @Override
    public void nadar() {
        super.nadar();
    }

    @Override
    public void voar() {
        super.voar();
    }
}
