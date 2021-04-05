package lista5.br.uff.ic.poo.ex1;

public class Quadrado extends Retangulo {
    float lado;

    public void calcularArea(float lado){
        this.area = (float) Math.pow(this.lado, 2);
    }

    public void calcularPerimetro(float lado){
        this.perimetro = this.lado * 4;
    }
}
