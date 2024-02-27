package aula2;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number?");
        int n = sc.nextInt();

        if ( ex11.positiveNumber(n)==true) {
            for (int i = n; i >= 0; i--) {

                if (i % 10 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + ",");
                }

            }
        }
        else{
            System.out.print("Invalid values!");
        }

        sc.close();
    }
}
