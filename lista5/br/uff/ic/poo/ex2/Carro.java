package lista5.br.uff.ic.poo.ex2;

public class Carro implements CarbonFootprint {
    String combustivel;
    double cilindrada;
    double km;

    public Carro(String combustivel, double cilindrada, double km){
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
        this.km = km;
    }

    public void ligarCarro(){
        System.out.println("O carro esta ligado\n");
    }

    public void desligarCarro(){
        System.out.println("O carro esta desligado\n");
    }

    public void dirigir(){
        System.out.println("Voce esta dirigindo\n");
    }

    @Override
    public double getCarbonFootprint() {
        if (this.combustivel == "Gasolina") {
            if (this.cilindrada >= 1 && this.cilindrada <= 1.5) return km * 0.13;
            else return km * 0.17;
        } else if (this.combustivel == "Etanol") {
            if (this.cilindrada >= 1 && this.cilindrada <= 1.5) return km * 0.001;
            else return km * 0.002;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Combustivel:" + this.combustivel + '\n' +
                "Cilindrada: " + this.cilindrada + '\n' +
                "Kms rodados: " + this.km + '\n' +
                "Pegada de carbono: " + this.getCarbonFootprint();
    }
}
