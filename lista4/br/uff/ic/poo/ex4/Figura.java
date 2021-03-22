package lista4.br.uff.ic.poo.ex4;

public class Figura{
    protected String forma;
    protected double area;
    protected double perimetro;

    public String getForma(){
        return this.forma;
    }

    public void setForma(String forma){
        this.forma = forma;
    }

    public double getArea(){
        return this.area;
    }

    protected void setArea(double area){
        this.area = area;
    }


    public double getPerimetro(){
        return this.perimetro;
    }

    protected void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }

}
