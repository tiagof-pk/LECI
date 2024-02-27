package aula08.ex1.Veiculos;

import aula08.ex1.Veiculos.Pesado;

public class PesadoPassageiros extends Pesado {
    protected int nPassageiros;
    public PesadoPassageiros(String matricula, String modelo, String marca, int potencia, int nQuadro, int peso, int nPassageiros) {
        super(matricula, modelo, marca, potencia, nQuadro, peso);
        if (utils.isPositive.positiveNumber(nPassageiros)){
            this.nPassageiros=nPassageiros;
        }
    }

    public int getnPaassageiros() {
        return nPassageiros;
    }

    public void setnPaassageiros(int nPaassageiros) {
        this.nPassageiros = nPaassageiros;
    }
    @Override
    public String toString() {
        return "\nPesadoPassageiros:" +
                "\nmarca = " + marca +
                "\nmodelo = " + modelo +
                "\nmatricula = " + matricula +
                "\npotencia = " + potencia +
                "\nLugares = " + nPassageiros +
                "\n----------------------------";
    }
}
