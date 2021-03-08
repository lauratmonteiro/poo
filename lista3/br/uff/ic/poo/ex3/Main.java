package br.uff.ic.poo.ex3;

public class Main {
    public static void main(String[] args){
        Data data1 = new Data(15, 12, 1994);
        data1.imprimirMesDDAAAA();

        Data data2 = new Data(30, 1994);
        data2.imprimirDDMMAA();

        Data data3 = new Data("Fevereiro", 21,2000);
        data3.imprimirDDDAAAA();

        Data data4 = new Data(15, 03, 2020);
        data4.imprimirDDMMAA();

        Data data5 = new Data(365, 1990);
        data5.imprimirDDDAAAA();

        Data data6 = new Data("Agosto", 3, 1965);
        data6.imprimirMesDDAAAA();


    }
}
