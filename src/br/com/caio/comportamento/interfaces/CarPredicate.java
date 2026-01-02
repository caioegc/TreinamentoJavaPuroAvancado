package br.com.caio.comportamento.interfaces;

import br.com.caio.comportamento.dominio.Car;

public interface CarPredicate {
    boolean test(Car car);
}
