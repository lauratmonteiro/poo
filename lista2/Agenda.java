import java.util.ArrayList;

public class Agenda{
    ArrayList<Contato> contatos = new ArrayList();

    public void adicionarContato(Contato contato){
        this.contatos.add(contato);
    }

    public void removerContato(Contato contato){
        this.contatos.remove(contato);
    }
}