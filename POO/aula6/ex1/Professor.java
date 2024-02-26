package aula6.ex1;

import aula7.ex2.DateYMD;

public class Professor extends Pessoa {

    private String dep;
    private String cat;
    private String[] cats = {"Auxiliar", "Associado", "Catedrático"};

    public Professor(String nome, int cc, DateYMD date, String cat, String dep){
        super(nome, cc, date);
        this.dep=dep;
        this.cat=cat;

    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
