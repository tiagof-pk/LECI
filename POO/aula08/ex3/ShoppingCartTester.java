package aula08.ex3;

import aula08.ex3.Class.CarrinhoDeCompras;
import aula08.ex3.Class.Produto;
import aula08.ex3.Class.ProdutoComDesconto;
import aula08.ex3.Class.ProdutoGenerico;

public class ShoppingCartTester {
    public static void main(String[] args) {
        Produto p1 = new ProdutoGenerico("Camisolas", 10, 3);
        Produto p2 = new ProdutoGenerico("Calças", 30, 1);
        Produto p3 = new ProdutoComDesconto("Sapatilhas", 50, 2, 50);
        Produto p4 = new ProdutoComDesconto("Casacos", 100, 1, 10);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(p1, 1);
        carrinho.adicionarProduto(p2, 5);
        carrinho.adicionarProduto(p3, 2);
        carrinho.adicionarProduto(p4, 1);

        carrinho.listarProdutos();
        System.out.printf("Preço total da compra %.2f\n", carrinho.calcularTotal());
    }
}
