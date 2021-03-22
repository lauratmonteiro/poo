package lista4.br.uff.ic.poo.ex1;

public class Main {
    public static void main(String[] args) {

        double areaCampoFut = 8250;
        double areaCampoPeQ = ConversaoDeUnidadesDeArea.mQParaPeQ(areaCampoFut);
        double areaCampoAcres = ConversaoDeUnidadesDeArea.peQParaAcre(areaCampoPeQ);
        double areaCampoCmQ = ConversaoDeUnidadesDeArea.peQParaCmQ(areaCampoPeQ);

        System.out.println("-----------------------------------------");

        System.out.printf("Metro para Pe Quadrado: %.2f\n", areaCampoPeQ);
        System.out.printf("Pe Quadrado para Acre: %.2f\n", areaCampoAcres);
        System.out.printf("Pe Quadrado para Cm Quadrado: %.2f\n", areaCampoCmQ);

        System.out.println("-----------------------------------------");
    }
}
