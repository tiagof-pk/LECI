package aula08.ex2.Alimentos;

import aula08.ex2.Enums.TipoPeixe;

import java.util.Objects;

public class Peixe implements Alimento {
    private TipoPeixe tipo;
    private double proteinas;
    private double calorias;
    private double peso;
    public Peixe(TipoPeixe tipo, double proteinas, double calorias, double peso) {
        this.tipo = tipo;
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public TipoPeixe getTipo() {
        return tipo;
    }

    public void setTipo(TipoPeixe tipo) {
        this.tipo = tipo;
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
        Peixe peixe = (Peixe) o;
        return Double.compare(peixe.proteinas, proteinas) == 0 && Double.compare(peixe.calorias, calorias) == 0 && Double.compare(peixe.peso, peso) == 0 && tipo == peixe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, proteinas, calorias, peso);
    }

    @Override
    public String toString() {
        return "Peixe " + tipo +
                ", Proteinas " + proteinas +
                ", Calorias " + calorias +
                ", Peso " + peso ;
    }
}