package aula08.ex1.Veiculos;

import aula08.ex1.VeiculoEletrico;

public class AutomovelLigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico {

    private int bat ;
    private int nextBat= 0;

    public AutomovelLigeiroEletrico(String matricula, String modelo, String marca, int potencia, int nQuadro, int bagagem, int bat) {
        super(matricula, modelo, marca, potencia, nQuadro, bagagem);
        if (bat<=100 && bat >= 0){
            this.bat = bat;
        }
    }


    public int autonomia(){
        return bat *250;
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
        return "\nAutomovel Ligeiro Eletrico :" +
                "\nmarca = " + marca +
                "\nmodelo = " + modelo +
                "\nmatricula = " + matricula +
                "\npotencia = " + potencia +
                "\nnQuadro = " + nQuadro +
                "\nBagagem = " + Bagagem +
                "\nBateria = " + bat + "%" +
                "\n----------------------------";
    }
}
