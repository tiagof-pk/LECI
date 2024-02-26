package aula08.ex1.Veiculos;

import aula08.ex1.VeiculoEletrico;

public class PesadoPassageirosEletrico extends PesadoPassageiros implements VeiculoEletrico {

    private int bat;
    private int nextBat = 0;


    public PesadoPassageirosEletrico(String matricula, String modelo, String marca, int potencia, int nQuadro, int peso, int nPassageiros, int bat) {
        super(matricula, modelo, marca, potencia, nQuadro, peso, nPassageiros);
        if (bat<=100 && bat >= 0){
            this.bat = bat;
        }

    }

    public int autonomia(){
        return bat *400;
    }

    @Override
    public void carregar(int percentagem) {
        this.nextBat= percentagem;
        if ((this.nextBat + bat) >100){
            this.bat =100;
        }
        else{
            this.bat += this.nextBat;
        }
    }

    @Override
    public String toString() {
        return "\nPesado Passageiros Eletrico:" +
                "\nmarca = " + marca +
                "\nmodelo = " + modelo +
                "\nmatricula = " + matricula +
                "\npotencia = " + potencia +
                "\ncargMax = " + nPassageiros +
                "\nBateria = " + bat + "%" +
                "\n----------------------------";
    }
}
