package br.com.caio.classesInternas;

public class ExternaClass02 {

    private String nome = "Midorya";

    void print(){
        class LocalClass{
            public void print(){
                System.out.println(nome);
            }
        }
       LocalClass lc = new LocalClass();
        lc.print();
    }


    public static void main(String[] args) {
        ExternaClass02 externaClass = new ExternaClass02();
        externaClass.print();
    }

    }


