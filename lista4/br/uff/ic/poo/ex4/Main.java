package lista4.br.uff.ic.poo.ex4;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------");

        Figura c = new Circulo(1.5);
        System.out.println(c.getArea());

        System.out.println("-----------------------------------------");

        Figura t = new Triangulo(6, 9);
        System.out.println(t.getArea());

        System.out.println("-----------------------------------------");

        Figura r = new Retangulo(5, 7);
        System.out.println(r.getArea());

        System.out.println("-----------------------------------------");

        Figura q = new Quadrado(4);
        System.out.println(q.getArea());

    }


}
