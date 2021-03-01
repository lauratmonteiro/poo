import java.util.ArrayList;

public class Mercado {
    ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    public void vender(Pedido pedido){
        for(Item i : pedido.itens){
            for(Produto p : this.produtos){
                if(i.produto.nome == p.nome){
                    if(p.qtdEstoque >= i.qtd){
                        p.qtdEstoque -= i.qtd;
                    }
                }
            }
        }
    }
}
