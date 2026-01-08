package br.com.caio.generics.teste;

abstract class Animal{
    private String nome;
    private String idade;

    public Animal() {
    }

    public Animal(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void consultar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
 class Cachorro extends Animal{

     public Cachorro() {
     }

     public Cachorro(String nome, String idade) {
         super(nome, idade);
     }

     @Override
    public void consultar() {
         System.out.println("Consultando doguinho... " + getNome());
     }
 }

class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nome, String idade) {
        super(nome, idade);
    }

    @Override
    public void consultar() {
        System.out.println("Consultando gatinho... " + getNome());
    }
}

public class WildCardTest {
    public static void main(String[] args) {
    Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
    Gato[] gatos = {new Gato(), new Gato()};
    consultaPrint(cachorros);
    consultaPrint(gatos);

    }

    private static void consultaPrint(Animal[] animal) {
        for(Animal animals : animal){
            animals.consultar();

        }
    }
}