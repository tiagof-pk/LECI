package aula6.ex2;

import aula6.ex1.Pessoa;
import java.util.Objects;


public class Contacto {
    private int id, numbr;
    private static int nextID = 1;
    private Pessoa pessoa;
    private String mail;


    public Contacto(Pessoa pessoa, int numbr, String mail){
        this.id=nextID;
        nextID++;
        this.pessoa=pessoa;
        this.numbr=numbr;
        this.mail=mail;
    }

    public Contacto(Pessoa pessoa, int numbr){
        this.id=nextID;
        nextID++;
        this.pessoa=pessoa;
        this.numbr=numbr;

    }

    public Contacto(Pessoa pessoa, String mail){
        this.id=nextID;
        nextID++;
        this.pessoa=pessoa;
        this.mail=mail;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return   numbr == contacto.numbr && Objects.equals(pessoa, contacto.pessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pessoa, numbr, mail);
    }

    public void setName(String nome){
        pessoa.setName(nome);
    }
    public String getName(){
        return pessoa.getName();
    }

    public void setNumbr(int numbr){
        this.numbr = numbr;
    }
    public int getNumbr(){
        return this.numbr;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
    public String getMail(){
        return this.mail;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public Pessoa getPessoa(){
        return this.pessoa;
    }
    public void setPessoa(Pessoa pessoa){this.pessoa = pessoa;}

    @Override
    public String toString() {
        return "id=" + id + "\nNome=" + pessoa + "\nNúmero=" + numbr + "\nMail=" + mail;
    }
}
