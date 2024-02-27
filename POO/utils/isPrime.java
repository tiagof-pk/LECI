package utils;

public class isPrime {
    public static boolean primeNumber(double n) {
        int pc=0;
        for (double i = 1; i <= n; i++) {
            if (i != 1 && i != n && n % i == 0) {
                pc++;
            }
        }
        if(pc>0){return false;}
        else {return true;}
    }
}
