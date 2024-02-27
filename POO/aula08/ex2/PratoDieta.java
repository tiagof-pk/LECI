package aula08.ex2;

import aula08.ex2.Alimentos.Alimento;

public class PratoDieta extends Prato {
    private double limiteCalorias;

    public PratoDieta(String nome, double limiteCalorias) {
        super(nome);
        this.limiteCalorias = limiteCalorias;
    }

    // Verifica se o prato excede o limite de calorias
    @Override
    public boolean addIngrediente(Alimento alimento) {
        if (getCaloriasTotais() + alimento.getCalorias() > limiteCalorias) {
            System.out.println("O prato excede o limite de calorias.");
            return false;
        }
        else{
            super.addIngrediente(alimento);
            return true;
        }
    }
}