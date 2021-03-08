package br.uff.ic.poo.ex2;

public class Disciplina {
    private String codigo;
    private Turma turma;
    private String horario;
    private String ementa;

    public Disciplina(String codigo, Turma turma, String horario, String ementa){
        this.codigo = codigo;
        this.turma = turma;
        this.horario = horario;
        this.ementa = ementa;
    }

    public String getHorario(){
        return this.horario;
    }

    public String exibirEmenta(){
        return ementa;
    }
}
