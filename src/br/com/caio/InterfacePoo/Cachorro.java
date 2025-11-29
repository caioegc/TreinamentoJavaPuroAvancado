package src.br.com.caio.InterfacePoo;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade, double peso, double altura){
        super(nome, idade, peso, altura);
    }

    @Override
        public void andar(){
        super.andar();
    }

    @Override
    public void nadar() {
        super.nadar();
    }
}
