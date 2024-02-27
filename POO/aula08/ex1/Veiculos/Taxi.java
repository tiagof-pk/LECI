package aula08.ex1.Veiculos;

import aula08.ex1.Veiculos.AutomovelLigeiro;

public class Taxi extends AutomovelLigeiro {
    private int licença;

    public Taxi(String matricula, String modelo, String marca, int potencia, int nQuadro, int bagagem, int licença) {
        super(matricula, modelo, marca, potencia, nQuadro, bagagem);
        if (utils.isPositive.positiveNumber(licença))
        this.licença=licença;
    }

    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public int getPotencia(){
        return this.potencia;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void setPotencia(int potencia){
        this.potencia=potencia;
    }
    public int getnQuadro() {
        return nQuadro;
    }
    public int getBagagem() {
        return Bagagem;
    }
    public void setnQuadro(int nQuadro) {
        this.nQuadro = nQuadro;
    }
    public void setBagagem(int bagagem) {
        Bagagem = bagagem;
    }
    public int getLicença() {
        return licença;
    }
    public void setLicença(int licença) {
        this.licença = licença;
    }

    public void trajeto(int km){
        ultimoTrajeto = km;
        distancia += km;
    }
    public int ultimoTrajeto(){
        return ultimoTrajeto;
    }
    public int distanciaTotal(){
        return distancia;
    }



    @Override
    public String toString() {
        return "\nTaxi:" +
                "\nmarca = '" + marca +
                "\nmodelo = " + modelo +
                "\nmatricula = " + matricula +
                "\npotencia = " + potencia +
                "\nnQuadro = " + nQuadro +
                "\nBagagem = " + Bagagem +
                "\nlicença = " + licença +
                "\n----------------------------";
    }
}
