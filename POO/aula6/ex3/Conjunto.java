package aula6.ex3;

import java.util.Arrays;

public class Conjunto {
     private int  c;

     private int [] Numbrs ;

     public Conjunto(){
         Numbrs = new int[20];
         c=0;

     }
     public void insert(int n ){
         if (!contains(n)) {
             if (c == Numbrs.length) {
                 Numbrs = Arrays.copyOf(Numbrs, Numbrs.length * 2);
             }
             Numbrs[c] = n;
             c++;
         }
     }

    public boolean contains(int n){
        for (int i = 0; i < c; i++) {
            if (Numbrs[i] == n) {
                return true;
            }
        }
        return false;
    }



    public void empty(){
         Numbrs = new int[20];
         c = 0;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < c; i++) {
            sb.append(Numbrs[i]);
            if (i < c-1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public void remove(int n){
        for (int i = 0; i < c; i++) {
            if (Numbrs[i] == n) {
                Numbrs[i] = Numbrs[c-1];
                c--;
                return;
            }
        }
    }

    public int size(){return c;}

    public Conjunto combine(Conjunto add){
        Conjunto New = new Conjunto();
        for (int i = 0; i < c; i++) {
            New.insert(Numbrs[i]);
        }
        for (int i = 0; i < add.size(); i++) {
            New.insert(add.Numbrs[i]);
        }
        return New;
    }

    public Conjunto subtrair(Conjunto dif){
        Conjunto New = new Conjunto();
        for (int i = 0; i < c; i++) {
            if (!dif.contains(Numbrs[i])) {
                New.insert(Numbrs[i]);
            }
        }
        return New;
    }
    public Conjunto interset (Conjunto inter){
        Conjunto New = new Conjunto();
        for (int i = 0; i < c; i++) {
            if (inter.contains(Numbrs[i])) {
                New.insert(Numbrs[i]);
            }
        }
        return New;
    }
}
