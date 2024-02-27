package aula3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nº de alunos--->");
        int n = sc.nextInt();

        double[][] grades = new double[10][2] ;

        System.out.println(String.format("%15s %15s %10s\n","Nota Teórica","Nota Prática","Pauta"));

        for(int i = 0; i<=n;i++){
            grades[i][0] = utils.randnumb.random(0.0,20.0);
            grades[i][1] = utils.randnumb.random(0.0,20.0);
            double nf = 0;
            if(grades[i][0]<7.0 || grades[i][1]<7.0){
                nf = 66;
            }
            else{
                nf = (0.4*grades[i][0])+(grades[i][1]*0.6);
            }
            nf =Math.round(nf) ;
            System.out.printf("%15.1f %15.1f %10.0f\n", grades[i][0],grades[i][1], nf);
        }
    }
}

