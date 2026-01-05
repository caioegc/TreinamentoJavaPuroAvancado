package br.com.caio.lambdas.exercicio;

public class ExercicioLambda {
    public static void main(String[] args) {

        int soma = calcular(15, 20, (x, y)->  x + y);
        int soma2 = calcular(20, 10, (x, y)->  x - y);
        int soma3 = calcular(5, 5, (x, y)->  x * y);
        System.out.println(soma);
        System.out.println(soma2);
        System.out.println(soma3);
    }

    private static int calcular(int a, int b, Calcular c){
        return c.calcular(a , b);
    }


}
