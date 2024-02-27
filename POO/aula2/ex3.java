package aula2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Água(kg):");
        double kg = sc.nextDouble();
        System.out.print("Temp. Inicial(ºC):");
        double ti = sc.nextDouble();
        System.out.print("Temp final(ºC):");
        double tf = sc.nextDouble();
        double energy = kg * (tf - ti)*4184;

        if ( ex11.positiveNumber(kg)==true && ex11.positiveNumber(ti)==true && ex11.positiveNumber(tf)==true){
            System.out.print(energy);
        }
        else{
            System.out.print("Invalid values!");
        }
        sc.close();
    }
}
