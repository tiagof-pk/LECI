package aula3;

import java.util.Scanner;

public class ex5 {

    public static class Calendario {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);


            int mes, ano, diaInicio;
            boolean dataValida;

            do {
                System.out.print("Digite o mês (mm/yyyy): ");
                String data = leitor.nextLine();
                String[] dataSeparada = data.split("/");

                mes = Integer.parseInt(dataSeparada[0]);
                ano = Integer.parseInt(dataSeparada[1]);

                dataValida = utils.year.validarData(mes,ano);

                if (!dataValida) {
                    System.out.println("Data inválida! Tente novamente.");
                }
            } while (!dataValida);

            do {
                System.out.print("Digite o dia da semana em que o mês começa (1 a 7): ");
                diaInicio = leitor.nextInt();

                if (diaInicio < 1 || diaInicio > 7) {
                    System.out.println("Valor inválido! Tente novamente.");
                }
            } while (diaInicio < 1 || diaInicio > 7);

            int diasNoMes = utils.year.monthDays(mes, ano);
            imprimirCalendario(mes, ano, diasNoMes, diaInicio);
        }

        public static void imprimirCalendario(int mes, int ano, int diasNoMes, int diaInicio) {
            System.out.println("  " + mes + "/" + ano);
            System.out.println("Su Mo Tu We Th Fr Sa");

            for (int i = 0; i < diaInicio; i++) {
                if(diaInicio!=7){
                    System.out.print("   ");
                }
            }

            for (int i = 1; i <= diasNoMes; i++) {
                System.out.printf("%2d ", i);

                if ((i + diaInicio) % 7 == 0 || i == diasNoMes) {
                    System.out.println();
                }
            }
        }
    }
}
