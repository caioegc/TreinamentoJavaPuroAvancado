package br.com.caio.collections.teste;
import java.util.*;

public class TesteHashMap {
    public static void main(String[] args) {
        Map<String, Integer> idade = new HashMap<>();

        idade.put("Caio", 23);
        idade.put("Eliene", 46);
        idade.put("Andre", 57);
        idade.put("Rafael", 21);
        idade.put("Gabriel", 21);
        idade.put("Caio", 25);

        idade.computeIfAbsent("Caio", k -> 22);

        System.out.println(idade);

        for(String key : idade.keySet()){
            System.out.println(key + " = " + idade.get(key));
        }

        System.out.println();

        for(Integer value : idade.values()){
            System.out.println(value);
        }

        System.out.println();

        for(Map.Entry<String, Integer> entry: idade.entrySet()){
            System.out.println(entry);
        }

    }
}
