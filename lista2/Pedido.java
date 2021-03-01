import java.util.ArrayList;

public class Pedido {
    String pagamento;
    ArrayList<Item> itens = new ArrayList<>();

    public Pedido(String pagamento){
        this.pagamento = pagamento;
    }

    public void adicionarItemAoCarrinho(Item item){
        this.itens.add(item);
    }
}
