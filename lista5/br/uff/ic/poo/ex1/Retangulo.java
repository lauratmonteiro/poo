package lista5.br.uff.ic.poo.ex1;

public class Retangulo extends FormaGeometrica{
    float lado1, lado2;

    public void calcularArea(float lado1, float lado2){
        this.area = this.lado1 * this.lado2;
    }
    public void calcularPerimetro(float lado1, float lado2){
        this.perimetro = this.lado1 * 2 + this.lado2 * 2;
    }
}
