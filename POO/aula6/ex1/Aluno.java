package aula6.ex1;

import aula7.ex2.DateYMD;

import java.util.Date;


public class Aluno extends Pessoa {
    private int nMec;
    private static int nextNMec = 100;
    private Date dateInsc;
    private DateYMD date;

    public Aluno(String nome, int cc, DateYMD date){
        super(nome, cc, date);
        this.nMec = nextNMec;
        nextNMec++;
        this.dateInsc = new Date();
    }

    public Aluno(String nome, int cc, DateYMD date , DateYMD dataInsc){
        super(nome, cc, date);
        this.nMec = nextNMec;
        nextNMec++;
        this.date = dataInsc;
    }
    public int getNMec() {return nMec;}


    @Override
    public String toString() {
        return super.toString();
    }
}


