package aula7;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        Circulo[] circulos = new Circulo[10];
        Triangulo[] triangulos = new Triangulo[10];
        Retangulo[] retangulos = new Retangulo[10];
        int contcirc = 0;
        int conttria = 0;
        int contreta = 0;
        while (opcao != 6) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Adicionar círculo");
                System.out.println("2 - Adicionar triângulo");
                System.out.println("3 - Adicionar retângulo");
                System.out.println("4 - Listar figuras");
                System.out.println("5 - Comparar figuras");
                System.out.println("6 - Sair");

                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Insira o raio do círculo:");
                        double raio = input.nextDouble();
                        System.out.println("Insira a cor da figura figura:");
                        String cc = input.nextLine();
                        Circulo circulo = new Circulo(raio, cc);
                        circulos[contcirc] = circulo;
                        contcirc++;
                        break;
                    case 2:
                        System.out.println("Insira o lado 1 do triângulo:");
                        double lado1 = input.nextDouble();
                        System.out.println("Insira o lado 2 do triângulo:");
                        double lado2 = input.nextDouble();
                        System.out.println("Insira o lado 3 do triângulo:");
                        double lado3 = input.nextDouble();
                        System.out.println("Insira a cor da figura figura:");
                        String ct = input.nextLine();
                        Triangulo triangulo = new Triangulo(lado1, lado2, lado3, ct);
                        triangulos[conttria] = triangulo;
                        conttria++;
                        break;
                    case 3:
                        System.out.println("Insira o comprimento do retângulo:");
                        double comprimento = input.nextDouble();
                        System.out.println("Insira a altura do retângulo:");
                        double altura = input.nextDouble();
                        System.out.println("Insira a cor da figura figura:");
                        String cr = input.nextLine();
                        Retangulo retangulo = new Retangulo(comprimento, altura, cr);
                        retangulos[contreta] = retangulo;
                        contreta++;
                        break;
                    case 4:
                        System.out.println("Lista de figuras:");
                        System.out.println("Circulos:");
                        for (int i = 0; i < contcirc; i++) {
                            System.out.println(i + " : "  + circulos[i].toString());
                            System.out.println("Area" + circulos[i].area());
                            System.out.println("Perimetro" + circulos[i].perimetro());

                        }
                        System.out.println("Triangulos:");
                        for (int i = 0; i < conttria; i++) {
                            System.out.println(i + " : "  + triangulos[i].toString());
                            System.out.println("Area" + triangulos[i].area());
                            System.out.println("Perimetro" + triangulos[i].perimetro());
                        }
                        System.out.println("Retangulos:");
                        for (int i = 0; i < contreta; i++) {
                            System.out.println(i + " : "  + retangulos[i].toString());
                            System.out.println("Area" + retangulos[i].area());
                            System.out.println("Perimetro" + retangulos[i].perimetro());
                        }
                        break;
                    case 5:
                        System.out.println("Quer comparar:");
                        System.out.println("1--Circulo");
                        System.out.println("2--Triangulo");
                        System.out.println("3--Retangulo");
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                if (circulos.length == 1) {
                                    System.out.println("Só foi criado 1 retangulo.");
                                    break;
                                }

                                System.out.println("Insira o índice da primeira figura:");
                                int c1 = input.nextInt();
                                System.out.println("Insira o índice da segunda figura:");
                                int c2 = input.nextInt();


                                if (c1>retangulos.length-1 || c1 < 0 && c2>retangulos.length-1 || c2 < 0 || c1 == c2){
                                    System.out.println("Indice(s) invalido(s).");
                                    break;
                                }

                                if (circulos[c1].equals(circulos[c2])) {
                                    System.out.println("As figuras são iguais.");
                                } else {
                                    System.out.println("As figuras são diferentes.");
                                }
                                break;

                            case 2:
                                if (triangulos.length == 1) {
                                    System.out.println("Só foi criado 1 triangulo.");
                                    break;
                                }

                                System.out.println("Insira o índice da primeira figura:");
                                int t1 = input.nextInt();
                                System.out.println("Insira o índice da segunda figura:");
                                int t2 = input.nextInt();


                                if (t1>retangulos.length-1 || t1 < 0 && t2>retangulos.length-1 || t2 < 0 || t1==t2){
                                    System.out.println("Indice(s) invalido(s).");
                                    break;
                                }

                                if (triangulos[t1].equals(triangulos[t2])) {
                                    System.out.println("As figuras são iguais.");
                                } else {
                                    System.out.println("As figuras são diferentes.");
                                }
                                break;

                            case 3:
                                if (retangulos.length == 1) {
                                    System.out.println("Só foi criado 1 retangulo.");
                                    break;
                                }

                                System.out.println("Insira o índice da primeira figura:");
                                int r1 = input.nextInt();
                                System.out.println("Insira o índice da segunda figura:");
                                int r2 = input.nextInt();


                                if (r1>retangulos.length-1 || r1 < 0 && r2>retangulos.length-1 || r2 < 0 || r1==r2){
                                    System.out.println("Indice(s) invalido(s).");
                                    break;
                                }

                                if (retangulos[r1].equals(retangulos[r2])) {
                                    System.out.println("As figuras são iguais.");
                                } else {
                                    System.out.println("As figuras são diferentes.");
                                }
                                break;
                            }
                    case 6:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }
        }

    }










