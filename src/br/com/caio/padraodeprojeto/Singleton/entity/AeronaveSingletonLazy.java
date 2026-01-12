package br.com.caio.padraodeprojeto.Singleton.entity;

import java.util.HashSet;
import java.util.Set;

public final class AeronaveSingletonLazy {

    private static  AeronaveSingletonLazy INSTANCE;

    private final Set<String> assento = new HashSet<>();
    private final String name;
    {
        assento.add("1A");
        assento.add("1B");

    }

    public static AeronaveSingletonLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AeronaveSingletonLazy("AIR15-AR");
        }
        return INSTANCE;
    }
    public AeronaveSingletonLazy(String name) {
        this.name = name;
    }

    public boolean reservarAssento(String assentos){
        return assento.remove(assentos);
    }


}
