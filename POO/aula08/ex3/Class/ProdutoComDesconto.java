package aula08.ex3.Class;

public class ProdutoComDesconto extends ProdutoGenerico {
    private int descont;

    public ProdutoComDesconto(String nome, int quantidade, double preco, int descont) {
        super(nome, quantidade, preco);
        this.descont = descont;
    }


    public int getDescont() {
        return descont;
    }

    public void setDescont(int descont) {
        this.descont = descont;
    }
}
