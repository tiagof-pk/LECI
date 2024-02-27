package aula08.ex2.Alimentos;

import aula08.ex2.Enums.VariedadeCarne;

import java.util.Objects;

public class Carne implements Alimento {
    private VariedadeCarne variedade;
    private double proteinas;
    private double calorias;
    private double peso;

    public Carne(VariedadeCarne variedade, double proteinas, double calorias, double peso) {
        this.variedade = variedade;
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public VariedadeCarne getVariedade() {
        return variedade;
    }

    public void setVariedade(VariedadeCarne variedade) {
        this.variedade = variedade;
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
        Carne carne = (Carne) o;
        return Double.compare(carne.proteinas, proteinas) == 0 && Double.compare(carne.calorias, calorias) == 0 && Double.compare(carne.peso, peso) == 0 && variedade == carne.variedade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(variedade, proteinas, calorias, peso);
    }

    @Override
    public String toString() {
        return "Carne{" +
                "variedade=" + variedade +
                ", proteinas=" + proteinas +
                ", calorias=" + calorias +
                ", peso=" + peso +
                '}';
    }

}

