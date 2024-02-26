package aula08.ex2;

import aula08.ex2.Alimentos.Alimento;

import java.util.Arrays;

public class Prato implements Comparable<Prato> {
    private String nome;
    private Alimento[] alimentos;
    private int numAlimentos;

    public Prato(String nome) {
        this.nome = nome;
        this.alimentos = new Alimento[10];
        this.numAlimentos = 0;
    }

    public double getCaloriasTotais() {
        double totalCalorias = 0.0;
        for (Alimento alimento : alimentos) {
            if (alimento == null) break;
            totalCalorias += alimento.getCalorias();
        }
        return totalCalorias;
    }
    public double getProteinasTotais() {
        double totalProteinas = 0.0;
        for (Alimento alimento : alimentos) {
            if (alimento == null) break;
            totalProteinas += alimento.getProteinas();
        }
        return totalProteinas;
    }
    public double getPesoTotal() {
        double totalPeso = 0.0;
        for (Alimento alimento : alimentos) {
            if (alimento == null) break;
            totalPeso += alimento.getPeso();
        }
        return totalPeso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumAlimentos() {
        return numAlimentos;
    }

    @Override
    public String toString() {
        return "Prato " + "'" + nome + "',"  + " composto por " + numAlimentos + " alimentos: ";
    }

    @Override
    public int compareTo(Prato other) {
        return Double.compare(this.getCaloriasTotais(), other.getCaloriasTotais());
    }

    public boolean addIngrediente(Alimento alimento) {
        alimentos[numAlimentos] = alimento;
        numAlimentos++;
        return true;
    }
}