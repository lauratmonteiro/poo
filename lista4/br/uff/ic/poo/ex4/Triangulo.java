package lista4.br.uff.ic.poo.ex4;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.calculaArea();
        this.calculaPerimetro();
    }

    public void calculaArea(){
        double area = (this.base * this.altura)/2;
        this.setArea(area);
    }

    public void calculaPerimetro(){
        double perimetro = this.base * 3;
        this.setPerimetro(perimetro);
    }
}
