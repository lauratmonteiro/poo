package lista4.br.uff.ic.poo.ex1;

public class ConversaoDeUnidadesDeArea {

    public static double mQParaPeQ(double areaEmMetroQuadrado){
        double areaEmPeQuadrado = areaEmMetroQuadrado * 10.76;
        return areaEmPeQuadrado;
    }

    public static double peQParaMQ(double areaEmPeQuadrado){
        double areaEmMetroQuadrado = areaEmPeQuadrado / 10.76;
        return areaEmMetroQuadrado;
    }

    public static double peQParaCmQ(double areaEmPeQuadrado){
        double areaEmCmQuadrado = areaEmPeQuadrado * 929;
        return areaEmCmQuadrado;
    }

    public static double cmQParaPeQ(double areaEmCmQuadrado){
        double areaEmPeQuadrado = areaEmCmQuadrado / 929;
        return areaEmPeQuadrado;
    }

    public static double milhaQParaAcre(double areaEmMilhaQuadrada){
        double areaEmAcre = areaEmMilhaQuadrada * 640;
        return areaEmAcre;
    }

    public static double acreParaMilhaQ(double areaEmAcre){
        double areaEmMilhaQuadrada = areaEmAcre / 640;
        return areaEmMilhaQuadrada;
    }

    public static double acreParaPeQ(double areaEmAcre){
        double areaEmPeQuadrado = areaEmAcre * 43560;
        return areaEmPeQuadrado;
    }

    public static double peQParaAcre(double areaEmPeQuadrado){
        double areaEmAcre = areaEmPeQuadrado / 43560;
        return areaEmAcre;
    }
}
