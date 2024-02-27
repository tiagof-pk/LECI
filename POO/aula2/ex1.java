package aula2;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("KIlometros: ");
        double kilometers  = sc.nextDouble();

        double miles = kilometers / 1.609;
        if ( ex11.positiveNumber(kilometers)==true){
            System.out.println(miles);
        }
        else{
            System.out.print("Invalid values!");
        }
        sc.close();
    }

}
