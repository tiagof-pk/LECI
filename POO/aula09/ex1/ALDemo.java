package aula09.ex1;

import aula6.ex1.Pessoa;
import aula7.ex2.Date;
import aula7.ex2.DateND;
import aula7.ex2.DateYMD;

import java.util.*;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));
        //--------------------------------------------------
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);
        c2.add("Neve");
        System.out.println(c2.contains("Neve"));
        System.out.println(c2.indexOf("Frio"));
        c2.add("Vento");
        System.out.println(c2.lastIndexOf("Vento"));
        c2.set(0, "Granizo");
        System.out.println(c2);
        System.out.println(c2.subList(1, 3));
        c2.clear();
        System.out.println(c2);
        //--------------------------------------------------
        HashSet<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Ana", 20000000, new DateYMD(1, 1, 1)));
        c3.add(new Pessoa("Rui", 18000000, new DateYMD(2, 1, 1)));
        c3.add(new Pessoa("Paulo", 22000000, new DateYMD(3, 1, 1)));
        c3.add(new Pessoa("Tiago", 18000000, new DateYMD(5, 1, 1)));
        c3.add(new Pessoa("Asdrubal", 25000000, new DateYMD(5, 1, 1)));
        c3.add(new Pessoa("Ana", 20000000, new DateYMD(1, 1, 1)));

        for (Pessoa p : c3)
            System.out.println(p);
        //--------------------------------------------------
        TreeSet<Date> c4 = new TreeSet<>();
        c4.add(new DateYMD(1, 1, 1));
        c4.add(new DateYMD(2, 1, 1));
        c4.add(new DateYMD(3, 1, 1));
        c4.add(new DateYMD(5, 1, 1));
        c4.add(new DateYMD(5, 1, 1));

        for (Date d : c4) System.out.println(d);
    }
}