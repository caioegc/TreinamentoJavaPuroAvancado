package br.com.caio.padraodeprojeto.Singleton.teste;

import br.com.caio.padraodeprojeto.Singleton.entity.Aeronave;
import br.com.caio.padraodeprojeto.Singleton.entity.AeronaveSingletonReaver;

public class TesteAeronaveSingleton01 {
    public static void main(String[] args) {
        reservarAssento("1A");
        reservarAssento("1A");
    }

    private static void reservarAssento(String assentos){
        System.out.println(AeronaveSingletonReaver.getInstance());
        AeronaveSingletonReaver aeronave =  AeronaveSingletonReaver.getInstance();
        System.out.println(aeronave.reservarAssento(assentos));
    }
}
