package br.com.caio.streams.teste;

import br.com.caio.streams.dominio.Animes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStream07 {

    private static List<Integer> nums  = new ArrayList<>(List.of(10, 15, 20, 25, 5
    ));

    public static void main(String[] args) {
       nums.stream()
               .reduce((a, b) -> a + b).ifPresent(System.out::println); //reduce = reduz a lista até se transformarem em apenas 1

        nums.stream()
                .reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println(nums.stream()
                .reduce( 0 , (a, b) -> a + b)); //se por o zero antes n precisa ser um optional (ifpresente)


        nums.stream().reduce((a, b) -> a > b ? a : b ).ifPresent(System.out::println); // aqui pega o maior numero
        System.out.println(nums.stream().reduce(0, (Integer::max)));
    }
}