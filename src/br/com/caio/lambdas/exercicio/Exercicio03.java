package br.com.caio.lambdas.exercicio;

public class Exercicio03 {
    public static void main(String[] args) {
        Calcular soma = (a, b) -> a + b;
        Calcular sub = (a, b) -> a - b;
        Calcular mult = (a, b) -> a * b;
        Calcular div = (a, b) -> a / b;

        System.out.println(soma.calcular(15, 20));
        System.out.println(sub.calcular(50, 20));
        System.out.println(mult.calcular(15, 20));
        System.out.println(div.calcular(30, 30));
    }
}
