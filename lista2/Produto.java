public class Produto {
    String nome;
    double preco;
    int qtdEstoque = 0;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque += 1;
    }
}
