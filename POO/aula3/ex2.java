package aula3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Investimento:");
        double invest = sc.nextDouble();
        System.out.print("Taxa:");
        double tax = sc.nextDouble();

        while(!utils.isPositive.positiveNumber(invest) || !utils.isPositive.positiveNumber(tax) || tax<=0 || tax>=5 || (invest%1000)!=0 ){
            System.out.println("Nºinvalido");
            System.out.print("Investimento:");
            invest = sc.nextDouble();
            System.out.print("Taxa:");
            tax = sc.nextDouble();
        }

        for( int i = 0; i < 12 ; i++ ){
            double profit = (invest*(tax/100));
            invest = invest + profit ;
        }

        System.out.print(invest);
        sc.close();
    }
}
