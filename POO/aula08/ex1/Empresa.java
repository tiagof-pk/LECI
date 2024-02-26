package aula08.ex1;

import aula08.ex1.Veiculos.*;

import java.util.Objects;

public class Empresa {
    private String nome,cPostal,mail;
    private int c;
    private int cNext;

    public Veiculo[] lst = new Veiculo[20];

    public Empresa(String nome, String cPostal, String mail) {
        this.nome = nome;
        this.cPostal = cPostal;
        this.mail = mail;
    }

    public void addVeiculo(Motociclo m){
        if (checkPlate(m)){
            lst[c] = m;
            cNext++;
            c= cNext;
        }

    }
    public void addVeiculo(AutomovelLigeiro a){
        if (checkPlate(a)){
            lst[c] = a;
            cNext++;
            c= cNext;
        }
    }
    public void addVeiculo(Taxi t){
        if (checkPlate(t)){
            lst[c] = t;
            cNext++;
            c= cNext;
        }
    }
    public void addVeiculo(PesadoMercadorias Pm){
        if (checkPlate(Pm)){
            lst[c] = Pm;
            cNext++;
            c= cNext;
        };
    }
    public void addVeiculo(PesadoPassageiros Pp){
        if (checkPlate(Pp)){
            lst[c] = Pp;
            cNext++;
            c= cNext;
        }
    }

    @Override
    public String toString() {
        System.out.println(nome + ":");
        for ( Veiculo x : lst ){
            if (x != null){
                System.out.println(x);
            }
        }
        return "";
    }

    public boolean checkPlate(Veiculo v){
        for( Veiculo x : lst){
            if (x != null && Objects.equals(v.getMatricula(), x.getMatricula())){
                return false;
            }
        }
        return true;


    }

    public Veiculo[] lst() {
        return this.lst;
    }
}
