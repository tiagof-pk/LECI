package aula2;

import java.util.Scanner;

public class ex6 {
    public static void  main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tempo(s):");
        int time = sc.nextInt() ;
        int min = time / 60;
        int hour = min / 60;
        int sec = time - min * 60;
        min = min - hour * 60;
        System.out.print(hour + ":" + min + ":" + sec );
        if ( ex11.positiveNumber(time)==true){
            System.out.print(hour + ":" + min + ":" + sec);
        }
        else{
            System.out.print("Invalid values!");
        }
        sc.close();
    }
}
