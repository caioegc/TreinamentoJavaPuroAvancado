package src.br.com.caio.InterfacePoo;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteMain {
   public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> dados = new ArrayList<>();
        int opc = 0;
        do {
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    String nome = sc.nextLine();
                    int idade = sc.nextInt(); sc.nextLine();
                    double peso = sc.nextDouble(); sc.nextLine();
                    double altura = sc.nextDouble();
                    Animal an = new Animal(nome, idade, peso, altura);
                    dados.add(an);
                    break;
                case 2:

            }

        } while (opc != 0);
    }
}