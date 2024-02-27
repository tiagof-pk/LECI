package aula08.ex1.Veiculos;

public class AutomovelLigeiro extends Veiculo {
    protected int nQuadro, Bagagem;
    public AutomovelLigeiro(String matricula, String modelo, String marca, int potencia, int nQuadro, int bagagem) {
        super(matricula, modelo, marca, potencia);
        if (utils.isPositive.positiveNumber(nQuadro) && utils.isPositive.positiveNumber(bagagem)){
            this.nQuadro = nQuadro;
            this.Bagagem = bagagem;
        }
    }

    public String getMarca() {
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public int  getPotencia(){
        return this.potencia;
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
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void setPotencia(int potencia){
        this.potencia=potencia;
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
        return "\nAutomovelLigeiro :" +
                "\nmarca = " + marca +
                "\nmodelo = " + modelo +
                "\nmatricula = " + matricula +
                "\npotencia = " + potencia +
                "\nnQuadro = " + nQuadro +
                "\nBagagem = " + Bagagem +
                "\n----------------------------";
    }
}
