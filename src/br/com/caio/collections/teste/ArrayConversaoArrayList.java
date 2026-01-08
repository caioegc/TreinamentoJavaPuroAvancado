package br.com.caio.collections.teste;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConversaoArrayList {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

       Integer[] ArrayToVetor =  numeros.toArray(new Integer[0]);

        System.out.println(Arrays.toString(ArrayToVetor));

        System.out.println("---");

        Integer[] arrayInt = new Integer[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        List<Integer> toArrayList = Arrays.asList(arrayInt);
        toArrayList.set(0, 15);
       // toArrayList.add(25); - erro se adicionar
        System.out.println(toArrayList);

        System.out.println("---");

        List<Integer> toArrayList2 = new ArrayList<>(Arrays.asList(arrayInt));
        toArrayList2.add(25);
        System.out.println(toArrayList2);


    }
}
