package lista4.br.uff.ic.poo.ex4;

public class Quadrado extends Figura{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
        this.calculaArea();
        this.calculaPerimetro();
    }

    public void calculaArea(){
        double area = this.lado * this.lado;
        this.setArea(area);
    }

    public void calculaPerimetro(){
        double perimetro = this.lado * 4;
        this.setPerimetro(perimetro);
    }
}
