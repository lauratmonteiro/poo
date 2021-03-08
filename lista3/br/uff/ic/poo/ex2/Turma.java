package br.uff.ic.poo.ex2;

import java.util.ArrayList;

public class Turma {
    ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList<Float> notas = new ArrayList<>();
    private Disciplina disciplina;
    private Professor professor;

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void adicionarNotas(float nota){
        this.notas.add(nota);
    }

    private void calculaMedia(){

    }
}
