package aula6.ex1;

import aula7.ex2.DateYMD;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD date){
        String str = Integer.toString(cc);
        if (str.length() == 8){
            this.nome = nome;
            this.cc = cc;
            this.dataNasc = date;
        }


    }
    public void setName(String nome){
        this.nome = nome;
    }
    public String getName(){
        return this.nome ;
    }

    public void setCc(int cc){
        this.cc = cc;
    }
    public int getCc(){
        return this.cc ;
    }

    public void setDataNasc(DateYMD date){
        this.dataNasc = date;
    }
    public DateYMD getDataNasc(){
        return this.dataNasc ;
    }

    @Override
    public String toString() {
        return nome + "; CC : " + cc + "; Data de Nascimento : " + dataNasc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return cc == pessoa.cc && Objects.equals(nome, pessoa.nome) && Objects.equals(dataNasc, pessoa.dataNasc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cc, dataNasc);
    }
}

