package aula3.extra;

import java.util.Scanner;

public class ex7 {

    public static double digitCout(String str) {
        double n = 0 ;
        for(int  i = 0 ; i < str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))) {
                n += 1;
            }
        }
        return n;
    }

    public static double spaceCout(String str) {
        double n = 0 ;
        for(int  i = 0 ; i < str.length() ; i++) {
            if (Character.isWhitespace(str.charAt(i)) ) {
                n += 1;
            }
        }
        return n;
    }

    public static boolean  islower(String str) {
        for(int  i = 0 ; i < str.length() ; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean  palindrome(String str) {
        str = str.replaceAll( "\\s+" ," ");
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza texto: ");
        String str = sc.nextLine();

        System.out.println(digitCout(str));
        System.out.println(spaceCout(str));
        System.out.println(islower(str));
        System.out.println(palindrome(str));
    }
}
