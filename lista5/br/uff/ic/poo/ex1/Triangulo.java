package lista5.br.uff.ic.poo.ex1;

public class Triangulo extends FormaGeometrica{
    float base;
    float altura;
    float lado1, lado2, lado3;

    public void calcularArea(){
        this.area = this.base * this.altura;
    }

    public void calcularPerimetro(float lado1, float lado2, float lado3){
        this.perimetro = this.lado1 + this.lado2 + this.lado3;
    }

}
