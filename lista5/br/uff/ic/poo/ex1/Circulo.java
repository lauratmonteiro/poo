package lista5.br.uff.ic.poo.ex1;

public class Circulo extends FormaGeometrica {
    float raio;

    public void calcularArea(float raio){
        this.area = (float) (Math.PI * Math.pow(raio, 2));
    }

    public void calcularPerimetro(float raio){
        this.perimetro = (float) (2*Math.PI * raio);
    }
}
