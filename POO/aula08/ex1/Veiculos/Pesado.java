package aula08.ex1.Veiculos;

public class Pesado extends Veiculo {
    private int nQuadro;
    private int peso;

    public Pesado(String matricula, String modelo, String marca, int potencia, int nQuadro, int peso) {
        super(matricula, modelo, marca, potencia);
        this.nQuadro = nQuadro;
        this.peso = peso;
    }


    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int getPotencia() {
        return potencia;
    }

    @Override
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getnQuadro() {
        return nQuadro;
    }

    public void setnQuadro(int nQuadro) {
        this.nQuadro = nQuadro;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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
}
