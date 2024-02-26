package aula08.ex1.Veiculos;

import aula08.ex1.Veiculos.Pesado;

public class PesadoMercadorias extends Pesado {
    private int cargMax;
    public PesadoMercadorias(String matricula, String modelo, String marca, int potencia, int nQuadro, int peso, int cargMax) {
        super(matricula, modelo, marca, potencia, nQuadro, peso);
        if (utils.isPositive.positiveNumber(cargMax)){
            this.cargMax=cargMax;
        }
    }

    public int getCargMax() {
        return cargMax;
    }

    public void setCargMax(int cargMax) {
        this.cargMax = cargMax;
    }


    @Override
    public String toString() {
        return "\nPesado Mercadorias:" +
                "\nmarca = " + marca +
                "\nmodelo = " + modelo +
                "\nmatricula = " + matricula +
                "\npotencia = " + potencia +
                "\ncargMax = " + cargMax +
                "\n----------------------------";
    }
}
