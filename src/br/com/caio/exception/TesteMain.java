package src.br.com.caio.exception;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteMain {
    public static void main(String[] args) {
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaBancaria> dados = new ArrayList<>();


        do {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Realizar Saque");
            System.out.println("3. Realizar um Depósito");
            System.out.println("4. Transferir valores entre duas contas");
            System.out.println("5. Atualizar todas as contas");
            System.out.println("0. Sair");
            opc = sc.nextInt();
            sc.nextLine();

            try {
                switch (opc) {
                    case 1:
                        System.out.println("Digite o nome: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite o num da conta");
                        int num = sc.nextInt();
                        System.out.println("Qual o tipo da conta? (1. Corrente/2. Poupança) ");
                        int opcC = sc.nextInt();
                        if (opcC == 1) {
                            ContaBancaria conta = new ContaCorrente(nome, num);
                            dados.add(conta);
                        } else if (opcC == 2) {
                            ContaBancaria conta = new ContaPoupanca(nome, num);
                            dados.add(conta);
                        } else {
                            System.out.println("Opção inválida! Tente novamente!");
                            break;
                        }
                        break;

                    case 2:
                        System.out.println("Qual o numero da sua conta?");
                        int procurarConta = sc.nextInt();
                        boolean achar = false;
                        for (ContaBancaria c : dados) {
                            if (procurarConta == c.getNum()) {
                                System.out.println("Qual valor gostaria de sacar?");
                                double valor = sc.nextDouble();
                                c.sacar(valor);
                                System.out.println("Valor sacado com sucesso!");
                                System.out.println("Seu novo saldo: " + c.getSaldo());
                                achar = true;
                            }
                        }
                        if(!achar){
                            System.out.println("Não encontrado");
                        }
                        break;

                    case 3:
                        System.out.println("Qual o numero da sua conta?");
                        int procurarConta2 = sc.nextInt();
                        boolean achar2 = false;
                        for (ContaBancaria c : dados) {
                            if (procurarConta2 == c.getNum()) {
                                System.out.println("Qual valor gostaria de depositar?");
                                double valor = sc.nextDouble();
                                c.depositar(valor);
                                System.out.println("Valor depositado com sucesso!");
                                System.out.println("Seu novo saldo: " + c.getSaldo());
                                achar2 = true;
                            }
                        }
                        if (!achar2) {
                            System.out.println("Não encontrado! ");
                        }
                        break;
                    case 4:
                        System.out.println("Digite o valor a ser transferido");
                        double valorTrans = sc.nextDouble();
                        System.out.println("Digite o numero da conta de origem");
                        int numContaOrigem = sc.nextInt();
                        System.out.println("Digite o numero da conta de destino");
                        int numContaDestino = sc.nextInt();
                        sc.nextLine();

                        ContaBancaria contaOrigem = null;
                        ContaBancaria contaDestino = null;

                        for (ContaBancaria c : dados){
                            if(numContaOrigem == c.getNum()){
                                contaOrigem = c;
                            }
                            if(numContaDestino == c.getNum()){
                                contaDestino = c;
                            }
                        }

                        if (contaOrigem == null || contaDestino == null) {
                            System.out.println("Uma das contas não foi encontrada!");
                            break;
                        }

                        contaOrigem.transferir(contaDestino, valorTrans);

                        System.out.println("Transferência realizada com sucesso!");
                        System.out.println("Saldo da conta de origem: " + contaOrigem.getSaldo());
                        System.out.println("Saldo da conta de destino: " + contaDestino.getSaldo());
                        break;

                    case 5:
                        for(ContaBancaria c : dados){
                            c.atualizar();
                            System.out.println("Saldo atualizado com sucesso!");
                        }
                        break;
                    case 0:
                        System.out.println("Saindo....");
                        break;
                    default:
                        System.out.println("Valor invalido!");
                        break;
                }
            }catch (SaldoInsuficienteException e){
                System.out.println("Saldo insuficiente");
            } catch (ValorInvalidoException e) {
                System.out.println("Valor inválido tente novamente!");
            }
        } while (opc != 0) ;

        }
    }

