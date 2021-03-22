package lista4.br.uff.ic.poo.ex4;

public class Circulo extends Figura{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
        this.calculaArea();
        this.calculaPerimetro();
    }

    public double diametro(){
        return 2 * raio;
    }

    public void calculaArea(){
        double area = Math.PI * this.raio * this.raio;
        this.setArea(area);
    }

    public void calculaPerimetro(){
        double perimetro = 2 * Math.PI * this.raio;
        this.setPerimetro(perimetro);
    }
}
