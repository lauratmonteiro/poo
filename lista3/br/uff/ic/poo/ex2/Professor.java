package br.uff.ic.poo.ex2;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private String cpf;
    private Inscricao inscricao;
    ArrayList<Turma> turmas = new ArrayList<>();

    public Professor(String nome, String cpf, Inscricao inscricao){
        this.nome = nome;
        this.cpf = cpf;
        this.inscricao = inscricao;
    }
}
