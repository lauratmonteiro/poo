public class Carta {
    String valor;
    String naipe;

    public Carta(String valor, String naipe){
        this.valor = valor;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return this.valor + " - " + this.naipe;
    }
}
