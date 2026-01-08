package br.com.caio.collections.teste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest2 {
    public static void main(String[] args) {
        List<String> celular = new ArrayList<>();
        celular.add("Samsung");
        celular.add("Iphone");
        celular.add("Motorola");
        celular.add("LG");
        celular.add("Xiaomi");

        System.out.println(celular);
        System.out.println("---");

        Iterator<String> it = celular.iterator();
        while(it.hasNext()){
            if(it.next().equals("LG")){
                it.remove();
            }
        }
        celular.removeIf(c -> c.equals("LG"));
        System.out.println(celular);

    }
}
