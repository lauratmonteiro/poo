package lista5.br.uff.ic.poo.ex2;

public class Bicicleta implements CarbonFootprint {
    String cor;
    int aro;

    public Bicicleta(String cor, int aro){
        this.cor = cor;
        this.aro = aro;
    }

    public void pedalar(){
        System.out.println("Vc esta pedalando!\n");
    }

    public void pintar(String cor){
        this.cor = cor;
        System.out.println("A bicicleta foi pintada de " + cor);
    }

    @Override
    public double getCarbonFootprint() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cor: " + this.cor + '\n' +
                "Aro: " + this.aro + '\n' +
                "Pegada de carbono: " + this.getCarbonFootprint();
    }
}
