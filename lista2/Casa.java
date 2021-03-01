import java.util.ArrayList;

public class Casa{

    ArrayList<Porta> portas = new ArrayList();

    public void addPorta(Porta porta){
        this.portas.add(porta);
    }

    public void quantasPortasEstaoAbertas(){
        int qtdPortasAbertas = 0;
        for(Porta p : portas){
            if(p.getEstaAberta()) qtdPortasAbertas++;
        }
        System.out.println(qtdPortasAbertas + " portas estao abertas.");
    }
}

