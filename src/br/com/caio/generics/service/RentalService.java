package br.com.caio.generics.service;

import br.com.caio.generics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> automoveisDisponiveis;

    public RentalService(List<T> automoveisDisponiveis) {
        this.automoveisDisponiveis = automoveisDisponiveis;
    }

    public T buscarAutomoveisDisponiveis(){
        System.out.println("Buscando automovel disponiveis...");
        System.out.println(automoveisDisponiveis);
        T t = automoveisDisponiveis.remove(0);
        System.out.println("Alugando automovel: " + t);
        System.out.println("Automovel disponivel para alugar: ");
        System.out.println(automoveisDisponiveis);
        return t;
    }
    public void devolvereAutomoveisAlugado(T t){
        System.out.println("Devolvendo automovel: " + t);
        automoveisDisponiveis.add(t);
        System.out.println("Carros disponiveis parta alugar: ");
        System.out.println(automoveisDisponiveis);
    }
}
