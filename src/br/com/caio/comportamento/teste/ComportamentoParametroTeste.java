package br.com.caio.comportamento.teste;

import br.com.caio.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoParametroTeste {
    private static List<Car> car2 = List.of(
            new Car("Branco", 2005),
            new Car("Preto", 2002),
            new Car("Vermelho", 2017));

    public static void main(String[] args) {
        System.out.println(filtrarCarroVermelho(car2));
        System.out.println();
        System.out.println(filtrarCarro(car2, "Preto"));
        System.out.println();
        System.out.println(filtrarCarroPorAno(car2, 2010));
    }

    private static List<Car> filtrarCarroVermelho(List<Car> car) {
        List<Car> carrosVermelhos = new ArrayList<>();
        for (Car c : car) {
            if (c.getCor().equals("Vermelho")) {
                carrosVermelhos.add(c);
            }
        }
        return carrosVermelhos;
    }

    private static List<Car> filtrarCarro(List<Car> car, String cor) {
        List<Car> carrosVermelhos = new ArrayList<>();
        for (Car c : car) {
            if (c.getCor().equals(cor)) {
                carrosVermelhos.add(c);
            }
        }
        return carrosVermelhos;
    }

    private static List<Car> filtrarCarroPorAno(List<Car> car, int ano) {
        List<Car> carrosVermelhos = new ArrayList<>();
        for (Car c : car) {
            if (c.getAno() < ano) {
                carrosVermelhos.add(c);
            }
        }
        return carrosVermelhos;
    }


}