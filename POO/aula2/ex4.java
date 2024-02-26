package aula2;

import java.util.Scanner;

public class ex4 {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Investimento:");
        double invest = sc.nextDouble();
        System.out.print("Taxa:");
        double tax = sc.nextDouble();
        for( int i = 0; i < 3 ; i++ ){
            double profit = (invest*(tax/100));
            invest = invest + profit ;
        }
        if ( ex11.positiveNumber(invest)==true && ex11.positiveNumber(tax)==true){
            System.out.print(invest);
        }
        else {
            System.out.print("Invalid values!");
        }
        sc.close();
    }
}
