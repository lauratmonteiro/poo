package lista4.br.uff.ic.poo.ex4;

public class Retangulo extends Figura{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.calculaArea();
        this.calculaPerimetro();
    }

    public void calculaArea(){
        double area = this.base * this.altura;
        this.setArea(area);
    }

    public void calculaPerimetro(){
        double perimetro = (this.base * 2) + (this.altura * 2);
        this.setPerimetro(perimetro);
    }
}
