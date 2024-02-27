package aula3.extra;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza texto: ");
        String str = sc.nextLine();

        System.out.println("Lower case : " + str.toLowerCase());
        System.out.print("3 primeiros characteres :");
        for( int i = 0; i < 3 ; i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("Ultimo charactere : " + str.charAt(str.length()-1));


    }

}

