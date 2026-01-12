package br.com.caio.padraodeprojeto.Singleton.teste;

import br.com.caio.padraodeprojeto.Singleton.entity.Aeronave;

import java.sql.SQLOutput;

public class TesteAeronave {
    public static void main(String[] args) {
        reservarAssento("1A");
        reservarAssento("1A");
    }

    private static void reservarAssento(String assentos){
        Aeronave aeronave = new Aeronave("AN15-Ar");
        System.out.println(aeronave.reservarAssento(assentos));
    }
}
