package br.com.caio.classesInternas;


class Animal{

    public void andar(){
        System.out.println("Animal andando...");
    }
}

public class AnonimaClasse {

//    public class Cachorro extends Animal{
//        @Override
//        public void andar() {
//            System.out.println("Cachorro andando...");
//        }
//    }

    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void andar() {
                System.out.println("Cachorro andando...");
            }
        };

        Animal animal2 = new Animal(){
            @Override
            public void andar() {
                System.out.println("Gato andando...");
            }
        };
        animal.andar();
        animal2.andar();


    }
}
