package br.com.caio.comportamento.teste;

import br.com.caio.comportamento.dominio.Car;
import br.com.caio.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoParametroTeste03 {
    private static List<Car> car2 = List.of(
            new Car("Branco", 2005),
            new Car("Preto", 2002),
            new Car("Vermelho", 2017));

    public static void main(String[] args) {
        List<Car> listCar2 =  filtrar(car2, cars -> cars.getCor().equals("Vermelho"));
        List<Car> listCar3 =  filtrar(car2, cars -> cars.getCor().equals("Preto"));
        List<Car> listCar4 =  filtrar(car2, cars -> cars.getAno() < 2015);
        System.out.println(listCar2);
        System.out.println(listCar3);
        System.out.println(listCar4);
        List<Integer> integerList = List.of(1,2,3,4,5,655,7);
        List<Integer> listNum = filtrar(integerList, nums -> nums < 10);
        List<Integer> listNum2 = filtrar(integerList, nums -> nums % 2 == 0 );
        System.out.println(listNum);
        System.out.println(listNum2);
}

    private static<T> List<T> filtrar(List<T> car, Predicate<T> predicate) {
        List<T> listVermelhaFiltrar = new ArrayList<>();
        for (T t : car){
        if(predicate.test(t)){
            listVermelhaFiltrar.add(t);
        }
        }
        return listVermelhaFiltrar;
}
}