package aula6.ex1;
import aula7.ex2.DateYMD;
import aula7.ex2.DateYMD;

public class Bolseiro extends Aluno {
    private int bolsa;
    private Professor prof;

    public Bolseiro(String nome, int cc, DateYMD date, Professor prof, int bolsa){
        super(nome, cc, date);
        this.prof= prof;
        this.bolsa=bolsa;
    }


    public void setOrientador(Professor prof){
        this.prof = prof;
    }
    public Professor getOrientador() { return this.prof ;}
    public void setBolsa(int bolsa){
        this.bolsa = bolsa;
    }
    public int getBolsa(){
        return this.bolsa ;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
