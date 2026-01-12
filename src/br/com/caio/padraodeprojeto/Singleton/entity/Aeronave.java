package br.com.caio.padraodeprojeto.Singleton.entity;

import java.util.HashSet;
import java.util.Set;

public final class Aeronave {

    private final Set<String> assento = new HashSet<>();
        private final String name;
    {
        assento.add("1A");
        assento.add("1B");

    }

    public Aeronave(String name) {
        this.name = name;
    }

    public boolean reservarAssento(String assentos){
        return assento.remove(assentos);
    }
}
