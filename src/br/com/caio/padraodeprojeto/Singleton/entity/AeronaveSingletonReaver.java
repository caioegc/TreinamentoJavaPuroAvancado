package br.com.caio.padraodeprojeto.Singleton.entity;

import java.util.HashSet;
import java.util.Set;

public final class AeronaveSingletonReaver {

    private static final AeronaveSingletonReaver INSTANCE = new AeronaveSingletonReaver("ar15-AR");

    private final Set<String> assento = new HashSet<>();
    private final String name;
    {
        assento.add("1A");
        assento.add("1B");

    }

    public static AeronaveSingletonReaver getInstance(){
        return INSTANCE;
    }

    public AeronaveSingletonReaver(String name) {
        this.name = name;
    }

    public boolean reservarAssento(String assentos){
        return assento.remove(assentos);
    }


}
