package aula08.ex3.Class;

import java.sql.SQLOutput;

public class ProdutoGenerico implements Produto {

    private  String nome;
    private int quantidade;
    private int nextQuantidade = 0;
    private double preco;

    public ProdutoGenerico(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void adicionarQuantidade(int quantidade) {
        if (quantidade>=0){
            this.nextQuantidade = quantidade;
            this.quantidade += this.nextQuantidade;
        }

    }

    @Override
    public void removerQuantidade(int quantidade) {
        if (quantidade>=0){
            this.nextQuantidade = quantidade;
            this.quantidade -= this.nextQuantidade;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        System.out.println();
        System.out.printf("%-10s", "Produto","Quantidade","Preço");
        return nome + ":" + "       quantidade=" + quantidade +", preco=" + preco + '}';
    }
}
