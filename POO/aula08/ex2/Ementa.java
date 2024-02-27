package aula08.ex2;

import aula08.ex2.Enums.DiaSemana;

import java.util.Arrays;
import java.util.Objects;

public class Ementa {
    private String nome;
    private String local;
    private Prato[] pratos;
    private int numPratos;
    private DiaSemana diaSemana;
    private static final int CAPACIDADE_INICIAL = 10;

    // Construtor
    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.pratos = new Prato[CAPACIDADE_INICIAL];
        this.numPratos = 0;
    }

    // Método para adicionar um prato à ementa
    public void addPrato(Prato prato, DiaSemana diaSemana){
        this.diaSemana = diaSemana;
        pratos[numPratos] = prato;
        numPratos++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ementa ementa = (Ementa) o;
        return numPratos == ementa.numPratos && Objects.equals(nome, ementa.nome) && Objects.equals(local, ementa.local) && Arrays.equals(pratos, ementa.pratos) && diaSemana == ementa.diaSemana;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nome, local, numPratos, diaSemana);
        result = 31 * result + Arrays.hashCode(pratos);
        return result;
    }

    @Override
    public String toString() {
        return "Ementa{" +
                "nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                ", pratos=" + Arrays.toString(pratos) +
                ", numPratos=" + numPratos +
                ", diaSemana=" + diaSemana +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }
}
