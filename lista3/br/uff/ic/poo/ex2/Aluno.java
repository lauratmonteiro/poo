package br.uff.ic.poo.ex2;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String cpf;
    private Inscricao inscricao;
    ArrayList<Float> notas = new ArrayList<>();
    private float cr;

    public Aluno(String nome, String cpf, Inscricao inscricao){
        this.nome = nome;
        this.cpf = cpf;
        this.inscricao = inscricao;
    }

    public void calcularCr(){

    }

    public void exibirHistorico(){

    }
}
