package aula7;

public class Retangulo extends Forma{
    private double largura;
    private double comprimento;

    public Retangulo(double comprimento, double largura, String cor){
        super(cor);
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double[] getlados() {
        return new double[] {this.comprimento, this.largura};
    }

    public void setlados(double comprimento , double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Retangulo retangulo = (Retangulo) obj;
        return Double.compare(retangulo.comprimento, comprimento) == 0 &&
                Double.compare(retangulo.largura, largura) == 0;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "comprimento=" + comprimento + ", largura=" + largura + '}';
    }

    public double area(){
        return comprimento * largura;
    }

    public double perimetro(){
        return (2*largura)+(2*comprimento);
    }
}
