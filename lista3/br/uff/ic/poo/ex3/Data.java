package br.uff.ic.poo.ex3;

import java.lang.Math;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro",
            "Novembro", "Dezembro"};

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(String mes, int dia, int ano){
        for(int i = 0; i < this.meses.length; i++){
            if(this.meses[i] == mes){
                this.mes = i+1;
                break;
            }
        }
        this.dia = dia;
        this.ano = ano;
    }

    public Data(int dia, int ano){
        this.ano = ano;
        this.mes = (int) Math.round(dia/30.0);
        this.dia = dia-((this.mes-1)*30);

    }

    public void imprimirDDMMAA(){
        System.out.printf("%02d/%02d/%d\n", this.dia, this.mes, this.ano);
    }

    public void imprimirDDDAAAA(){
        System.out.printf("%03d %d\n", this.dia+(this.mes-1)*30, this.ano);
    }

    public void imprimirMesDDAAAA(){
        System.out.printf("%s %02d, %d\n", this.meses[this.mes-1], this.dia, this.ano);
    }
}
