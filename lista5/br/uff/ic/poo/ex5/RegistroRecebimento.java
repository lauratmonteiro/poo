package lista5.br.uff.ic.poo.ex5;

import java.util.ArrayList;

public class RegistroRecebimento{
    public static void main(String[] args) {
        ArrayList<Recebivel> registros = new ArrayList();

        ItemVenda item1 = new ItemVenda("Parabrisa", 1, 300);
        ItemVenda item2 = new ItemVenda("Retrovisor", 2, 50);
        Servico serv1 = new Servico("Troca de parabrisa", 2, 70);
        Servico serv2 = new Servico("Conserto de carro", 3, 85);

        registros.add(item1);
        registros.add(item2);
        registros.add(serv2);
        registros.add(serv2);

        for(Recebivel r : registros){
            System.out.println(r.toString());
        }
    }
}
