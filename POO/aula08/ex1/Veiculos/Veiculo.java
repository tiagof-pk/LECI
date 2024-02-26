package aula08.ex1.Veiculos;

import aula08.ex1.kmPercorridos;

import java.util.Objects;

public abstract class Veiculo implements kmPercorridos {
    protected String marca, modelo, matricula;
    protected int potencia, ultimoTrajeto, distancia ;
    public int trajeto = 0;


    public Veiculo(String matricula, String modelo, String marca, int potencia) {
        if (utils.Matricula.validateVehiclePlate(matricula) && utils.isPositive.positiveNumber(potencia)) {
            this.matricula = matricula;
            this.modelo = modelo;
            this.marca = marca;
            this.potencia = potencia;
        }
    }
    public abstract String getMarca();
    public abstract String getModelo();
    public abstract String getMatricula();
    public abstract int getPotencia();
    public abstract void setMarca(String marca);
    public abstract void setModelo(String modelo);
    public abstract void setMatricula(String matricula);
    public abstract void setPotencia(int potencia);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return potencia == veiculo.potencia && ultimoTrajeto == veiculo.ultimoTrajeto && distancia == veiculo.distancia && trajeto == veiculo.trajeto && marca.equals(veiculo.marca) && modelo.equals(veiculo.modelo) && matricula.equals(veiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, matricula, potencia, ultimoTrajeto, distancia, trajeto);
    }

    @Override
    public abstract   void trajeto(int quilometros);

    @Override
    public abstract int ultimoTrajeto();


    @Override
    public abstract int distanciaTotal() ;
}



