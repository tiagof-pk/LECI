package aula2;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cateto A:");
        double a = sc.nextDouble();
        System.out.print("Cateto B:");
        double b = sc.nextDouble();
        double c =Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));
        double ang = Math.toDegrees(Math.acos(a/c));
        if (ex11.positiveNumber(a)==true && ex11.positiveNumber(b)==true ){
            System.out.print("Hipotenusa:"+ c);
            System.out.print("Ângulo entre o cateto A e a Hipotenusa:"+ ang);
        }
        else{
            System.out.print("Invalid values!");
        }
        sc.close();
    }
}
