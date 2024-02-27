package aula2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Celsius:");
        double celsius = sc.nextDouble() ;
        double farenheit = (1.8* celsius)+ 32;

        if ( ex11.positiveNumber(celsius)==true){
            System.out.print(farenheit);
        }
        else{
            System.out.print("Invalid values!");
        }
        sc.close();
    }
}
