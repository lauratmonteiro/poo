package lista4.br.uff.ic.poo.ex3;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public Pessoa getPai(){
        return this.pai;
    }

    public Pessoa getMae(){
        return this.mae;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + '\n' +
                "Idade: " + this.idade + '\n' +
                "Pai: " + this.pai + '\n' +
                "Mae: " + this.mae;
    }
}
