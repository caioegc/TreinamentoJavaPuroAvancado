package br.com.caio.classesInternas;

public class ExternaClass {
    public String texto = "caio";

    class InternaClasse{

        public void imprimirNomeExterna(){
            System.out.println(texto);
            System.out.println(this);
        }

    }

    public static void main(String[] args) {
        ExternaClass externaClass = new ExternaClass();
       InternaClasse inner = externaClass.new InternaClasse();

       InternaClasse inner2 = new ExternaClass().new InternaClasse();

        inner.imprimirNomeExterna();
        inner2.imprimirNomeExterna();
    }
}
