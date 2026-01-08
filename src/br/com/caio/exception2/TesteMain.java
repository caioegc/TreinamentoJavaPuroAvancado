package src.br.com.caio.exception2;

import java.util.*;

public class TesteMain {
    public static void main(String[] args) {
        ArrayList<Frete> dadosFrete = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opc = -1;

        do {
            System.out.println("Menu de Opções:");
            System.out.println("1 - Cadastrar Frete");
            System.out.println("2 - Listar Fretes");
            System.out.println("3- Calcular o valor de um frete individual");
            System.out.println("4 - Comparar o valor do frete");
            opc = sc.nextInt();
            sc.nextLine();

            try {

                switch (opc) {
                    case 1:
                        System.out.println("Digite o codigo do frete:");
                        int codigo = sc.nextInt();
                        sc.nextLine();

                        // verificar código duplicado
                        for (Frete f : dadosFrete) {
                            if (f.getCod() == codigo) {
                                throw new CodigoFreteDuplicadoException();
                            }
                        }
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
                        if (tipoFrete == 1) {

                        } else if (tipoFrete == 2) {
                            Frete f = new FreteAereo(codigo, descricao, distancia, peso, valor);
                            dadosFrete.add(f);
                        } else if (tipoFrete == 3) {
                            Frete f = new FreteMaritmo(codigo, descricao, distancia, peso, valor);
                            dadosFrete.add(f);
                        } else if (tipoFrete == 4) {
                            Frete f = new FreteTerrestre(codigo, descricao, distancia, peso, valor);
                            dadosFrete.add(f);
                        } else {
                            System.out.println("Tipo de frete inválido.");
                        }
                        break;
                    case 2:
                        if (dadosFrete.isEmpty()) {
                            throw new ListaFretesVaziaException();
                        } else {
                            System.out.println("Lista de Fretes Cadastrados:");
                            for (Frete f : dadosFrete) {

                                System.out.println(f.getDescricao());
                                System.out.println(f.getDistancia());
                                System.out.println(f.getPeso());
                                System.out.println(f.getValor());
                                System.out.println(f.calcularFrete());
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Digite  codigo do frete para calcular o valor:");
                        int opcaoCodigo = sc.nextInt();
                        boolean encontrado = false;
                        if (dadosFrete.isEmpty()) {
                            throw new ListaFretesVaziaException();
                        } else {
                            for (Frete f : dadosFrete) {
                                if (f.getCod() == opcaoCodigo) {
                                    System.out.println("Valor do frete: " + f.calcularFrete());
                                    encontrado = true;
                                }
                            }
                        }
                        if (!encontrado) {
                            throw new FreteNaoEncontradoException();
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
                        Frete m = new FreteMaritmo(1, "Comparação", d, p, vb);
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

            } catch (FreteNaoEncontradoException e) {
                System.out.println("Tente novamente, colocando outro frete");
            } catch (CodigoFreteDuplicadoException e) {
                System.out.println("Coloque outro codigo ");
            } catch (ListaFretesVaziaException e) {
                System.out.println("não há dados");
            }
        } while (opc != 0) ;
        }
    }

