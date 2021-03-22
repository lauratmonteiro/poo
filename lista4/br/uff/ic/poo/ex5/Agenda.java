package lista4.br.uff.ic.poo.ex5;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> pessoas = new ArrayList();

    public void addContato(Pessoa pessoa){
        for(Pessoa p : this.pessoas){
            if(p.getChave() == pessoa.getChave()){
                return;
            }
        }
        this.pessoas.add(pessoa);
    }

    public void listarContatos(){
        for(Pessoa p : this.pessoas){
            System.out.println(p);
        }
    }

    public void imprimirContato(String chave){
        for(Pessoa p : this.pessoas){
            if(p.getChave() == chave){
                System.out.println(p);
                break;
            }
        }
    }

}
