package aula09.ex3;

import aula09.ex3.Planes.CommercialPlane;
import aula09.ex3.Planes.MilitaryPlane;
import aula09.ex3.Planes.Plane;

import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPlane(planeManager, scanner);
                    break;
                case 2:
                    removePlane(planeManager, scanner);
                    break;
                case 3:
                    searchPlane(planeManager, scanner);
                    break;
                case 4:
                    printAllPlanes(planeManager);
                    break;
                case 5:
                    printCommercialPlanes(planeManager);
                    break;
                case 6:
                    printMilitaryPlanes(planeManager);
                    break;
                case 7:
                    printFastestPlane(planeManager);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addPlane(PlaneManager planeManager, Scanner sc) {
        System.out.println("ID -->");
        sc.nextLine();
        String id = sc.nextLine();
        System.out.println("Fabricante -->");
        String fabricante = sc.nextLine();
        System.out.println("Modelo -->");
        String modelo = sc.nextLine();
        System.out.println("Ano de Produção -->");
        int anoProdicao = sc.nextInt();
        System.out.println("Número Máximo de Passageiros -->");
        int numPassageiros = sc.nextInt();
        System.out.println("Velocidade Máxima -->");
        int maxvel = sc.nextInt();
        System.out.println("Tipo de Avião:" +
                            "\n0 - Normal" +
                            "\n1 - Comercial" +
                            "\n2 - Militar");
        int op = sc.nextInt();
        switch(op){
            case 0 :
                Plane p = new Plane(id,fabricante,modelo,anoProdicao,numPassageiros,maxvel);
                planeManager.addPlane(p);
                break;

            case 1 :
                System.out.println("Numero de Tripulantes -->");
                int numOfCrewMembers = sc.nextInt();
                Plane c = new CommercialPlane(id,fabricante,modelo,anoProdicao,numPassageiros,maxvel,numOfCrewMembers);
                planeManager.addPlane(c);
                break;

            case 2 : ;
                System.out.println("Numero de Misseis -->");
                int numOfMissiles = sc.nextInt();
                Plane m = new MilitaryPlane(id,fabricante,modelo,anoProdicao,numPassageiros,maxvel,numOfMissiles);
                planeManager.addPlane(m);
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }

    private static void removePlane(PlaneManager planeManager, Scanner sc) {
        System.out.println("ID -->");
        sc.nextLine();
        String id = sc.nextLine();
        if (planeManager.removePlane(id))
            System.out.println("Avião removido com sucesso");
        else
            System.out.println("Avião não encontrado");
    }

    private static void searchPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("ID -->");
        scanner.nextLine();
        String id = scanner.nextLine();
        Plane plane = planeManager.searchPlane(id);
        if (plane != null)
            System.out.println(plane);
        else
            System.out.println("Avião não encontrado");
    }

    private static void printAllPlanes(PlaneManager planeManager) {
        planeManager.printAllPlanes();
    }

    private static void printCommercialPlanes(PlaneManager planeManager) {
        planeManager.getCommercialPlanes();
    }

    private static void printMilitaryPlanes(PlaneManager planeManager) {
        planeManager.getMilitaryPlanes();
    }

    private static void printFastestPlane(PlaneManager planeManager) {
        Plane p = planeManager.printFastestPlane();
        System.out.println(p);
    }
}
