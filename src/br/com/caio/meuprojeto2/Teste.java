package br.com.caio.meuprojeto2;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Frete> dadosFrete = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opc = -1;

        do{
                System.out.println("Menu de Opções:");
                System.out.println("1 - Cadastrar Frete");
                System.out.println("2 - Listar Fretes");
                System.out.println("3- Calcular o valor de um frete individual");
                System.out.println("4 - Comparar o valor do frete");
                opc = sc.nextInt();
                sc.nextLine();

                switch(opc){
                    case 1:
                        System.out.println("Digite o codigo do frete:");
                        int codigo = sc.nextInt();
                        System.out.println("Descrição do frete: ");
                        String descricao = sc.nextLine();
                        System.out.println("Digite o peso do frete (kg):");
                        double peso = sc.nextDouble();
                        System.out.println("Digite a distância do frete (km):");
                        double distancia = sc.nextDouble();
                        System.out.println("Valor do frete: ");
                        double valor = sc.nextDouble();
                        System.out.println("Qual tipo de frete? (1- Normal, 2-Aereo, 3-Maritimo, 4-Terrestre)");
                        int tipoFrete = sc.nextInt();
                        if(tipoFrete == 1){
                            Frete f = new FreteBasico(codigo, descricao, distancia, peso,valor);
                            dadosFrete.add(f);
                        } else if(tipoFrete == 2){
                            Frete f = new FreteAereo(codigo, descricao, distancia, peso, valor);
                            dadosFrete.add(f);
                        } else if(tipoFrete == 3){
                            Frete f = new FreteMaritimo(codigo, descricao, distancia, peso, valor);
                            dadosFrete.add(f);
                        } else if(tipoFrete == 4){
                            Frete f = new FreteTerrestre(codigo, descricao, distancia, peso, valor);
                            dadosFrete.add(f);
                        } else {
                            System.out.println("Tipo de frete inválido.");
                        }
                        break;
                        case 2:
                            System.out.println("Lista de Fretes Cadastrados:");
                            for(Frete f : dadosFrete){
                                    System.out.println(f.getDescricao());
                                    System.out.println(f.getDistanciaKm());
                                    System.out.println(f.getPesoKg());
                                    System.out.println(f.getValor());
                                    System.out.println(f.calcularFrete());
                            }

                            case 3:
                                System.out.println("Digite  codigo do frete para calcular o valor:");
                                int opcaoCodigo = sc.nextInt();
                                boolean encontrado = false;
                                for(Frete f : dadosFrete){
                                    if(f.getCodigo() == opcaoCodigo){
                                        System.out.println("Valor do frete: " + f.calcularFrete());
                                        encontrado = true;
                                    }
                                    else{
                                        System.out.println("Frete não encontrado.");
                                    }
                                
                                    }
                                        if(!encontrado){
                                        System.out.println("Não encontrado");
                                    }
                                        break;

                                    case 4:
                                        System.out.print("Distância (km): ");
                    double d = sc.nextDouble();

                    System.out.print("Peso (kg): ");
                    double p = sc.nextDouble();

                    System.out.print("Valor básico: ");
                    double vb = sc.nextDouble();

                    Frete t = new FreteTerrestre(1, "Comparação", d, p, vb);
                    Frete m = new FreteMaritimo(1, "Comparação", d, p, vb);
                    Frete a = new FreteAereo(1, "Comparação", d, p, vb);

                    System.out.println("\n== Comparação ==");
                    System.out.println("Terrestre: " + t.calcularFrete());
                    System.out.println("Marítimo:  " + m.calcularFrete());
                    System.out.println("Aéreo:     " + a.calcularFrete());
                    break;
                    case 0:
                        System.out.println("Saindo do programa.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }


        }while(opc != 0);
    }
}
