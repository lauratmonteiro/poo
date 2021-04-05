package lista5.br.uff.ic.poo.ex5;

public class ItemVenda implements Recebivel{
    String produto;
    int quantidade;
    double precoUnitario;

    public ItemVenda(String produto, int quantidade, double precoUnitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double totalizarReceita(){
        return this.quantidade * this.precoUnitario;
    }

    @Override
    public String toString() {
        return "Produto: " + this.produto + '\n' +
                "Quantidade: " + this.quantidade + '\n' +
                "Preco unitario=" + this.precoUnitario + '\n' +
                "Receita: " + this.totalizarReceita();
    }
}
