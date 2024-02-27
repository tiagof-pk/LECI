package aula7.ex2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateYMD date = null;
        DateND dateND = null;
        int exit = 1;


        do{
        System.out.println("Date operations:");
        System.out.println("1 - Create new date");
        System.out.println("2 - Show current date");
        System.out.println("3 - Increment date");
        System.out.println("4 - Decrement date");
        System.out.println("5 - Create new dateND");
        System.out.println("6 - Distance");
        System.out.println("0 - Sair");
        int op = sc.nextInt();



            switch (op){
                case 0:
                    exit =0;
                    break;

                case 1:

                    System.out.println("Insert Day:");
                    int day = sc.nextInt();
                    System.out.println("Insert Month:");
                    int month = sc.nextInt();
                    System.out.println("Insert Year:");
                    int year = sc.nextInt();
                    date = new DateYMD(day, month, year);
                    break;

                case 2:

                    if(date!=null) {
                        System.out.println(date);
                    }
                    else{
                        System.out.println("No date avaiable\nPls create a date first.");
                    }
                    break;
                case 3:
                    if(date!=null) {
                        date.increment();
                    }
                    else{
                        System.out.println("No date avaiable\nPls create a date first.");
                    }
                    break;
                case 4:
                    if(date!=null) {
                        date.decrement();
                    }
                    else{
                        System.out.println("No date avaiable\nPls create a date first.");
                    }
                    break;
                case 5:

                    System.out.println("Insert Day:");
                    int dayND = sc.nextInt();
                    System.out.println("Insert Month:");
                    int monthND = sc.nextInt();
                    System.out.println("Insert Year:");
                    int yearND = sc.nextInt();
                    dateND = new DateND(dayND, monthND, yearND);
                    break;
                case 6:
                    assert dateND != null;
                    System.out.println(dateND.distancia());
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
        while( exit != 0);

    }
}

