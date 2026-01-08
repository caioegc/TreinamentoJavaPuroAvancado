package br.com.caio.collections.exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Pessoa> pessoa = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Procurar pessoa por CPF");
            System.out.println("3. Listar pessoa");
            System.out.println("4. Deletar pessoa do set");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Digite o cpf da pessoa cadastrada:");
                    String cpf = sc.next();
                    System.out.println("Digite o nome da pessoa cadastrada:");
                    String nome = sc.next();
                    System.out.println("Digite a idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    Pessoa pessoa1 = new Pessoa(nome, cpf, idade);
                    if(pessoa.add(pessoa1)){
                        System.out.println("Cadastrado com sucesso");
                    } else{
                        System.out.println("Dados duplicados, não é possivel cadastrar!");
                    }
                    break;
                case 2:
                    System.out.println("Digite o cpf da pessoa que você quer ver");
                    String procurarCpf = sc.next();
                    for(Pessoa p : pessoa){
                        if(procurarCpf.equals(p.getCpf())) System.out.println(p);
                    }
                    break;
                case 3:
                    for (Pessoa p : pessoa){
                        System.out.println(p);
                    }
                    break;
                case 4:
                    System.out.println("Digite o cpf da pessoa que você quer ver");
                    String procurarCpf2 = sc.next();
                    boolean removido = false;
                    Iterator<Pessoa> it = pessoa.iterator();
                    while(it.hasNext()){
                        Pessoa p = it.next();
                        if(procurarCpf2.equals(p.getCpf())){
                            it.remove();
                            removido = true;
                            break;
                        }
                    }
                    if (removido) {
                        System.out.println("Pessoa removida com sucesso!");
                    } else {
                        System.out.println("CPF não encontrado!");
                    }
                    break;

            }
        } while(opc != 0);
    }
}
