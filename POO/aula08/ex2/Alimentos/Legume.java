package aula08.ex2.Alimentos;

import java.util.Objects;

public class Legume implements Alimento {
    private String nome;
    private double proteinas;
    private double calorias;
    private double peso;

    public Legume(String nome, double proteinas, double calorias, double peso) {
        this.nome = nome;
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Legume legume = (Legume) o;
        return Double.compare(legume.proteinas, proteinas) == 0 && Double.compare(legume.calorias, calorias) == 0 && Double.compare(legume.peso, peso) == 0 && Objects.equals(nome, legume.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, proteinas, calorias, peso);
    }

    @Override
    public String toString() {
        return "Legume{" +
                "nome='" + nome + '\'' +
                ", proteinas=" + proteinas +
                ", calorias=" + calorias +
                ", peso=" + peso +
                '}';
    }
}

