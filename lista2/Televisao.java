public class Televisao{
    boolean estaLigada;
    boolean estaMutada;
    int canal;
    int volume;

    public Televisao(){
        this.estaLigada = false;
        this.canal = 4;
        this.volume = 5;
    }
    public void ligar(){
        this.estaLigada = true;
    }

    public void desligar(){
        this.estaLigada = false;
    }

    public void mudarCanal(int canal){
        if(this.estaLigada){
            if(canal > 99 || canal < 0){
                return;
            }
            this.canal = canal;
        }
    }

    public void proximoCanal(){
        if(this.estaLigada){
            if(this.canal == 99){
                return;
            }
            this.canal += 1;
        }
    }

    public void canalAnterior(){
        if(this.estaLigada) {
            if (this.canal == 0) {
                return;
            }
            this.canal -= 1;
        }
    }

    public void aumentarVolume() {
        if (this.estaLigada) {
            if(this.volume == 10){
                return;
            }
            this.volume += 1;
        }
    }

    public void diminuirVolume() {
        if (this.estaLigada) {
            if(this.volume == 0){
                return;
            }
            this.volume -= 1;
        }
    }

    public void mutar(){
        if(this.estaLigada){
            this.estaMutada = true;
        }
    }

    public void desmutar(){
        if(this.estaLigada){
            this.estaMutada = false;
        }
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "estaLigada=" + estaLigada +
                ", estaMutada=" + estaMutada +
                ", canal=" + canal +
                ", volume=" + volume +
                '}';
    }
}