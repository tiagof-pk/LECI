package aula08.ex2.Alimentos;

import java.util.Objects;

public class Cereals implements Alimento {
    private String nome;
    private double proteinas;
    private double calorias;
    private double peso;

    public Cereals(String nome, double proteinas, double calorias, double peso) {
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
        Cereals cereal = (Cereals) o;
        return Double.compare(cereal.proteinas, proteinas) == 0 && Double.compare(cereal.calorias, calorias) == 0 && Double.compare(cereal.peso, peso) == 0 && Objects.equals(nome, cereal.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, proteinas, calorias, peso);
    }

    @Override
    public String toString() {
        return "Cereal " + nome +
                ", Proteinas " + proteinas +
                ", Calorias " + calorias +
                ", Peso " + peso ;
    }
}