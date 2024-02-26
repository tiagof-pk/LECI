package aula08.ex1;

import aula08.ex1.Veiculos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa Empresa = new Empresa("Empresa", "3600-434", "empresa@mail.com");
        String matr = null;
        int op = -1;
        while (op != 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Veiculo");
            System.out.println("2 - Listar Viaturas");
            System.out.println("3 - Adicionar Trajeto");
            System.out.println("4 - Mostrar Último Trajeto");
            System.out.println("5 - Mostrar Distancia Percorrida");
            System.out.println("6 - Mostrar Autonomia de um Veiculo Eletrico");
            System.out.println("7 - Carregar um Veiculo Eletrico");


            System.out.println("0 - Sair");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Escolha uma opção:");
                    System.out.println("1 - Adicionar Mota");
                    System.out.println("2 - Adicionar Automovel");
                    System.out.println("3 - Adicionar Automovel Eletrico");
                    System.out.println("4 - Adicionar Taxi");
                    System.out.println("5 - Adicionar Pesado Mercadorias");
                    System.out.println("6 - Adicionar Pesado Passageiros");
                    System.out.println("7 - Adicionar Pesado Passageiros Eletrico");
                    op = sc.nextInt();
                    switch (op) {
                        case 1:

                            Motociclo mota = new Motociclo("01-AG-56", "ratata", "bmw", 125, "desportivo");
                            Empresa.addVeiculo(mota);
                            System.out.println(mota);
                            break;
                        case 3:
                            AutomovelLigeiroEletrico carroE = new AutomovelLigeiroEletrico("03-AG-56", "ratata", "bmw", 125, 1000, 200, 50);
                            Empresa.addVeiculo(carroE);
                            System.out.println(carroE);
                            break;
                        case 2:

                            AutomovelLigeiro carro = new AutomovelLigeiro("02-AG-56", "ratata", "bmw", 125, 1000, 200);
                            Empresa.addVeiculo(carro);
                            System.out.println(carro);
                            break;
                        case 4:

                            Taxi taxi = new Taxi("04-AG-56", "ratata", "bmw", 125, 1000, 200, 1234);
                            Empresa.addVeiculo(taxi);
                            System.out.println(taxi);
                            break;
                        case 5:
                            PesadoMercadorias pMercadorias = new PesadoMercadorias("05-AG-56", "ratata", "bmw", 125, 1000, 200, 5000);
                            Empresa.addVeiculo(pMercadorias);
                            System.out.println(pMercadorias);
                            break;
                        case 6:

                            PesadoPassageiros pPassageiros = new PesadoPassageiros("06-AG-56", "ratata", "bmw", 125, 1000, 200, 50);
                            Empresa.addVeiculo(pPassageiros);
                            System.out.println(pPassageiros);
                            break;
                        case 7:
                            PesadoPassageirosEletrico pPassageirosE = new PesadoPassageirosEletrico("07-AG-56", "ratata", "bmw", 125, 1000, 200, 50, 75);
                            Empresa.addVeiculo(pPassageirosE);
                            System.out.println(pPassageirosE);
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                }
                case 2 -> {

                    for (Veiculo x : Empresa.lst()) {
                        System.out.println(x);
                    }
                }
                case 3 -> {
                    System.out.println("Insira a Matricula do Veiculo:");
                    matr = sc.next();
                    System.out.println("Insira os Kilometros Percorridos");
                    int km = sc.nextInt();
                    for (Veiculo x : Empresa.lst()) {
                        if (x != null && matr.equals(x.getMatricula())) {

                            x.trajeto(km);
                            System.out.println("");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Insira a Matricula do Veiculo:");
                    matr = sc.next();
                    for (Veiculo x : Empresa.lst()) {
                        if (x != null && matr.equals(x.getMatricula())) {
                            System.out.println("Ultimo Trajeto Percorrido pelo carro com a matricula" + matr + "\n");
                            System.out.println(x.ultimoTrajeto());
                            System.out.println("");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Insira a Matricula do Veiculo:");
                    matr = sc.next();
                    for (Veiculo x : Empresa.lst()) {
                        if (x != null && matr.equals(x.getMatricula())) {
                            System.out.println("Distancia Total Percorrida pelo carro com a matricula" + matr + "\n");
                            System.out.println(x.distanciaTotal());
                            System.out.println("");
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Insira a Matricula do Veiculo:");
                    matr = sc.next();
                    for (Veiculo x : Empresa.lst()) {
                        if (!(x instanceof VeiculoEletrico y)) continue;
                        if (matr.equals(x.getMatricula())) {
                            System.out.println("Autonomia Total do Veiculo " + matr);
                            System.out.println(y.autonomia() + " Km");
                            System.out.println("");
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Insira a Matricula do Veiculo:");
                    matr = sc.next();
                    System.out.println("Insira a Percentagem Carregada");
                    int charge = sc.nextInt();
                    for (Veiculo x : Empresa.lst()) {
                        if (!(x instanceof VeiculoEletrico y))continue;
                        if (charge <= 0 || charge > 100) break;
                        else {
                            if (matr.equals(x.getMatricula())) {
                                y.carregar(charge);
                                System.out.println("");
                            }
                        }
                        }
                }
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
