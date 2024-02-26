package aula7;

public abstract class Forma {
    protected String cor;

    public static final double pi = Math.PI;

    public Forma(String cor) {
        this.cor = cor;
    }

    public abstract double perimetro();
    public abstract double area();

}
