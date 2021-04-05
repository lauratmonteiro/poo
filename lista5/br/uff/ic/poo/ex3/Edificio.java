package lista5.br.uff.ic.poo.ex3;

import lista5.br.uff.ic.poo.ex2.CarbonFootprint;

public abstract class Edificio implements CarbonFootprint {
    int numPessoas;
    boolean usoEnergiaRenovavel;
    int numLampadas;
    boolean usoArCondicionado;

    public Edificio(int numPessoas, boolean usoEnergiaRenovavel, int numLampadas,
                    boolean usoArCondicionado){
        this.numPessoas = numPessoas;
        this.usoEnergiaRenovavel = usoEnergiaRenovavel;
        this.numLampadas = numLampadas;
        this.usoArCondicionado = usoArCondicionado;
    }

    public void acenderLuz(){
        this.numLampadas += 1;
    }

    public void apagarLuz(){
        if (numLampadas > 0) {
            this.numLampadas -=1;
        }
        this.numLampadas = 0;
    }

    public void ligarAr(){
        this.usoArCondicionado = true;
    }

    public void desligarAr(){
        this.usoArCondicionado = false;
    }

    @Override
    public double getCarbonFootprint() {
        if (!this.usoEnergiaRenovavel) {
            if (usoArCondicionado) {
                return (this.numLampadas * 2.9 + this.numPessoas * 30 + 130) * 0.075 + (2.0671 * this.numPessoas * 4);
            } else {
                return (this.numLampadas * 2.9 + this.numPessoas * 30) * 0.075 + (2.0671 * this.numPessoas * 4);
            }
        }
        return 2.0671 * this.numPessoas * 4;
    }

    @Override
    public String toString() {
        return "Numero de pessoas: " + this.numPessoas + "\n" +
                "Uso de energia renovavel: " + this.usoEnergiaRenovavel + '\n' +
                "Numero de lampadas acesas: " + this.numLampadas + '\n' +
                "Uso de ar condicionado: " + this.usoArCondicionado + '\n' +
                "Pegada de carbono: " + this.getCarbonFootprint();
    }
}
