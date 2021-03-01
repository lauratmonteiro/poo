import java.util.ArrayList;

public class Baralho {
    ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho(){
        String[] valor = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] naipe = {"Copas", "Paus", "Ouro", "Espada"};
        for(String n : naipe){
            for(String v : valor){
                Carta carta = new Carta(v, n);
                this.cartas.add(carta);
            }
        }
    }
}
