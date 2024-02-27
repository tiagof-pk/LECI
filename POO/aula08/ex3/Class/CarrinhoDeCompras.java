package aula08.ex3.Class;

import aula08.ex1.VeiculoEletrico;

public class CarrinhoDeCompras implements Compra {
    private int c;
    private int cNext=0;
    private Produto[] lst = new Produto[30];

    @Override
    public void adicionarProduto(Produto produto, int quantidade) {
        int q = produto.getQuantidade()-quantidade;
        produto.setQuantidade(q);
        for(int i=0;i<quantidade;i++){
            lst[c]=produto;
            cNext++;
            c= cNext;
        }

    }

    @Override
    public void listarProdutos() {
        for (Produto x : lst){
            if (x==null) break;
            System.out.println(x.toString());
        }

    }

    @Override
    public double calcularTotal() {
        double t = 0;
        double p;

        for (Produto x : lst){
            if (x==null) break;
            if(x instanceof ProdutoComDesconto y){
               p = y.getPreco()*((double) y.getDescont() /100);
               t += p;
            }
            p = x.getPreco();
            t += p;
        }
        return t;
    }
}
