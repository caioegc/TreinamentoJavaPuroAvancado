package br.com.caio.meuprojeto;

import java.util.*;

public class exercicio1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Conta> dadosContas = new ArrayList<>();
    int opc = -1;

    do{
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar nova conta");
        System.out.println("2. Realizar um Depósito");
        System.out.println("3. Realizar um Saque");
        System.out.println("4. Transferir valores entre duas contas");
        System.out.println("5 - Atualizar todas as contas");
        System.out.println("0 - Sair");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc) {
            case 1:
                System.out.println("Digite o nome do titular da conta:");
                String nome = sc.nextLine();
                System.out.println("Digite o número da conta:");
                int numeroConta = sc.nextInt();
                System.out.println("Qual o tipo de conta? (1 - Conta Corrente / 2 - Conta Poupança)");
                int tipoConta = sc.nextInt();
                sc.nextLine();
                if(tipoConta == 1){
                    ContaCorrente cc = new ContaCorrente(nome, numeroConta);
                    dadosContas.add(cc);
                } else if (tipoConta == 2){
                    ContaPoupanca cp = new ContaPoupanca(nome, numeroConta);
                    dadosContas.add(cp);
                } else{
                    System.out.println("Tipo de conta inválido.");
                }
                break;
            case 2:
                boolean encontrar = false;
                System.out.println("Digite o numero da sua conta para fazer o deposito: ");
                int numContaDep = sc.nextInt();
                sc.nextLine();
                for(Conta c : dadosContas){
                    if(c.getNumeroConta() == numContaDep){
                        System.out.println("Digite o valor do depósito");
                        double valorDep = sc.nextDouble();
                        sc.nextLine();
                        c.depositar(valorDep);
                        encontrar = true;
                        System.out.println("Depósito realizado com sucesso!\n" + " Novo saldo: " + c.getSaldo());
    
                    }
                }
                if(!encontrar){
                    System.out.println("Conta não encontrada.");
                }  
                break;

            case 3:
                encontrar = false;
                System.out.println("Digite o numero da sua conta para fazer o saque: ");
                int numContaSaq = sc.nextInt();
                sc.nextLine();
                for(Conta c : dadosContas){
                    if(c.getNumeroConta() == numContaSaq){
                        System.out.println("Digite o valor do saque");
                        double valorSaq = sc.nextDouble();
                        sc.nextLine();
                        c.sacar(valorSaq);
                        encontrar = true;
                        System.out.println("Saque realizado com sucesso!\n" + " Novo saldo: " + c.getSaldo());
    
                    }
                }
                if(!encontrar){
                    System.out.println("Conta não encontrada.");
                }
                break;
                case 4:
                encontrar = false;
                System.out.println("Digite o numero da sua conta para fazer a transferência: ");
                int numContaTransfOrigem = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o numero da conta de destino para fazer a transferência: ");
                int numContaTransfDestino = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o valor da transferência");
                double valorTransf = sc.nextDouble();
                sc.nextLine();
                Conta contaOrigem = null;
                Conta contaDestino = null;
                for(Conta c : dadosContas){
                    if(c.getNumeroConta() == numContaTransfOrigem){
                        contaOrigem = c;
                    }
                    if(c.getNumeroConta() == numContaTransfDestino){
                        contaDestino = c;
                    }
                }
                if(contaOrigem != null && contaDestino != null){
                    contaOrigem.sacar(valorTransf);
                    contaDestino.depositar(valorTransf);
                    System.out.println("Transferência realizada com sucesso!");
                } else{
                    System.out.println("Conta de origem ou destino não encontrada.");
                }
                break;
            case 5:
                for(Conta c : dadosContas){
                    c.atualizar();
                    System.out.println("Conta: " + c.getNumeroConta() + " - Novo saldo após atualização: " + c.getSaldo());
                }
                break;
                case 0:
                System.out.println("Saindo...");
            default:
                System.out.println("Opção inválida.");
        }


    }while(opc != 0);

}
}