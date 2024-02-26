package aula3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Nº inteiro:");
        double n = sc.nextDouble();

        while(utils.isPositive.positiveNumber(n)==false){
            System.out.println("Nºinvalido");
            System.out.print("Nº inteiro:");
            n = sc.nextDouble();
        }
        double c = 0;
        for(double i = 1; i <= n; i++){
            if(utils.isPrime.primeNumber(i)==true){
                c+=i;
            }
        }
        System.out.println(c-1);
        sc.close();





    }
}
