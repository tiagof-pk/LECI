package aula3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        while(true) {
            double rand = Math.random();
            rand = rand * 100;
            rand = rand - rand % 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess?");

            int c = 1;
            Double g = sc.nextDouble();

            while (g != rand) {

                System.out.println("Wrong Guess.");
                c++;

                if (g < rand) {
                    System.out.println("Baixo");
                }

                if (g > rand) {
                    System.out.println("Alto");
                }

                System.out.println("Guess?");
                g = sc.nextDouble();
            }

            System.out.println("BINGO");
            System.out.println("Nº de tentativas:" + c);
            System.out.println("Pretende Continuar?Prima (S)im");
            String resposta = sc.next();
            if (!resposta.equals("S") && !resposta.equals("Sim")) {
                break;
            }
        }
    }
}
