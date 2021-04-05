package lista5.br.uff.ic.poo.ex4;

public abstract class Funcionario {
    String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }

    public abstract double folhaPagamento();
}
