package aula2;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number?");
        int n = sc.nextInt();
        assert ex11.positiveNumber(n)==true;
        int c = 0;
        int s = 0;
        int max = n;
        int min = n;
        int f = -1;
        while (f!=n){
            System.out.print("Number?");
            int x = sc.nextInt();
            assert ex11.positiveNumber(n)==true;
            f=x;
            c++;
            s = s+f;
            if (f > max){
                max = f ;
            }
            if (f <min){
                min = f;
            }
        }
        int av = s/c;
        System.out.println("Max:"+ max);
        System.out.println("Min:"+ min);
        System.out.println("Average:"+ av);
        System.out.println("Total of numbers read:"+c);
        sc.close();
    }
}
