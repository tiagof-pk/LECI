package aula3.extra;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza texto: ");

        String str = sc.nextLine();

        str = str.replaceAll("\\s+", " ");

        String[] strarray = str.split(" ");

        String acro = " ";

        for (int i = 0; i <= strarray.length - 1; i++) {

            if (strarray[i].length() >= 3) {

                acro += strarray[i].charAt(0);

            }

        }

        acro = acro.toUpperCase();

        System.out.println(acro);

    }

}
