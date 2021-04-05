package lista5.br.uff.ic.poo.ex3;

import lista5.br.uff.ic.poo.ex2.*;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> lista = new ArrayList<>();

        Bicicleta bike1 = new Bicicleta("Preto", 30);
        Bicicleta bike2 = new Bicicleta("Roxo", 39);

        Carro carro1 = new Carro("Gasolina", 1.4, 44410.0);
        Carro carro2 = new Carro("Etanol", 1.6, 24450.1);

        Construcao const1 = new Construcao(3, true, 4, false);
        Construcao const2 = new Construcao(6, false, 7, true);

        lista.add(bike1);
        lista.add(bike2);
        lista.add(carro1);
        lista.add(carro2);
        lista.add(const1);
        lista.add(const2);

        for(CarbonFootprint l : lista){
            System.out.println(l.toString());
        }

        Casa casa = new Casa(2, false, 1, true);
        Escola escola = new Escola(250, true, 10, false);

        lista.add(casa);
        lista.add(escola);

        //O programa continuara funcionando pois todas as classes implementam a interface CarbonFootprint.
    }


}
