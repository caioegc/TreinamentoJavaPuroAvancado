package br.com.caio.exercicios.teste;

import br.com.caio.exercicios.entity.Categoria;
import br.com.caio.exercicios.entity.Produto;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteJava {


    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>(List.of(
                new Produto(1L, "Feijao", 15.00, Categoria.ALIMENTO),
                new Produto(2L, "Feijoada", 15.00, Categoria.ALIMENTO),
                new Produto(3L, "Sabonete", 2.00, Categoria.LIMPEZA),
                new Produto(54L, "Mandioca", 12.00, Categoria.MEIO_AMBIENTE),
                new Produto(100L, "Cerveja", 50.00, Categoria.MEIO_AMBIENTE)
        ));
        produtoList.sort(Comparator.comparing(Produto::getNome).thenComparing(Produto::getPreco));
        //produtoList.sort(Comparator.comparing(Produto::getPreco));
       // produtoList.sort(Comparator.comparing(Produto::getPreco).reversed());

        System.out.println(produtoList);

        Map<Categoria, List<Produto>> collect = produtoList.stream()
                .filter(a -> a.getPreco() > 20)
                .collect(Collectors.groupingBy(Produto::getCategoria));

        Stream<String> stringStream = produtoList.stream()
                .filter(a -> a.getPreco() > 20)
                .map(Produto::getNome);

        double sum = produtoList.stream()
                .filter(a -> a.getPreco() > 0)
                .mapToDouble(Produto::getPreco).sum();

        Produto max = produtoList.stream().max(Comparator.comparing(Produto::getPreco)).orElse(null);

        Produto maisBarato = produtoList.stream()
                .min(Comparator.comparing(Produto::getPreco))
                .orElse(null);




    }
}
