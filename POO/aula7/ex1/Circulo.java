package aula7;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio, String cor) {
        super(cor);
        if(raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser um valor positivo");
        }
        this.raio = raio;
    }

    public double getraio() {
        return raio;
    }

    public void setraio(double raio) {
        this.raio = raio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circulo circulo = (Circulo) obj;
        return Double.compare(circulo.raio, raio) == 0;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    public double perimetro() {
        return 2 * Math.PI * raio;
    }
}
