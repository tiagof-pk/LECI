package aula08.ex2;

import aula08.ex2.Alimentos.Alimento;
import aula08.ex2.Alimentos.Cereals;
import aula08.ex2.Alimentos.Legume;

public class PratoVegetariano extends Prato {
    public PratoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public boolean addIngrediente (Alimento alimento) {
        if (!(alimento instanceof Legume || alimento instanceof Cereals)) {
            System.out.println("Apenas ingredientes vegetarianos são permitidos em um prato vegetariano.");
            return false;
        }
        super.addIngrediente(alimento);
        return true;
    }



}