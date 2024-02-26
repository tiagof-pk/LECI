package aula7;

public class Triangulo extends Forma {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3, String cor) {
        super(cor);
        if(lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException("Os lados do triângulo devem ser valores positivos");
        }
        if(lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Os lados do triângulo não atendem à desigualdade triangular");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double[] getlados() {
        return new double[] {this.lado1,this.lado2,this.lado3};
    }

    public void setlados(double lado1,double lado2,double lado3) {
        if(lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException("Os lados do triângulo devem ser valores positivos");
        }
        if(lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Os lados do triângulo não atendem à desigualdade triangular");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangulo triangulo = (Triangulo) obj;
        return Double.compare(triangulo.lado1, lado1) == 0 &&
                Double.compare(triangulo.lado2, lado2) == 0 &&
                Double.compare(triangulo.lado3, lado3) == 0;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + "lado3=" + lado3 + '}';
    }

    public double area() {
        double a = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(a * (a - lado1) * (a - lado2) * (a - lado3));

    }

    public double perimetro() {
        return lado1 + lado2 + lado3;
    }
}
