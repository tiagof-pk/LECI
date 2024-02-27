package aula08.ex3.Class;

public interface Produto {
    String getNome();
    double getPreco();
    int getQuantidade();
    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
    void setQuantidade(int quantidade);
    String toString();
}
