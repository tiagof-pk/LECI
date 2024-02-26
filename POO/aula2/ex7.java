package aula2;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("P1:");
        System.out.print("X->");
        double x1 = sc.nextDouble();
        System.out.print("Y->");
        double y1 = sc.nextDouble();
        System.out.print("P2:");
        System.out.print("X->");
        double x2 = sc.nextDouble();
        System.out.print("Y->");
        double y2 = sc.nextDouble();
        double dist = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));

        if ( ex11.positiveNumber(x1)==true && ex11.positiveNumber(x2)==true && ex11.positiveNumber(y1)==true && ex11.positiveNumber(y2)==true  ){
            System.out.print(dist);
        }
        else{
            System.out.print("Invalid values!");
        }
        sc.close();


    }
}
