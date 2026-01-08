package br.com.caio.generics.service;

import br.com.caio.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {

    private List<Carro> carroDisponiveis = new ArrayList<>(
            List.of(new Carro("BMW"),
                    new Carro("Fiat")));

    public Carro buscarCarroDisponiveis(){
        System.out.println("Buscando carros disponiveis...");
        System.out.println(carroDisponiveis);
        Carro carro = carroDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carro disponivel para alugar: ");
        System.out.println(carroDisponiveis);
        return carro;
    }
    public void devolvereCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro: " + carro);
        carroDisponiveis.add(carro);
        System.out.println("Carros disponiveis parta alugar: ");
        System.out.println(carroDisponiveis);
    }
}
