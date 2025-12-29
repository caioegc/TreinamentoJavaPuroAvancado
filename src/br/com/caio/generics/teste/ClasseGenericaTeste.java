package br.com.caio.generics.teste;

import br.com.caio.generics.dominio.Barco;
import br.com.caio.generics.dominio.Carro;
import br.com.caio.generics.service.BarcoRentavelService;
import br.com.caio.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(
                List.of(new Carro("BMW"),
                        new Carro("Fiat")));
        List<Barco> barcos = new ArrayList<>(
                List.of(new Barco("Lancha"),
                        new Barco("Canoa")));



        RentalService<Carro> rentalService = new RentalService<>(carros);
        Carro carro = rentalService.buscarAutomoveisDisponiveis();
        System.out.println("Alugando carro por 1 mês...");
        rentalService.devolvereAutomoveisAlugado(carro);

        System.out.println("-----");
        System.out.println();

        RentalService<Barco> rentalService2 = new RentalService<>(barcos);
        Barco barco = rentalService2.buscarAutomoveisDisponiveis();
        System.out.println("Alugando barco por 1 mês...");
        rentalService2.devolvereAutomoveisAlugado(barco);




    }
}
