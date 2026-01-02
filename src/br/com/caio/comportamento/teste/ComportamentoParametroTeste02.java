package br.com.caio.comportamento.teste;

import br.com.caio.comportamento.dominio.Car;
import br.com.caio.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoParametroTeste02 {
    private static List<Car> car2 = List.of(
            new Car("Branco", 2005),
            new Car("Preto", 2002),
            new Car("Vermelho", 2017));

    public static void main(String[] args) {
    List<Car> listCar =  filtrar(car2, new CarPredicate() {
        @Override
        public boolean test(Car car) {
            return car.getCor().equals("Vermelho");
        }
    }
    );
        List<Car> listCar2 =  filtrar(car2, cars -> cars.getCor().equals("Vermelho"));
        List<Car> listCar3 =  filtrar(car2, cars -> cars.getCor().equals("Preto"));
        List<Car> listCar4 =  filtrar(car2, cars -> cars.getAno() < 2015);
        System.out.println(listCar2);
        System.out.println(listCar3);
        System.out.println(listCar4);
}

    private static List<Car> filtrar(List<Car> car, CarPredicate carPredicate) {
        List<Car> filtrarCarro = new ArrayList<>();
        for (Car c : car) {
            if (carPredicate.test(c)) {
                filtrarCarro.add(c);
            }
        }
        return filtrarCarro;

}}