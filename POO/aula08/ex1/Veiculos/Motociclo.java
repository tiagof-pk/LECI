package aula08.ex1.Veiculos;

public class Motociclo extends Veiculo {

    private String tipo;


    public Motociclo(String matricula, String modelo, String marca, int  potencia, String tipo){
        super(matricula, modelo, marca, potencia);
        if (tipo.equals("desportivo") || tipo.equals("estrada")) {
            this.tipo=tipo;
        }
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "\nMotociclo:" +
                "\nmarca = " + marca +
                "\nmodelo = " + modelo +
                "\nmatricula = " + matricula +
                "\npotencia = " + potencia +
                "\ntipo = " + tipo +
                "\n----------------------------";
    }
}
