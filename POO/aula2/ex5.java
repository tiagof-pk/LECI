package aula2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Distancia 1(km):");
        double d1 = sc.nextDouble();
        System.out.print("Velociade 1(km/h):");
        double v1 = sc.nextDouble();
        System.out.print("Distancia 2(km):");
        double d2= sc.nextDouble();
        System.out.print("Velocidade 2(km/h):");
        double v2 = sc.nextDouble();
        double vm = (v1+v2)/(d1+d2);
        if ( ex11.positiveNumber(v1)==true && ex11.positiveNumber(v2)==true && ex11.positiveNumber(d1)==true && ex11.positiveNumber(d2)==true  ){
            System.out.print("Velocidade Média:"+ vm);
        }
        else{
            System.out.print("Invalid values!");
        }
        sc.close();
    }
}
